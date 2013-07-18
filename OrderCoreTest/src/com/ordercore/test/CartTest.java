package com.ordercore.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import com.ordercore.Cart;
import com.ordercore.CartItem;
import com.ordercore.Pizza;
import com.ordercore.Product;
import com.ordercore.ProductEntry;

import android.test.AndroidTestCase;

public class CartTest extends AndroidTestCase {
	
	public void testItemAdding() throws Throwable
	{
		String name = "Pizza";
		String description = "desc";
		
		List<ProductEntry> entries = new ArrayList<ProductEntry>();
		entries.add(new ProductEntry(450, 300));
		entries.add(new ProductEntry(250, 200));
		entries.add(new ProductEntry(150, 100));
		
		Product pizza = new Pizza(name, description, null, entries);
		
		Cart cart = Cart.Instance;
		
		cart.AddItem(new CartItem(pizza, 0));
		cart.AddItem(new CartItem(pizza, 1));
		cart.AddItem(new CartItem(pizza, 2));
		
		Assert.assertTrue(cart.GetTotalPrice() == 600);
	}
}
