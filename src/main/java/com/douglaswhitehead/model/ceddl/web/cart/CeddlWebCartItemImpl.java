package com.contentualize.model.ceddl.web.cart;

import com.contentualize.model.ceddl.web.product.CeddlWebProduct;
import com.contentualize.model.ceddl.web.product.CeddlWebProductCategory;
import com.contentualize.model.ceddl.web.product.CeddlWebProductInfo;

/**
 * List of items in the cart.
 */
public class CeddlWebCartItemImpl implements CeddlWebCartItem {

	private final CeddlWebProductInfo productInfo;
	private final CeddlWebProductCategory category;
	private final int quantity;
	private final CeddlWebCartPrice price;
	private final CeddlWebProduct[] linkedProduct;
	private final CeddlWebCartItemAttributesImpl attributes;
	
	private CeddlWebCartItemImpl(
		final CeddlWebProductInfo newProductInfo,
		final CeddlWebProductCategory newCategory,
		final int newQuantity,
		final CeddlWebCartPrice newPrice,
		final CeddlWebProduct[] newLinkedProduct,
		final CeddlWebCartItemAttributesImpl newAttributes
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
	
	public CeddlWebCartPrice getPrice() {
		return price;
	}
	
	public CeddlWebProduct[] getLinkedProduct() {
		return linkedProduct;
	}
	
	public CeddlWebCartItemAttributesImpl getAttributes() {
		return attributes;
	}
	
	public static class Builder {
		private CeddlWebProductInfo nestedProductInfo;
		private CeddlWebProductCategory nestedCategory;
		private int nestedQuantity;
		private CeddlWebCartPrice nestedPrice;
		private CeddlWebProduct[] nestedLinkedProduct;
		private CeddlWebCartItemAttributesImpl nestedAttributes;
		
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
		
		public Builder price(final CeddlWebCartPrice newPrice) {
			this.nestedPrice = newPrice;
			return this;
		}
		
		public Builder attributes(final CeddlWebCartItemAttributesImpl newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public CeddlWebCartItemImpl build() {
			return new CeddlWebCartItemImpl(
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
