package com.practice.SpringBootDemoApplication.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.SpringBootDemoApplication.model.UserLogin;


@RestController
public class UserController {

	@RequestMapping(path="/login", method = RequestMethod.GET)
	public ResponseEntity<List<UserLogin>> listUser(){
		return new ResponseEntity<List<UserLogin>>( HttpStatus.OK);
	
	}}

