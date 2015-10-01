package com.douglaswhitehead.model.digitaldata.cart;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProduct;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProductCategory;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProductInfo;

public interface Item {

	public CeddlWebProductInfo getProductInfo();
	public CeddlWebProductCategory getCategory();
	public int getQuantity();
	public Price getPrice();
	public CeddlWebProduct[] getLinkedProduct();
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
