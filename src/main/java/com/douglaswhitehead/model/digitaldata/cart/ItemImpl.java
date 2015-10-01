package com.douglaswhitehead.model.digitaldata.cart;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProduct;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProductCategory;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProductInfo;

/**
 * List of items in the cart.
 */
public class ItemImpl implements Item {

	private final CeddlWebProductInfo productInfo;
	private final CeddlWebProductCategory category;
	private final int quantity;
	private final Price price;
	private final CeddlWebProduct[] linkedProduct;
	private final Attributes attributes;
	
	private ItemImpl(
		final CeddlWebProductInfo newProductInfo,
		final CeddlWebProductCategory newCategory,
		final int newQuantity,
		final Price newPrice,
		final CeddlWebProduct[] newLinkedProduct,
		final Attributes newAttributes
	) {
		this.productInfo = newProductInfo;
		this.category = newCategory;
		this.quantity = newQuantity;
		this.price = newPrice;
		this.linkedProduct = newLinkedProduct;
		this.attributes = newAttributes;
	}
	
	public CeddlWebProductInfo getProductInfo() {
		return productInfo;
	}
	
	public CeddlWebProductCategory getCategory() {
		return category;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Price getPrice() {
		return price;
	}
	
	public CeddlWebProduct[] getLinkedProduct() {
		return linkedProduct;
	}
	
	public Attributes getAttributes() {
		return attributes;
	}
	
	public static class Builder {
		private CeddlWebProductInfo nestedProductInfo;
		private CeddlWebProductCategory nestedCategory;
		private int nestedQuantity;
		private Price nestedPrice;
		private CeddlWebProduct[] nestedLinkedProduct;
		private Attributes nestedAttributes;
		
		public Builder productInfo(final CeddlWebProductInfo newProductInfo) {
			this.nestedProductInfo = newProductInfo;
			return this;
		}
		
		public Builder category(final CeddlWebProductCategory newCategory) {
			this.nestedCategory = newCategory;
			return this;
		}
		
		public Builder quantity(final int newQuantity) {
			this.nestedQuantity = newQuantity;
			return this;
		}
		
		public Builder linkedProduct(final CeddlWebProduct[] newLinkedProduct) {
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
