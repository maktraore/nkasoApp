package com.hayaservices.model;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Sale {
	private int    saleId;
	private String full_name;
	private String email;
	private String phoneNumber;
	private String countryFrom;
	private double amount;
	private Date   date;
	private double commission;
	private String type;
	private double remBalance;
	
}
