package com.microservice.doctor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/doctor")
public class DoctorController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?>sayHelloDoc(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Doctor Controller");
	}

	@RequestMapping(value = "/again-hello", method = RequestMethod.GET)
	public ResponseEntity<?>sayHelloAgainDoc(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Doctor Controller Again, how are you?");
	}

}
