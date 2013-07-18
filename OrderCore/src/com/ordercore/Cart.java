package com.ordercore;

import java.util.ArrayList;
import java.util.List;


public class Cart {
	public static final Cart Instance = new Cart();

	protected List<CartItem> mItemList = new ArrayList<CartItem>();
	protected int mTotalPrice = 0;


	public void AddItem(CartItem item) {
		mItemList.add(item);
		mTotalPrice += item.GetPrice();
	}

	public void RemoveItem(int index) {
		CartItem itemToRomve = mItemList.remove(index);
		mTotalPrice -= itemToRomve.GetPrice();
	}
	
	public void RemoveItem(CartItem item)
	{
		mItemList.remove(item);
		mTotalPrice -= item.GetPrice();	
	}


	public int GetTotalPrice()
	{
		return mTotalPrice;
	}
	
	public void Order(String address, String phone) {
		//OrderSender sender = new SmsSender(address, phone, itemList);
		//sender.Send();
	}	

	private Cart() {

	}
}
