package com.hayaservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayaservices.model.Sale;

public interface SaleDao extends JpaRepository<Sale, Long>{

}
