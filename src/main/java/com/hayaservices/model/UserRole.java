package com.hayaservices.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class UserRole {
	private int userId;
	private int roleId;
}
