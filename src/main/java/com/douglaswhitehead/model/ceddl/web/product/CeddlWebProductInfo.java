package com.douglaswhitehead.model.ceddl.web.product;

public interface CeddlWebProductInfo {
	
	public String getProductID();
	public String getProductName();
	public String getDescription();
	public String getProductURL();
	public String getProductImage();
	public String getProductThumbnail();
	public String getManufacturer();
	public String getSku();
	public String getColor();
	public String getSize();
	
	public static interface Builder {
		
		public Builder productID();
		public Builder productName();
		public Builder description();
		public Builder productURL();
		public Builder productImage();
		public Builder productThumbnail();
		public Builder manufacturer();
		public Builder sku();
		public Builder color();
		public Builder size();
		
		public CeddlWebProductInfo build();
		
	}

}
