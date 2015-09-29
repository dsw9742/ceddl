package com.douglaswhitehead.model.ceddl.web.cart;

import com.douglaswhitehead.model.ceddl.web.product.CeddlWebProduct;
import com.douglaswhitehead.model.ceddl.web.product.CeddlWebProductCategory;
import com.douglaswhitehead.model.ceddl.web.product.CeddlWebProductInfo;

public interface CeddlWebCartItem {

	public CeddlWebProductInfo getProductInfo();
	public CeddlWebProductCategory getCategory();
	public int getQuantity();
	public CeddlWebCartPrice getPrice();
	public CeddlWebProduct[] getLinkedProduct();
	public CeddlWebCartItemAttributesImpl getAttributes();
	
	public static interface Builder {
		
		public Builder productInfo();
		public Builder category();
		public Builder quantity();
		public Builder price();
		public Builder linkedProduct();
		public Builder attributes();
		
		public CeddlWebCartItem build();
		
	}
	
}
