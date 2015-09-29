package com.contentualize.model.ceddl.web.product;

/**
 * This object describes the product.
 */
public class CeddlWebProductInfoImpl implements CeddlWebProductInfo {

	private final String productID;
	private final String productName;
	private final String description;
	private final String productURL;
	private final String productImage;
	private final String productThumbnail;
	private final String manufacturer;
	private final String sku;
	private final String color;
	private final String size;
	
	private CeddlWebProductInfoImpl(
		final String newProductID,
		final String newProductName,
		final String newDescription,
		final String newProductURL,
		final String newProductImage,
		final String newProductThumbnail,
		final String newManufacturer,
		final String newSku,
		final String newColor,
		final String newSize
	) {
		this.productID = newProductID;
		this.productName = newProductName;
		this.description = newDescription;
		this.productURL = newProductURL;
		this.productImage = newProductImage;
		this.productThumbnail = newProductThumbnail;
		this.manufacturer = newManufacturer;
		this.sku = newSku;
		this.color = newColor;
		this.size = newSize;
	}
	
	public String getProductID() {
		return this.productID;
	}

	public String getProductName() {
		return this.productName;
	}

	public String getDescription() {
		return this.description;
	}

	public String getProductURL() {
		return this.productURL;
	}

	public String getProductImage() {
		return this.productImage;
	}

	public String getProductThumbnail() {
		return this.productThumbnail;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getSku() {
		return this.sku;
	}

	public String getColor() {
		return this.color;
	}

	public String getSize() {
		return this.size;
	}

	public static class Builder {
		private String nestedProductID;
		private String nestedProductName;
		private String nestedDescription;
		private String nestedProductURL;
		private String nestedProductImage;
		private String nestedProductThumbnail;
		private String nestedManufacturer;
		private String nestedSku;
		private String nestedColor;
		private String nestedSize;
		
		public Builder productID(final String newProductID) {
			this.nestedProductID = newProductID;
			return this;
		}
		
		public Builder productName(final String newProductName) {
			this.nestedProductName = newProductName;
			return this;
		}
		
		public Builder description(final String newDescription) {
			this.nestedDescription = newDescription;
			return this;
		}
		
		public Builder productURL(final String newProductURL) {
			this.nestedProductURL = newProductURL;
			return this;
		}
		
		public Builder productImage(final String newProductImage) {
			this.nestedProductImage = newProductImage;
			return this;
		}
		
		public Builder productThumbnail(final String newProductThumbnail) {
			this.nestedProductThumbnail = newProductThumbnail;
			return this;
		}
		
		public Builder manufacturer(final String newManufacturer) {
			this.nestedManufacturer = newManufacturer;
			return this;
		}
		
		public Builder sku(final String newSku) {
			this.nestedSku = newSku;
			return this;
		}
		
		public Builder color(final String newColor) {
			this.nestedColor = newColor;
			return this;
		}
		
		public Builder size(final String newSize) {
			this.nestedSize = newSize;
			return this;
		}
		
		public CeddlWebProductInfoImpl build() {
			return new CeddlWebProductInfoImpl(
				nestedProductID,
				nestedProductName,
				nestedDescription,
				nestedProductURL,
				nestedProductImage,
				nestedProductThumbnail,
				nestedManufacturer,
				nestedSku,
				nestedColor,
				nestedSize
			);
		}
	}
}
