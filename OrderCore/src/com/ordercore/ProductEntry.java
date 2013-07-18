package com.ordercore;

public class ProductEntry {
	protected int mSize;
	protected int mPrice;
	
	public ProductEntry(int size, int price)
	{
		mSize	= size;
		mPrice	= price;
	}
	
	public int GetSize()
	{
		return mSize;
	}
	
	public int GetPrice()
	{
		return mPrice;
	}
}
