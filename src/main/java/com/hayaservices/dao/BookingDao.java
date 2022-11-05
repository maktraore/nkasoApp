package com.hayaservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayaservices.model.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer>{

}
