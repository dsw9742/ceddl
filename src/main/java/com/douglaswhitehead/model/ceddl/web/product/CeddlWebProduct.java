package com.contentualize.model.ceddl.web.product;

public interface CeddlWebProduct {

	public CeddlWebProductInfo getProductInfo();
	public CeddlWebProductCategory getCategory();
	public CeddlWebProduct[] getLinkedProduct();
	public CeddlWebProductAttributes getAttributes();
	
	public static interface Builder {
		
		public Builder productInfo();
		public Builder category();
		public Builder linkedProduct();
		public Builder attributes();
		
		public CeddlWebProduct build();
		
	}
}
