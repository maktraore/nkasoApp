package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roomId;
	
	private String name;
	private double price;
	private int capacity;
	private String code;
	private String description;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "room")
	private Set<Booking> bookings;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "room")
	private Set<Image> images;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "apartId", nullable = false)
	private Apartment apartment;
}
