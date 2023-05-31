package com.dig.hotel.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dig.hotel.service.Entity.Hotel;
import com.dig.hotel.service.exceptions.ResourceNotFoundException;
import com.dig.hotel.service.repositories.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String randomHotelId = UUID.randomUUID().toString();		
		hotel.setId(randomHotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !!!"));
	}

}
