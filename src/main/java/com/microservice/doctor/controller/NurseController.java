package com.microservice.doctor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/nurse")
public class NurseController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?>sayHelloNur(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Nurse Controller");
	}

	@RequestMapping(value = "/again-hello", method = RequestMethod.GET)
	public ResponseEntity<?>sayHelloAgainNur(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Nurse Controller Again, how are you?");
	}

}
