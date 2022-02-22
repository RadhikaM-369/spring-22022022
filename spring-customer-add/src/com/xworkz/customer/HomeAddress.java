package com.xworkz.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HomeAddress extends AbstractAddress implements Address{
	
	@Value("#1048")
	@Override
	public void setDoorNo(String doorNo) {
		this.doorNo=doorNo;	
	}
	@Value("Sarjerao Nagar")
	@Override
	public void setStreet(String street) {
		this.street=street;	
	}
	@Value("belagavi")
	@Override
	public void setCity(String city) {
		this.city=city;
	}
	@Override
	public void displayDetails() {
		System.out.println("-----------Home Address----------");
		System.out.println("Street = "+street);
		System.out.println("DoorNo = "+doorNo);
		System.out.println("City = "+city);
		System.out.println("--------------------------------");
	}
}
