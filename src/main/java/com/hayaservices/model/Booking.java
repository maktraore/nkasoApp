package com.hayaservices.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
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
    @JoinColumn(name = "userId")
    private User user;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;
	
	private String comingFrom;
	@CreationTimestamp
	private Date bookingDate;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String stayLength;
	private String amount;
	private int numberOfPeople;
	private String bookingStatus;
	private String reason;
	private String confirmation;
	private String referredBy;
	private String adminComment;
}
