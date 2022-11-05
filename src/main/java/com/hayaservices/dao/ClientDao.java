package com.hayaservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayaservices.model.Client;

public interface ClientDao extends JpaRepository<Client, Integer>{

}
