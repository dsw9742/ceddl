package com.douglaswhitehead.model.digitaldata.product;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * 6.4 Product Object
 * 
 * The Product object carries details about a particular product with frequently used properties
 * listed below. This is intended for data about products displayed on pages or other content. For
 * products added to a shopping cart or ordered in a transaction, see the Cart and Transaction
 * objects below.
 *
 * The Product object and its children, where included, MUST have the following Object Names &
 * Types.
 */
public class ProductImpl implements Product {

	private final ProductInfo productInfo;
	private final Category category;
	private final Product[] linkedProduct;
	private final Attributes attributes;
	
	private ProductImpl(
		final ProductInfo newProductInfo,
		final Category newCategory,
		final Product[] newLinkedProduct,
		final Attributes newAttributes
	) {
		this.productInfo = newProductInfo;
		this.category = newCategory;
		this.linkedProduct = newLinkedProduct;
		this.attributes = newAttributes;
	}
	
	public ProductInfo getProductInfo() {
		return this.productInfo;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public Product[] getLinkedProduct() {
		return this.linkedProduct;
	}
	
	public Attributes getAttributes() {
		return this.attributes;
	}
	
	public static class Builder {
		private ProductInfo nestedProductInfo;
		private Category nestedCategory;
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
		
		public Builder linkedProduct(final Product[] newLinkedProduct) {
			this.nestedLinkedProduct = newLinkedProduct;
			return this;
		}
		
		public Builder attributes(final Attributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public ProductImpl build() {
			return new ProductImpl(
				nestedProductInfo,
				nestedCategory,
				nestedLinkedProduct,
				nestedAttributes
			);
		}
	}
}