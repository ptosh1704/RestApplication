package com.amex.restaurant.model;

public class MenuItems {
	//  Cola - Cold – 50 cents
    //	·        Coffee - Hot - $1.00
    //	·        Cheese Sandwich - Cold - $2.00
    //	·        Steak Sandwich - Hot - $4.50
	
	Double price;
	String name;
	boolean isbvg;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsbvg() {
		return isbvg;
	}
	public void setIsbvg(boolean isbvg) {
		this.isbvg = isbvg;
	}
	@Override
	public String toString() {
		return "MenuItems [price=" + price + ", name=" + name + ", isbvg=" + isbvg + "]";
	}
	public MenuItems(Double price, String name, boolean isbvg) {
		super();
		this.price = price;
		this.name = name;
		this.isbvg = isbvg;
	}
	
	
	
	
	

}
