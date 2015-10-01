package com.douglaswhitehead.model.digitaldata.product;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

public interface Product {

	public ProductInfo getProductInfo();
	public Category getCategory();
	public Product[] getLinkedProduct();
	public Attributes getAttributes();
	
	public static interface Builder {
		
		public Builder productInfo();
		public Builder category();
		public Builder linkedProduct();
		public Builder attributes();
		
		public Product build();
		
	}
}
