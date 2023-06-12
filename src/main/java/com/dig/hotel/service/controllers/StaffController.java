package com.dig.hotel.service.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staffs")
public class StaffController { //to get this api from api-gateway we need to configure this api in application.yml file

	@GetMapping
	public ResponseEntity<List<String>> getStaffList (){
		
		List<String> stfList = Arrays.asList("ram","sham","tara","radha","sita");
		
		return new ResponseEntity<>(stfList,HttpStatus.OK);
		
		
	}
}
