package com.hayaservices.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Room {
	private int roomId;
	private String name;
	private double price;
	private int capacity;
	private String code;
	private String desc;
	private int hotelId;
	
}
