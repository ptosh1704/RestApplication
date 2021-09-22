package com.amex.restaurant.MenuService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amex.restaurant.menurepository.OrderRepo;
import com.amex.restaurant.model.Bill;
import com.amex.restaurant.model.MenuItems;
import com.amex.restaurant.model.Order;

@RestController
public class MenuService {
	
	@GetMapping("/test")
	public String greetNamaste() {
		return "NAMASTE";
	}
	
	
	@PostMapping("/buildmenu")
	public String addMenuItems(@RequestBody MenuItems mi) {
		return OrderRepo.buildMenu(mi);
	}	
		
	@PostMapping("/buildOrder")
	public String placeAnOrder(@RequestBody Bill order) {
		Double finalAmount = OrderRepo.placeOrder(order.getOrders());
		
		StringBuilder orderlist =new StringBuilder();
		for(Order or : order.getOrders()) {
			orderlist.append(or.toString());
			orderlist.append("\n");
		}
		
		return orderlist.append(String.valueOf(finalAmount)).toString();
	}
		
		
	

}
