package com.hayaservices.model;

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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long userId;
	
	@NotBlank
	@Size(max = 20)
	private String FirstName;
	
	@NotBlank
	@Size(max = 20)
	private String lastName;
	
	@NotBlank
	@Size(max = 50)
	private String email;
	
	@NotBlank
	@Size(max = 12, min = 8)
	private String phone;
	
	private double salary;
	
	@NotBlank
	@Size(max = 120)
	private String password;
	private boolean disabled;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean credentialsExpired;
	
	public User() {
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
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
	Set<Role> roles;
	

}
