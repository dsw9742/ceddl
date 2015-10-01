package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.cart.Price;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.product.ProductInfo;

public interface Item {

	public ProductInfo getProductInfo();
	public Category getCategory();
	public int getQuantity();
	public Price getPrice();
	public Product[] getLinkedProduct();
	public Attributes getAttributes();
	
	public static interface Builder {
		
		public Builder productInfo();
		public Builder category();
		public Builder quantity();
		public Builder price();
		public Builder linkedProduct();
		public Builder attributes();
		
		public Item build();
		
	}
	
}
