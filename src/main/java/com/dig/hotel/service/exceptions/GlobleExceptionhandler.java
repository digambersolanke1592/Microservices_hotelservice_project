package com.dig.hotel.service.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionhandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,Object>> notFoundHandler(ResourceNotFoundException exe )
	{//if we dont want to take payloader class like userservice microservice for ApiResponse then do below steps
		
       Map map = new HashMap<>();
	   map.put("message", exe.getMessage());
	   map.put("success",false);
	   map.put("status",HttpStatus.NOT_FOUND);
	
	   return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
}
}