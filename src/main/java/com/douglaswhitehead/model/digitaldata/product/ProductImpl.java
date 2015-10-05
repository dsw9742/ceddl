package com.douglaswhitehead.model.digitaldata.product;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.common.Category;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Product interface.
 * 
 * @author douglas.whitehead
 * 
 */
public class ProductImpl extends BaseImpl implements Product {

	private final static String PRODUCT_INFO = "productInfo";
	private final static String CATEGORY = "category";
	private final static String LINKED_PRODUCT = "linkedProduct";
	private final static String ATTRIBUTES = "attributes";
	
	private ProductImpl(
		final Security security,
		final ProductInfo productInfo,
		final Category category,
		final Product[] linkedProduct,
		final Attributes attributes
	) {
		this.security = security;
		this.map.put(PRODUCT_INFO, productInfo);
		this.map.put(CATEGORY, category);
		this.map.put(LINKED_PRODUCT, linkedProduct);
		this.map.put(ATTRIBUTES, attributes);
	}
	
	@Override
	public ProductInfo getProductInfo() {
		return (ProductInfo)map.get(PRODUCT_INFO);
	}
	
	@Override
	public Category getCategory() {
		return (Category)map.get(CATEGORY);
	}
	
	@Override
	public Product[] getLinkedProduct() {
		return (Product[])map.get(LINKED_PRODUCT);
	}
	
	@Override
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}
	
	public static class Builder extends BaseImpl.Builder<Builder> implements Product.Builder {
		
		@Override
		public Builder productInfo(final ProductInfo productInfo) {
			this.map.put(PRODUCT_INFO, productInfo);
			this.previous = PRODUCT_INFO;
			return this;
		}
		
		@Override
		public Builder category(final Category category) {
			this.map.put(CATEGORY, category);
			this.previous = CATEGORY;
			return this;
		}
		
		@Override
		public Builder linkedProduct(final Product[] linkedProduct) {
			this.map.put(LINKED_PRODUCT, linkedProduct);
			this.previous = LINKED_PRODUCT;
			return this;
		}
		
		@Override
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return this;
		}
		
		@Override
		public ProductImpl build() {
			return new ProductImpl(
				security,
				(ProductInfo)map.get(PRODUCT_INFO),
				(Category)map.get(CATEGORY),
				(Product[])map.get(LINKED_PRODUCT),
				(Attributes)map.get(ATTRIBUTES)
			);
		}
		
		@Override
		protected Builder builder() {
			return this;
		}
	}
}