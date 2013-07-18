package com.ordercore;

import java.util.List;

import android.graphics.Bitmap;

public class Pizza implements Product {

	String mName;
	String mDescription;
	Bitmap mImage;
	List<ProductEntry> mPriceTable;
	
	
	public Pizza(String name, String description, Bitmap image, List<ProductEntry> entries)
	{
		mName = name;
		mDescription = description;
		mImage = image;
		mPriceTable = entries;
	}
	
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return mName;
	}

	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return mDescription;
	}

	@Override
	public Bitmap GetImage() {
		// TODO Auto-generated method stub
		return mImage;
	}

	@Override
	public List<ProductEntry> GetPriceTable() {
		// TODO Auto-generated method stub
		return mPriceTable;
	}

}
