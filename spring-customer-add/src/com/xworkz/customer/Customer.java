package com.xworkz.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("Ranjana")
private String name;
	
	@Autowired
	@Qualifier("homeAddress")
private Address address;	//home address
	
	@Autowired
private ECommerce ecommerce; 

public void order(String item) {
	this.address.displayDetails();
	this.ecommerce.orderItem(item);
}
}
