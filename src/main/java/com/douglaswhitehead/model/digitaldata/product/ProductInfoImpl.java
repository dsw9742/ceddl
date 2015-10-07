package com.douglaswhitehead.model.digitaldata.product;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of ProductInfo interface.
 * 
 * @author douglas.whitehead
 * 
 */
public class ProductInfoImpl extends BaseImpl implements ProductInfo {

	/**
	 * String constant for <tt>productID</tt>
	 */
	private static final String PRODUCT_ID = "productID";
	
	/**
	 * String constant for <tt>productName</tt>
	 */
	private static final String PRODUCT_NAME = "productName";
	
	/**
	 * String constant for <tt>description</tt>
	 */
	private static final String DESCRIPTION = "description";
	
	/**
	 * String constant for <tt>productURL</tt>
	 */
	private static final String PRODUCT_URL = "productURL";
	
	/**
	 * String constant for <tt>productImage</tt>
	 */
	private static final String PRODUCT_IMAGE = "productImage";
	
	/**
	 * String constant for <tt>productThumbnail</tt>
	 */
	private static final String PRODUCT_THUMBNAIL = "productThumbnail";
	
	/**
	 * String constant for <tt>manufacturer</tt>
	 */
	private static final String MANUFACTURER = "manufacturer";
	
	/**
	 * String constant for <tt>sku</tt>
	 */
	private static final String SKU = "sku";
	
	/**
	 * String constant for <tt>color</tt>
	 */
	private static final String COLOR = "color";
	
	/**
	 * String constant for <tt>size</tt>
	 */
	private static final String SIZE = "size";
	
	/**
	 * ProductInfoImpl constructor.
	 * 
	 * @param Security security
	 * @param String productID
	 * @param String productName
	 * @param String description
	 * @param String productURL
	 * @param String productImage
	 * @param String productThumbnail
	 * @param String manufacturer
	 * @param String sku
	 * @param String color
	 * @param String size
	 */
	private ProductInfoImpl(
		final Security security,
		final String productID,
		final String productName,
		final String description,
		final String productURL,
		final String productImage,
		final String productThumbnail,
		final String manufacturer,
		final String sku,
		final String color,
		final String size
	) {
		this.security = security;
		this.map.put(PRODUCT_ID, productID);
		this.map.put(PRODUCT_NAME, productName);
		this.map.put(DESCRIPTION, description);
		this.map.put(PRODUCT_URL, productURL);
		this.map.put(PRODUCT_IMAGE, productImage);
		this.map.put(PRODUCT_THUMBNAIL, productThumbnail);
		this.map.put(MANUFACTURER, manufacturer);
		this.map.put(SKU, sku);
		this.map.put(COLOR, color);
		this.map.put(SIZE, size);
	}
	
	/**
	 * Returns the ProductID object.
	 * 
	 * @return String
	 */
	@Override
	public String getProductID() {
		return (String)map.get(PRODUCT_ID);
	}

	/**
	 * Returns the ProductName object.
	 * 
	 * @return String
	 */
	@Override
	public String getProductName() {
		return (String)map.get(PRODUCT_NAME);
	}

	/**
	 * Returns the Description object.
	 * 
	 * @return String
	 */
	@Override
	public String getDescription() {
		return (String)map.get(DESCRIPTION);
	}

	/**
	 * Returns the ProductURL object.
	 * 
	 * @return String
	 */
	@Override
	public String getProductURL() {
		return (String)map.get(PRODUCT_URL);
	}

	/**
	 * Returns the ProductImage object.
	 * 
	 * @return String
	 */
	@Override
	public String getProductImage() {
		return (String)map.get(PRODUCT_IMAGE);
	}

	/**
	 * Returns the ProductThumbnail object.
	 * 
	 * @return String
	 */
	@Override
	public String getProductThumbnail() {
		return (String)map.get(PRODUCT_THUMBNAIL);
	}

	/**
	 * Returns the Manufacturer object.
	 * 
	 * @return String
	 */
	@Override
	public String getManufacturer() {
		return (String)map.get(MANUFACTURER);
	}

	/**
	 * Returns the Sku object.
	 * 
	 * @return String
	 */
	@Override
	public String getSku() {
		return (String)map.get(SKU);
	}

	/**
	 * Returns the Color object.
	 * 
	 * @return String
	 */
	@Override
	public String getColor() {
		return (String)map.get(COLOR);
	}

	/**
	 * Returns the Size object.
	 * 
	 * @return String
	 */
	@Override
	public String getSize() {
		return (String)map.get(SIZE);
	}

	/**
	 * Implementation of the ProductInfo.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements ProductInfo.Builder {

		/**
		 * Builds the ProductID object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder productID(final String productID) {
			this.map.put(PRODUCT_ID, productID);
			this.previous = PRODUCT_ID;
			return builder();
		}
		
		/**
		 * Builds the ProductName object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder productName(final String productName) {
			this.map.put(PRODUCT_NAME, productName);
			this.previous = PRODUCT_NAME;
			return builder();
		}
		
		/**
		 * Builds the Description object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder description(final String description) {
			this.map.put(DESCRIPTION, description);
			this.previous = DESCRIPTION;
			return builder();
		}
		
		/**
		 * Builds the ProductURL object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder productURL(final String productURL) {
			this.map.put(PRODUCT_URL, productURL);
			this.previous = PRODUCT_URL;
			return builder();
		}
		
		/**
		 * Builds the ProductImage object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder productImage(final String productImage) {
			this.map.put(PRODUCT_IMAGE, productImage);
			this.previous = PRODUCT_IMAGE;
			return builder();
		}
		
		/**
		 * Builds the ProductThumbnail object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder productThumbnail(final String productThumbnail) {
			this.map.put(PRODUCT_THUMBNAIL, productThumbnail);
			this.previous = PRODUCT_THUMBNAIL;
			return builder();
		}
		
		/**
		 * Builds the Manufacturer object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder manufacturer(final String manufacturer) {
			this.map.put(MANUFACTURER, manufacturer);
			this.previous = MANUFACTURER;
			return builder();
		}
		
		/**
		 * Builds the Sku object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder sku(final String sku) {
			this.map.put(SKU, sku);
			this.previous = SKU;
			return builder();
		}

		/**
		 * Builds the Color object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder color(final String color) {
			this.map.put(COLOR, color);
			this.previous = COLOR;
			return builder();
		}
		
		/**
		 * Builds the Size object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder size(final String size) {
			this.map.put(SIZE, size);
			this.previous = SIZE;
			return builder();
		}
		
		/**
		 * Builds and returns the ProductInfoImpl object.
		 * 
		 * @return ProductInfoImpl
		 */
		@Override
		public ProductInfoImpl build() {
			return new ProductInfoImpl(
				security,
				(String)map.get(PRODUCT_ID),
				(String)map.get(PRODUCT_NAME),
				(String)map.get(DESCRIPTION),
				(String)map.get(PRODUCT_URL),
				(String)map.get(PRODUCT_IMAGE),
				(String)map.get(PRODUCT_THUMBNAIL),
				(String)map.get(MANUFACTURER),
				(String)map.get(SKU),
				(String)map.get(COLOR),
				(String)map.get(SIZE)
			);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}
}
