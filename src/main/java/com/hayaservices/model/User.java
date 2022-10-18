package com.hayaservices.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class User {
	private int userId;
	private String FullName;
	private String email;
	private String phone;
	private String confirmation;
	private double salary;
	private String password;
	private boolean disabled;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean credentialsExpired;

}
