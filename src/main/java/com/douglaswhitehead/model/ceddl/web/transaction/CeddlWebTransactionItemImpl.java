package com.contentualize.model.ceddl.web.transaction;

import com.contentualize.model.ceddl.web.product.CeddlWebProduct;
import com.contentualize.model.ceddl.web.product.CeddlWebProductCategory;
import com.contentualize.model.ceddl.web.product.CeddlWebProductInfo;

/**
 * List of items in the transaction.
 */
public class CeddlWebTransactionItemImpl implements CeddlWebTransactionItem {

	private final CeddlWebProductInfo productInfo;
	private final CeddlWebProductCategory category;
	private final int quantity;
	private final CeddlWebTransactionItemPrice price;
	private final CeddlWebProduct[] linkedProduct;
	private final CeddlWebTransactionItemAttributes attributes;
	
	private CeddlWebTransactionItemImpl(
		final CeddlWebProductInfo newProductInfo,
		final CeddlWebProductCategory newCategory,
		final int newQuantity,
		final CeddlWebTransactionItemPrice newPrice,
		final CeddlWebProduct[] newLinkedProduct,
		final CeddlWebTransactionItemAttributes newAttributes
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

	public CeddlWebTransactionItemPrice getPrice() {
		return price;
	}

	public CeddlWebProduct[] getLinkedProduct() {
		return linkedProduct;
	}

	public CeddlWebTransactionItemAttributes getAttributes() {
		return attributes;
	}

	public static class Builder {
		private CeddlWebProductInfo nestedProductInfo;
		private CeddlWebProductCategory nestedCategory;
		private int nestedQuantity;
		private CeddlWebTransactionItemPrice nestedPrice;
		private CeddlWebProduct[] nestedLinkedProduct;
		private CeddlWebTransactionItemAttributes nestedAttributes;
		
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
		
		public Builder price(final CeddlWebTransactionItemPrice newPrice) {
			this.nestedPrice = newPrice;
			return this;
		}
		
		public Builder linkedProduct(final CeddlWebProduct[] newLinkedProduct) {
			this.nestedLinkedProduct = newLinkedProduct;
			return this;
		}
		
		public Builder attributes(final CeddlWebTransactionItemAttributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public CeddlWebTransactionItemImpl build() {
			return new CeddlWebTransactionItemImpl(
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
