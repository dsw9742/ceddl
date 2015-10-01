package com.douglaswhitehead.model.digitaldata.cart;

import com.douglaswhitehead.model.digitaldata.common.Attributes;

public interface Cart {

	public String getCartID();
	public Price getPrice();
	public Attributes getAttributes();
	public Item[] getItem();
	
	public static interface Builder {
		
		public Builder cartID();
		public Builder price();
		public Builder attributes();
		public Builder item();
		
		public Cart build();
		
	}
}
