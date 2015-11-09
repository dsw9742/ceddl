package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.cart.Price;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.product.ProductInfo;

/**
 * <p>Item interface.</p>
 * 
 * @author douglas whitehead
 *
 */
public interface Item {

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
	 * Returns the Quantity object.
	 * 
	 * @return Integer
	 */
	public Integer getQuantity();
	
	/**
	 * Returns the Price object.
	 * 
	 * @return Price
	 */
	public Price getPrice();
	
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
	 * Item.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the ProductInfo object.
		 * 
		 * @param ProductInfo productInfo
		 * @return Builder
		 */
		public Builder productInfo(ProductInfo productInfo);
		
		/**
		 * Builds the Category object.
		 * 
		 * @param Category category
		 * @return Builder
		 */
		public Builder category(Category category);
		
		/**
		 * Builds the Quantity object.
		 * 
		 * @param Integer quantity
		 * @return Builder
		 */
		public Builder quantity(Integer quantity);
		
		/**
		 * Builds the Price object.
		 * 
		 * @param Total price
		 * @return Builder
		 */
		public Builder price(Price price);
		
		/**
		 * Builds the LinkedProduct array.
		 * 
		 * @param Product[] product
		 * @return Builder
		 */
		public Builder linkedProduct(Product[] product);
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		public Builder attributes(Attributes attributes);
		
		/**
		 * Builds and returns the Item object.
		 * 
		 * @return Item
		 */
		public Item build();
		
	}
	
}
