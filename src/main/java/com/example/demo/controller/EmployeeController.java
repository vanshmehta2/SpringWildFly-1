package com.example.demo.controller;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/api/employees")
@Slf4j
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@GetMapping
	public String getdata(){
		System.out.println("Hello world");
		System.out.println("Hello TNS");
		System.out.println("yes !! it is working");
		System.out.println("Testing successful");
		logger.info("save data request for new employee: id:"+ new Date());
		logger.error("server is not responding try again later");
		return "yes !! it is working";
	}
}
