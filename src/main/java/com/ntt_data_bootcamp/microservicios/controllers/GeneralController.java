package com.ntt_data_bootcamp.microservicios.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
	
	Logger logger = LoggerFactory.getLogger(GeneralController.class);
	
	String status;
	String open = "open";
	String halfOpen = "half-open";
	String close = "close";
	
	@GetMapping("/open")
	public ResponseEntity<String> setToOpen(){
		status = open;
		logger.info("Estado del cliente: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/close")
	public ResponseEntity<String> setToClose(){
		status = close;
		logger.info("Estado del cliente: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);	
	}	
	
	@GetMapping("/half-open")
	public ResponseEntity<String> setToHalfOpen(){
		status = halfOpen;
		logger.info("Estado del cliente: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}

}
