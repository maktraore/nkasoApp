package com.hayaservices.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long userId;
	private String FirstName;
	private String lastName;
	private String email;
	private String phone;
	private String confirmation;
	private double salary;
	private String password;
	private boolean disabled;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean credentialsExpired;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Booking> bookings;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Sale> sales;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "userRole", 
	joinColumns = @JoinColumn(name = "userId"), 
	inverseJoinColumns = @JoinColumn(name = "roleId"))
	List<Role> roles;
	

}
