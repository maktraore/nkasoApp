package com.hayaservices.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Hotel {
	private int hotelId;
	private String name;
	private String address;
	private String desc;
}
