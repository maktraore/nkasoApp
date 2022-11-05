package com.hayaservices.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.hayaservices.pojos.ERole;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roleId;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole roleName;

	public Role() {

	}

	public Role(ERole name) {
		this.roleName = name;
	}
}
