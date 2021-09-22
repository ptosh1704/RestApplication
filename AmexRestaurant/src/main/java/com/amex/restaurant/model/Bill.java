package com.amex.restaurant.model;

import java.util.List;

public class Bill {
	 
	List<Order> orders;
  
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Bill [order=" +    ", orders=" + orders + "]";
	}
	public Bill(String order, List<Order> orders) {
		super();
		 
		this.orders = orders;
	}
	
	

}
