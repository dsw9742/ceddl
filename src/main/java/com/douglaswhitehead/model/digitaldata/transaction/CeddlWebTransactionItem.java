package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.common.Category;
import com.douglaswhitehead.model.digitaldata.product.ProductInfo;

public interface CeddlWebTransactionItem {

	public ProductInfo getProductInfo();
	public Category getCategory();
	public int getQuantity();
	public CeddlWebTransactionItemPrice getPrice();
	public Product[] getLinkedProduct();
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
