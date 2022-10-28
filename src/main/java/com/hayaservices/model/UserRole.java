package com.hayaservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userRoleId;
	private long userId;
	private int roleId;
}
