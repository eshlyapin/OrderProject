package com.ordercore;

import java.util.List;

public class SimpleOrderFormat implements OrderFormat {
	
	@Override
	public String GetReport(String address, String phone, List<CartItem> items) {
		String report = "";
		report += address + "\n";
		report += phone + "\n";
		
		for (CartItem cartItem : items) {
			report += cartItem.GetName() + " size:";
			report += cartItem.GetSize() + "\n";
		}		
		return report;
	}
	
}
