package com.hayaservices.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long   saleId;
	private String receiverName;
	private String SenderName;
	private String phoneNumber;
	private String countryFrom;
	private String quartier;
	private double amount;
	private Date   date;
	private String type;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
	
}
