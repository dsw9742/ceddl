package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.product.CeddlWebProduct;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProductCategory;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProductInfo;

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
