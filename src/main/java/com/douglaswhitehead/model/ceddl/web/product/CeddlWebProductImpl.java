package com.douglaswhitehead.model.ceddl.web.product;

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
public class CeddlWebProductImpl implements CeddlWebProduct {

	private final CeddlWebProductInfo productInfo;
	private final CeddlWebProductCategory category;
	private final CeddlWebProduct[] linkedProduct;
	private final CeddlWebProductAttributes attributes;
	
	private CeddlWebProductImpl(
		final CeddlWebProductInfo newProductInfo,
		final CeddlWebProductCategory newCategory,
		final CeddlWebProduct[] newLinkedProduct,
		final CeddlWebProductAttributes newAttributes
	) {
		this.productInfo = newProductInfo;
		this.category = newCategory;
		this.linkedProduct = newLinkedProduct;
		this.attributes = newAttributes;
	}
	
	public CeddlWebProductInfo getProductInfo() {
		return this.productInfo;
	}
	
	public CeddlWebProductCategory getCategory() {
		return this.category;
	}
	
	public CeddlWebProduct[] getLinkedProduct() {
		return this.linkedProduct;
	}
	
	public CeddlWebProductAttributes getAttributes() {
		return this.attributes;
	}
	
	public static class Builder {
		private CeddlWebProductInfo nestedProductInfo;
		private CeddlWebProductCategory nestedCategory;
		private CeddlWebProduct[] nestedLinkedProduct;
		private CeddlWebProductAttributes nestedAttributes;
		
		public Builder productInfo(final CeddlWebProductInfo newProductInfo) {
			this.nestedProductInfo = newProductInfo;
			return this;
		}
		
		public Builder category(final CeddlWebProductCategory newCategory) {
			this.nestedCategory = newCategory;
			return this;
		}
		
		public Builder linkedProduct(final CeddlWebProduct[] newLinkedProduct) {
			this.nestedLinkedProduct = newLinkedProduct;
			return this;
		}
		
		public Builder attributes(final CeddlWebProductAttributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public CeddlWebProductImpl build() {
			return new CeddlWebProductImpl(
				nestedProductInfo,
				nestedCategory,
				nestedLinkedProduct,
				nestedAttributes
			);
		}
	}
}