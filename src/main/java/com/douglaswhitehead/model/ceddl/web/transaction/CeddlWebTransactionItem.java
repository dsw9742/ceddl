package com.contentualize.model.ceddl.web.transaction;

import com.contentualize.model.ceddl.web.product.CeddlWebProduct;
import com.contentualize.model.ceddl.web.product.CeddlWebProductCategory;
import com.contentualize.model.ceddl.web.product.CeddlWebProductInfo;

public interface CeddlWebTransactionItem {

	public CeddlWebProductInfo getProductInfo();
	public CeddlWebProductCategory getCategory();
	public int getQuantity();
	public CeddlWebTransactionItemPrice getPrice();
	public CeddlWebProduct[] getLinkedProduct();
	public CeddlWebTransactionItemAttributes getAttributes();
	
	public static interface Builder {
		
		public Builder productInfo();
		public Builder category();
		public Builder quantity();
		public Builder price();
		public Builder linkedProduct();
		public Builder attributes();
		
		public CeddlWebTransactionItem build();
		
	}
}
