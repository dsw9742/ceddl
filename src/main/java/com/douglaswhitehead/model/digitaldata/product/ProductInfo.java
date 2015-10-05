package com.douglaswhitehead.model.digitaldata.product;

/**
 * <p>ProductInfo interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>This object describes the product.</p>
 * 
 * <pre>
 * {@code
 * digitalData.product[n].<b>productInfo</b> = {
 * 		<b>productID:</b> "rog3000",
 * 		<b>productName:</b> "Rogaine",
 * 		<b>description:</b> "Hair Regrowth",
 * 		<b>productURL:</b> "http://site.com/r.html",
 * 		<b>productImage:</b> "http://site.com/rog300_large.png",
 * 		<b>productThumbnail:</b> "http://site.com/rog300_thumb.png",
 * 		<b>manufacturer:</b> "Pharma",
 * 		<b>size:</b> "300ml" };
 * }
 * </pre>
 * 
 * <p>
 * <b>Reserved:</b> <tt>productID</tt> (String), <tt>productName</tt> (String), <tt>description</tt> (String), <tt>productURL</tt>
 * (String), <tt>productImage</tt> (String), <tt>productThumbnail</tt> (String), <tt>manufacturer</tt> (String), <tt>sku</tt>
 * (String), <tt>color</tt> (String), <tt>size</tt> (String)
 * </p>
 * 
 * <p>
 * All other names are optional and should fit the individual implementation needs in both naming
 * and values passed.
 * </p>
 * 
 * @author douglas.whitehead
 *
 */
public interface ProductInfo {
	
	/**
	 * Returns the ProductID object.
	 * 
	 * @return String
	 */
	public String getProductID();
	
	/**
	 * Returns the ProductName object.
	 * 
	 * @return String
	 */
	public String getProductName();
	
	/**
	 * Returns the Description object.
	 * 
	 * @return String
	 */
	public String getDescription();
	
	/**
	 * Returns the ProductURL object.
	 * 
	 * @return String
	 */
	public String getProductURL();
	
	/**
	 * Returns the ProductImage object.
	 * 
	 * @return String
	 */
	public String getProductImage();
	
	/**
	 * Returns the ProductThumbnail object.
	 * 
	 * @return String
	 */
	public String getProductThumbnail();
	
	/**
	 * Returns the Manufacturer object.
	 * 
	 * @return String
	 */
	public String getManufacturer();
	
	/**
	 * Returns the Sku object.
	 * 
	 * @return String
	 */
	public String getSku();
	
	/**
	 * Returns the Color object.
	 * 
	 * @return String
	 */
	public String getColor();
	
	/**
	 * Returns the Size object.
	 * 
	 * @return String
	 */
	public String getSize();
	
	/**
	 * ProductInfo.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the ProductID object.
		 * 
		 * @param String productID
		 * @return Builder
		 */
		public Builder productID(String productID);
		
		/**
		 * Builds the ProductName object.
		 * 
		 * @param String productName
		 * @return Builder
		 */
		public Builder productName(String productName);
		
		/**
		 * Builds the Description object.
		 * 
		 * @param String description
		 * @return Builder
		 */
		public Builder description(String description);
		
		/**
		 * Builds the ProductURL object.
		 * 
		 * @param String productURL
		 * @return Builder
		 */
		public Builder productURL(String productURL);
		
		/**
		 * Builds the ProductImage object.
		 * 
		 * @param String productImage
		 * @return Builder
		 */
		public Builder productImage(String productImage);
		
		/**
		 * Builds the ProductThumbnail object.
		 * 
		 * @param String productThumbnail
		 * @return Builder
		 */
		public Builder productThumbnail(String productThumbnail);
		
		/**
		 * Builds the Manufacturer object.
		 * 
		 * @param String manufacturer
		 * @return Builder
		 */
		public Builder manufacturer(String manufacturer);
		
		/**
		 * Builds the Sku object.
		 * 
		 * @param String sku
		 * @return Builder
		 */
		public Builder sku(String sku);
		
		/**
		 * Builds the Color object.
		 * 
		 * @param String color
		 * @return Builder
		 */
		public Builder color(String color);
		
		/**
		 * Builds the Size object.
		 * 
		 * @param String size
		 * @return Builder
		 */
		public Builder size(String size);
		
		/**
		 * Builds and returns the ProductInfo object.
		 * 
		 * @return ProductInfo
		 */
		public ProductInfo build();
		
	}

}
