package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.transaction.Transaction;
import com.douglaswhitehead.model.digitaldata.user.User;

public interface DigitalData {
	
	public String getPageInstanceId();
	
	public Page getPage();
	
	public Product[] getProduct();
	
	public Cart getCart();
	
	public Transaction getTransaction();
	
	public User[] getUser();
	
	public String getVersion();
	
}