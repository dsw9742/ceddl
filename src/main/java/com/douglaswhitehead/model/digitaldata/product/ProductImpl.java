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

	/**
	 * String constant for <tt>productInfo</tt>
	 */
	private final static String PRODUCT_INFO = "productInfo";
	
	/**
	 * String constant for <tt>category</tt>
	 */
	private final static String CATEGORY = "category";
	
	/**
	 * String constant for <tt>linkedProduct</tt>
	 */
	private final static String LINKED_PRODUCT = "linkedProduct";
	
	/**
	 * String constant for <tt>attributes</tt>
	 */
	private final static String ATTRIBUTES = "attributes";
	
	/**
	 * ProductImpl constructor.
	 * 
	 * @param Security security
	 * @param ProductInfo productInfo
	 * @param Category category
	 * @param Product[] linkedProduct
	 * @param Attributes attributes
	 */
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
	
	/**
	 * Returns the ProductInfo object.
	 * 
	 * @return ProductInfo
	 */
	@Override
	public ProductInfo getProductInfo() {
		return (ProductInfo)map.get(PRODUCT_INFO);
	}
	
	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	@Override
	public Category getCategory() {
		return (Category)map.get(CATEGORY);
	}
	
	/**
	 * Returns the LinkedProduct array.
	 * 
	 * @return Product[]
	 */
	@Override
	public Product[] getLinkedProduct() {
		return (Product[])map.get(LINKED_PRODUCT);
	}
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	@Override
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}
	
	/**
	 * Implementation of the Product.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Product.Builder {
		
		/**
		 * Builds the ProductInfo object.
		 * 
		 * @param ProductInfo productInfo
		 * @return Builder
		 */
		@Override
		public Builder productInfo(final ProductInfo productInfo) {
			this.map.put(PRODUCT_INFO, productInfo);
			this.previous = PRODUCT_INFO;
			return this;
		}
		
		/**
		 * Builds the Category object.
		 * 
		 * @param Category category
		 * @return Builder
		 */
		@Override
		public Builder category(final Category category) {
			this.map.put(CATEGORY, category);
			this.previous = CATEGORY;
			return this;
		}
		
		/**
		 * Builds the LinkedProduct array.
		 * 
		 * @param Product[] linkedProduct
		 * @return Builder
		 */
		@Override
		public Builder linkedProduct(final Product[] linkedProduct) {
			this.map.put(LINKED_PRODUCT, linkedProduct);
			this.previous = LINKED_PRODUCT;
			return this;
		}
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		@Override
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return this;
		}
		
		/**
		 * Builds and returns the ProductImpl object.
		 * 
		 * @return ProductImpl
		 */
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