package com.amex.restaurant.menurepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amex.restaurant.model.MenuItems;
import com.amex.restaurant.model.Order;

public class OrderRepo {
	private static Map<String, MenuItems> menulist = new HashMap<>();
	
	public static String buildMenu(MenuItems menu) {
		//convert into cents.
		
		Double price = menu.getPrice()*100;
		menu.setPrice(price);
		menulist.put(menu.getName(),menu);
		return "Items added successfully";
		
	}
	
	public static Double placeOrder(List<Order> order) {
		Double billamount=0.0;
		Double deduction =0.0;
		
		
		for(Order ord: order) {
			if(menulist.containsKey(ord.getName())) {
				billamount += menulist.get(ord.getName()).getPrice()*ord.getQuantity();
				if(menulist.get(ord.getName()).isIsbvg()) {
					deduction +=  (menulist.get(ord.getName()).getPrice()*ord.getQuantity())*(.1);
				}
				
			}
		}
		
		Double finalAmount = billamount-deduction;
		
		finalAmount = finalAmount/100;
		return finalAmount;
		
	}
	
	

}
