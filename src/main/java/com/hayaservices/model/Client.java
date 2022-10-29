package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long clientId;
	private String FirstName;
	private String lastName;
	private String email;
	private String phone;
	private String confirmation;
	private String password;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookings")
	private Set<Booking> bookings;

}
