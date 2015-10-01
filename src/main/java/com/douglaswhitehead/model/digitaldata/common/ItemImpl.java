package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.cart.Price;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.product.ProductInfo;

/**
 * List of items in the cart.
 */
public class ItemImpl implements Item {

	private final ProductInfo productInfo;
	private final Category category;
	private final int quantity;
	private final Price price;
	private final Product[] linkedProduct;
	private final Attributes attributes;
	
	private ItemImpl(
		final ProductInfo newProductInfo,
		final Category newCategory,
		final int newQuantity,
		final Price newPrice,
		final Product[] newLinkedProduct,
		final Attributes newAttributes
	) {
		this.productInfo = newProductInfo;
		this.category = newCategory;
		this.quantity = newQuantity;
		this.price = newPrice;
		this.linkedProduct = newLinkedProduct;
		this.attributes = newAttributes;
	}
	
	public ProductInfo getProductInfo() {
		return productInfo;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Price getPrice() {
		return price;
	}
	
	public Product[] getLinkedProduct() {
		return linkedProduct;
	}
	
	public Attributes getAttributes() {
		return attributes;
	}
	
	public static class Builder {
		private ProductInfo nestedProductInfo;
		private Category nestedCategory;
		private int nestedQuantity;
		private Price nestedPrice;
		private Product[] nestedLinkedProduct;
		private Attributes nestedAttributes;
		
		public Builder productInfo(final ProductInfo newProductInfo) {
			this.nestedProductInfo = newProductInfo;
			return this;
		}
		
		public Builder category(final Category newCategory) {
			this.nestedCategory = newCategory;
			return this;
		}
		
		public Builder quantity(final int newQuantity) {
			this.nestedQuantity = newQuantity;
			return this;
		}
		
		public Builder linkedProduct(final Product[] newLinkedProduct) {
			this.nestedLinkedProduct = newLinkedProduct;
			return this;
		}
		
		public Builder price(final Price newPrice) {
			this.nestedPrice = newPrice;
			return this;
		}
		
		public Builder attributes(final Attributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public ItemImpl build() {
			return new ItemImpl(
				nestedProductInfo,
				nestedCategory,
				nestedQuantity,
				nestedPrice,
				nestedLinkedProduct,
				nestedAttributes
			);
		}
	}
	
}
