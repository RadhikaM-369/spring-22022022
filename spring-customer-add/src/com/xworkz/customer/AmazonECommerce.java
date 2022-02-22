package com.xworkz.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AmazonECommerce implements ECommerce{
	@Value("AmazonIndia")
	private String registeredOffice;
	
	@Value("200000")
	private int noOfEmployee;
	
	@Autowired
	@Qualifier("officeAddress")
	private Address address1;
	
	@Override
	public void orderItem(String item) {
		this.registeredOffice=registeredOffice;
		this.noOfEmployee=noOfEmployee;
	System.out.println("order delivered");			
	}
	

	@Override
	public void cancelItem(String item) {
	System.out.println("order cancelled");			
	}

}
