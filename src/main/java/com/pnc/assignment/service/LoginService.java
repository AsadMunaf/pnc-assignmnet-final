package com.pnc.assignment.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pnc.assignment.request.GeoLocation;
import com.pnc.assignment.response.UserInfo;

@Service
public class LoginService {

	public String getGeoLocation(UserInfo info) {
		String url = "http://ip-api.com/json/";
		RestTemplate restTemplate = new RestTemplate();
		GeoLocation result = restTemplate.getForObject(url, GeoLocation.class);
		if (result.getCity() != "CA") {
			UUID uuid = UUID.randomUUID();
			String uuidAsString = uuid.toString();

			return "UUID: " + uuidAsString + " Welcome " + info.getUsername() + " from " + result.getCity() ;
		} else {

			return "user is not eligible to register";
		}

	}

}
