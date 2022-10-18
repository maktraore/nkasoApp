package com.hayaservices.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Role {
	private int roleId;
	private String roleName;
}
