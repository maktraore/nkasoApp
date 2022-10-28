package com.hayaservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int imageId;
	
	private String imageName;
	private String imageUrl;
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "apart_id", nullable = false)
	private Apartment apartment;

}
