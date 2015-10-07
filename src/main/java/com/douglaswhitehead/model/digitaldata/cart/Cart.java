package com.douglaswhitehead.model.digitaldata.cart;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Item;

/**
 * <p>Cart interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.5 Cart Object</p>
 * 
 * <p>
 * The Cart object carries details about a shopping cart or basket and the products that have been
 * added to it. The Cart object is intended for a purchase that has not yet been completed. See the
 * Transaction object below for completed orders.
 * </p>
 * 
 * <p>
 * The Cart object and its children, where included, MUST have the following Object Names &
 * Types.
 * </p>
 * 
 * @author douglas whitehead
 *
 */
public interface Cart {

	/**
	 * Returns the CartID object.
	 * 
	 * @return String
	 */
	public String getCartID();
	
	/**
	 * Returns the Price object.
	 * 
	 * @return Price
	 */
	public Price getPrice();
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes();
	
	/**
	 * Returns the Item array.
	 * 
	 * @return Item[]
	 */
	public Item[] getItem();
	
	/**
	 * Cart.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the CartID object.
		 * 
		 * @return Builder
		 */
		public Builder cartID();
		
		/**
		 * Builds the Price object.
		 * 
		 * @return Builder
		 */
		public Builder price();
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @return Builder
		 */
		public Builder attributes();
		
		/**
		 * Builds the Item array.
		 * 
		 * @return Builder
		 */
		public Builder item();
		
		/**
		 * Builds and returns the Cart object.
		 * 
		 * @return Cart
		 */
		public Cart build();
		
	}
}
