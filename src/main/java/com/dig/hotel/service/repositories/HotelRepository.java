package com.dig.hotel.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dig.hotel.service.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
