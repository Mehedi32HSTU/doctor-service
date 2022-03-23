package com.microservice.doctor;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorServiceApplication {
	
	@GetMapping("/")
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok().body("DoctorServiceApplication is Running. Current server time : " + new Date().toString());
	}

	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}

}
