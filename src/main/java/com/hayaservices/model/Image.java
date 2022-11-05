package com.hayaservices.model;

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

@Entity
@Setter @Getter
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long imageId;
	
	private String imageName;
	private String imageUrl;
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Room room;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "apartId", nullable = false)
	private Apartment apartment;

}
