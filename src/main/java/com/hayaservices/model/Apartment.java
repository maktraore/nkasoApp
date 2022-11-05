package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Apartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int apartId;
	private String name;
	private String address;
	private String description;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "apartment")
	private Set<Room> rooms;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "apartment")
	private Set<Image> images;

	
	
}
