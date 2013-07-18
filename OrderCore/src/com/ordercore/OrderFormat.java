package com.ordercore;

import java.util.List;

public interface OrderFormat {
	String GetReport(String address, String phone, List<CartItem> items);
}
