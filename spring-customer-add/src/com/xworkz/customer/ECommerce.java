package com.xworkz.customer;

import org.springframework.stereotype.Component;

@Component
public interface ECommerce {
void orderItem(String item);
void cancelItem(String item);
}
