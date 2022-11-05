package com.hayaservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayaservices.model.Room;

public interface RoomDao extends JpaRepository<Room, Integer>{

}
