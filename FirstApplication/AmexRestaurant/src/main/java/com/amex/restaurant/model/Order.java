package com.amex.restaurant.model;

public class Order {
	int quantity;
	String name;
	public int getQuantity() {
		return quantity;
	}
	public Order(int quantity, String name) {
		super();
		this.quantity = quantity;
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", name=" + name + "]";
	}

}
