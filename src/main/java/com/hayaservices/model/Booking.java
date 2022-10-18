package com.hayaservices.model;

import java.sql.Timestamp;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Booking {
	private int bookingId;
	private int roomId;
	private int hotelId;
	private int userId;
	private String fullName;
	private String phoneNumber;
	private String company;
	private String comingFrom;
	private Timestamp startDate;
	private Timestamp endDate;
	private String stayLength;
	private int numberOfPeople;
	private String bookingStatus;
	private String clientStatus;
	private String referredBy;
	private String adminComment;
}
