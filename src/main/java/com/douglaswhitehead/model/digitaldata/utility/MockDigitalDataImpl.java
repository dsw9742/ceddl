package com.douglaswhitehead.model.digitaldata.utility;

import com.douglaswhitehead.model.digitaldata.DigitalData;
import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.cart.CartImpl;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.page.PageImpl;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.product.ProductImpl;
import com.douglaswhitehead.model.digitaldata.transaction.Transaction;
import com.douglaswhitehead.model.digitaldata.transaction.TransactionImpl;
import com.douglaswhitehead.model.digitaldata.user.User;
import com.douglaswhitehead.model.digitaldata.user.UserImpl;

/**
 * Mock implementation of DigitalData interface for testing purposes.
 */
public class MockDigitalDataImpl implements DigitalData {

	@Override
	public String getPageInstanceID() {
		return "mock-ceddl";
	}

	@Override
	public Page getPage() {
		return new PageImpl.Builder().build();
	}
	
	@Override
	public Product[] getProduct() {
		Product[] products = new Product[1];
		products[0] = new ProductImpl.Builder().build();
		return products;
	}
	
	@Override
	public Cart getCart() {
		return new CartImpl.Builder().build();
	}
	
	@Override
	public Transaction getTransaction() {
		return new TransactionImpl.Builder().build();
	}

	@Override
	public User[] getUser() {
		User[] users = new User[1];
		users[0] = new UserImpl.Builder().build();
		return users;
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

}
