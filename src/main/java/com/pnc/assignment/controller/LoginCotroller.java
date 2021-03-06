package com.pnc.assignment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pnc.assignment.response.UserInfo;
import com.pnc.assignment.service.LoginService;

@RestController
@RequestMapping("login")
public class LoginCotroller {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("location")
	private String getGeoLocation(@Valid @RequestBody  UserInfo info) {
		return loginService.getGeoLocation(info);
		
	}

}
