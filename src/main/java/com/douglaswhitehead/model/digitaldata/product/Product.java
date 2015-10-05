package com.douglaswhitehead.model.digitaldata.product;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * <p>Product interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.4 Product Object</p>
 * 
 * <p>
 * The Product object carries details about a particular product with frequently used properties
 * listed below. This is intended for data about products displayed on pages or other content. For
 * products added to a shopping cart or ordered in a transaction, see the Cart and Transaction
 * objects below.
 * </p>
 * 
 * <p>
 * The Product object and its children, where included, MUST have the following Object Names &
 * Types.
 * </p>
 * 
 * <p>List of products.<p>
 * 
 * @author douglas.whitehead
 *
 */
public interface Product {

	/**
	 * Returns the ProductInfo object.
	 * 
	 * @return ProductInfo
	 */
	public ProductInfo getProductInfo();
	
	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	public Category getCategory();
	
	/**
	 * Returns the LinkedProduct array.
	 * 
	 * @return Product[]
	 */
	public Product[] getLinkedProduct();
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes();
	
	/**
	 * Product.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the ProductInfo object.
		 * 
		 * @return Builder
		 */
		public Builder productInfo(ProductInfo productInfo);
		
		/**
		 * Builds the Category object.
		 * 
		 * @return Builder
		 */
		public Builder category(Category category);
		
		/**
		 * Builds the LinkedProduct array.
		 * 
		 * @return Builder
		 */
		public Builder linkedProduct(Product[] linkedProduct);
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @return Builder
		 */
		public Builder attributes(Attributes attributes);
		
		/**
		 * Builds and returns the Product object.
		 * 
		 * @return Product
		 */
		public Product build();
		
	}
}
