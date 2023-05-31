package com.dig.hotel.service.services;

import java.util.List;

import com.dig.hotel.service.Entity.Hotel;

public interface HotelService {

	public Hotel createHotel(Hotel hotel);
	
	public List<Hotel> getAllHotel();
	
	public Hotel getHotelById(String id);
}
