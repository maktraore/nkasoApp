package com.hayaservices.model;

import java.sql.Timestamp;

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
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long bookingId;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Room room;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;
	
	private String firstName;
	private String lastName;
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
