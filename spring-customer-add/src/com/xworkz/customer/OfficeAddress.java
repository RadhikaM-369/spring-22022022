package com.xworkz.customer;

import org.springframework.stereotype.Component;

@Component
public class OfficeAddress extends AbstractAddress implements Address{

	@Override
	public void displayDetails() {
		System.out.println("-----------Office Address------------");
		System.out.println("Street = "+ street);
		System.out.println("DoorNo = "+doorNo);
		System.out.println("City = "+city);
		System.out.println("-------------------------------------");
		
	}

	@Override
	public void setStreet(String street) {
		
	}

	@Override
	public void setDoorNo(String doorNo) {
		
	}

	@Override
	public void setCity(String city) {
		
	}

}
