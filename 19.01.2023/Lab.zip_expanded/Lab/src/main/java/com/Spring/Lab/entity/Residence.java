package com.Spring.Lab.entity;

public class Residence {
	private String city;
	private String state;
	private String country;
	public Residence(String city,String state,String country) {
		
		this.city=city;
		this.state=state;
		this.country=country;
	}

	public String toString() {
		return "Residence [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
}
