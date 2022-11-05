package com.hayaservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayaservices.model.Image;

public interface ImageDao extends JpaRepository<Image, Long> {

}
