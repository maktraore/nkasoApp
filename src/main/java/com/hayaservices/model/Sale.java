package com.hayaservices.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long    saleId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String countryFrom;
	private double amount;
	private Date   date;
	private double commission;
	private String type;
	private double remBalance;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
}
