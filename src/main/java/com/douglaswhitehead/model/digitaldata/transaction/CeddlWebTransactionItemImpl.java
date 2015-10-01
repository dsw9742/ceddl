package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.common.Category;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.product.ProductInfo;

/**
 * List of items in the transaction.
 */
public class CeddlWebTransactionItemImpl implements CeddlWebTransactionItem {

	private final ProductInfo productInfo;
	private final Category category;
	private final int quantity;
	private final CeddlWebTransactionItemPrice price;
	private final Product[] linkedProduct;
	private final CeddlWebTransactionItemAttributes attributes;
	
	private CeddlWebTransactionItemImpl(
		final ProductInfo newProductInfo,
		final Category newCategory,
		final int newQuantity,
		final CeddlWebTransactionItemPrice newPrice,
		final Product[] newLinkedProduct,
		final CeddlWebTransactionItemAttributes newAttributes
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

	public CeddlWebTransactionItemPrice getPrice() {
		return price;
	}

	public Product[] getLinkedProduct() {
		return linkedProduct;
	}

	public CeddlWebTransactionItemAttributes getAttributes() {
		return attributes;
	}

	public static class Builder {
		private ProductInfo nestedProductInfo;
		private Category nestedCategory;
		private int nestedQuantity;
		private CeddlWebTransactionItemPrice nestedPrice;
		private Product[] nestedLinkedProduct;
		private CeddlWebTransactionItemAttributes nestedAttributes;
		
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
		
		public Builder price(final CeddlWebTransactionItemPrice newPrice) {
			this.nestedPrice = newPrice;
			return this;
		}
		
		public Builder linkedProduct(final Product[] newLinkedProduct) {
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
