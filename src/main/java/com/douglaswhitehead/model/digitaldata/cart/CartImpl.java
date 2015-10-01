package com.douglaswhitehead.model.digitaldata.cart;

import com.douglaswhitehead.model.digitaldata.common.Attributes;

/**
 * 6.5 Cart Object
 * 
 * The Cart object carries details about a shopping cart or basket and the products that have been
 * added to it. The Cart object is intended for a purchase that has not yet been completed. See the
 * Transaction object below for completed orders.
 */
public class CartImpl implements Cart {

	private final String cartID;
	private final Price price;
	private final Attributes attributes;
	private final Item[] item;
	
	private CartImpl(
		final String newCartID,
		final Price newPrice,
		final Attributes newAttributes,
		final Item[] newItem
	) {
		this.cartID = newCartID;
		this.price = newPrice;
		this.attributes = newAttributes;
		this.item = newItem;
	}
	
	public String getCartID() {
		return cartID;
	}
	
	public Price getPrice() {
		return price;
	}
	
	public Attributes getAttributes() {
		return attributes;
	}
	
	public Item[] getItem() {
		return item;
	}
	
	public static class Builder {
		private String nestedCartID;
		private Price nestedPrice;
		private Attributes nestedAttributes;
		private Item[] nestedItem;
		
		public Builder cartID(final String newCartID) {
			this.nestedCartID = newCartID;
			return this;
		}
		
		public Builder price(final Price newPrice) {
			this.nestedPrice = newPrice;
			return this;
		}

		public Builder attributes(final Attributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public Builder item(final Item[] newItem) {
			this.nestedItem = newItem;
			return this;
		}
		
		public CartImpl build() {
			return new CartImpl(
				nestedCartID,
				nestedPrice,
				nestedAttributes,
				nestedItem
			);
		}
	}
}
