package com.ordercore;

import java.util.List;
import android.graphics.Bitmap;

public class CartItem implements Product {

	Product mProduct;
	ProductEntry mChosenEntry;

	public CartItem(Product product, ProductEntry entry)
	{
		mProduct		= product;
		mChosenEntry	= entry;
	}
	
	public CartItem(Product product, int entryIndex) throws IndexOutOfBoundsException
	{
		mProduct = product;
		
		List<ProductEntry> entries = product.GetPriceTable();
		mChosenEntry = entries.get(entryIndex);
	}
	
	public int GetPrice()
	{
		return mChosenEntry.GetPrice();
	}
	
	public int GetSize()
	{
		return mChosenEntry.GetSize();
	}
	
		
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return mProduct.GetName();
	}

	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return mProduct.GetDescription();
	}

	@Override
	public Bitmap GetImage() {
		// TODO Auto-generated method stub
		return mProduct.GetImage();
	}

	@Override
	public List<ProductEntry> GetPriceTable() {
		// TODO Auto-generated method stub
		return mProduct.GetPriceTable();
	}

}
