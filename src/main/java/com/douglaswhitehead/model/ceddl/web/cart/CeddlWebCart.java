package com.contentualize.model.ceddl.web.cart;

public interface CeddlWebCart {

	public String getCartID();
	public CeddlWebCartPrice getPrice();
	public CeddlWebCartAttributes getAttributes();
	public CeddlWebCartItem[] getItem();
	
	public static interface Builder {
		
		public Builder cartID();
		public Builder price();
		public Builder attributes();
		public Builder item();
		
		public CeddlWebCart build();
		
	}
}
