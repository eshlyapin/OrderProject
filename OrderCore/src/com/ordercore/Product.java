package com.ordercore;

import java.util.List;
import android.graphics.Bitmap;


public interface Product {	
	
	String GetName();
	String GetDescription();
	Bitmap GetImage();	
	List<ProductEntry> GetPriceTable();
}
