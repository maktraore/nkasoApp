package com.hayaservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hayaservices.model.Apartment;
import com.hayaservices.services.ApartService;

@RestController("hayaservices")
public class MainController {
	
	@Autowired
	ApartService apartService;
	
	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping({ "/nkaso/apartments" })
	public List<Apartment> findAllApartments() {
		return apartService.findAllApartments();
	}
	@RequestMapping({ "/nkaso/apartments/{apartId}" })
	public Apartment find(@PathVariable int apartId) {
		return apartService.findApartment(apartId);
	}

}
