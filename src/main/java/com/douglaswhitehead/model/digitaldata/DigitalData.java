package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.event.Event;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.transaction.Transaction;
import com.douglaswhitehead.model.digitaldata.user.User;

public interface DigitalData {
	
	public String getPageInstanceID();
	public Page getPage();
	public Product[] getProduct();
	public Cart getCart();
	public Transaction getTransaction();
	public Event[] getEvent();
	public User[] getUser();
	public String getVersion();
	
	public static interface Builder {
		
		public Builder pageInstanceID();
		public Builder page();
		public Builder product();
		public Builder cart();
		public Builder transaction();
		public Builder event();
		public Builder user();
		public Builder version();
		
		public DigitalData build();
		
	}
	
}