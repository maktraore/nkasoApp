package com.hayaservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hayaservices.dao.ApartDao;
import com.hayaservices.model.Apartment;
import com.hayaservices.pojos.Message;

@Service
public class ApartService {
	
	@Autowired
	ApartDao aDao;
	
	@Autowired
	Message m;
	
	public List<Apartment> findAllApartments() {
		return aDao.findAll();
	}
	
	public Apartment findApartment(int id) {
		return aDao.findById(id).get();
	}
	
	public Message addApart(@RequestBody Apartment apartment ) {
		try {
			aDao.save(apartment);
			m.setInfo("Apartment created");
		}catch(Exception ex) {
			m.setInfo("Eror while adding apartment");
		}
		return m;
	}
	
	public Message updateApart(@RequestBody Apartment apartment) {
		try {
			aDao.save(apartment);
			m.setInfo("Apartment info updated!");
		}catch(Exception ex ) {
			m.setInfo("Error while updating " + ex);
		}
		return m;
	}
	
	public Message deleteApart(int id) {
		if (aDao.existsById(id)) {
			Apartment a =  findApartment(id);
			try {
				aDao.deleteById(id);
				m.setInfo(a.getName()+" was deleted!!!");
			}catch(Exception ex) {
				m.setInfo("There was an error while deleting: "+ ex);
			}
		} else {
			m.setInfo("Apartment does not exist");
		}
		return m;
	}

}
