package com.pnc.assignment.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pnc.assignment.response.UserInfo;

@RestController
@RequestMapping("login")
public class LoginCotroller {
	
	@PostMapping("location")
	private String getGeoLocation(@Valid @RequestBody  UserInfo info) {
		return "inside getGeoLocation "  + info.getUsername();
	}

}
