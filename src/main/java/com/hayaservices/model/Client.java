package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long clientId;
	private String FirstName;
	private String lastName;
	private String email;
	private String phone;
	private String status;
	private String profile;
	private String company;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	private Set<Booking> bookings;

}
