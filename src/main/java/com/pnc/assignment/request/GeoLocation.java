package com.pnc.assignment.request;

public class GeoLocation {

	private String status;
	private String country;
	private String countryCode;
	private String region;
	private String regionName;
	private String city;

	public GeoLocation() {
		super();
	}

	public GeoLocation(String status, String country, String countryCode, String region, String regionName,
			String city) {
		super();
		this.status = status;
		this.country = country;
		this.countryCode = countryCode;
		this.region = region;
		this.regionName = regionName;
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}