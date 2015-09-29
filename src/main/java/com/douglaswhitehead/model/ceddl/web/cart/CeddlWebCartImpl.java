package com.contentualize.model.ceddl.web.cart;

/**
 * 6.5 Cart Object
 * 
 * The Cart object carries details about a shopping cart or basket and the products that have been
 * added to it. The Cart object is intended for a purchase that has not yet been completed. See the
 * Transaction object below for completed orders.
 */
public class CeddlWebCartImpl implements CeddlWebCart {

	private final String cartID;
	private final CeddlWebCartPrice price;
	private final CeddlWebCartAttributes attributes;
	private final CeddlWebCartItem[] item;
	
	private CeddlWebCartImpl(
		final String newCartID,
		final CeddlWebCartPrice newPrice,
		final CeddlWebCartAttributes newAttributes,
		final CeddlWebCartItem[] newItem
	) {
		this.cartID = newCartID;
		this.price = newPrice;
		this.attributes = newAttributes;
		this.item = newItem;
	}
	
	public String getCartID() {
		return cartID;
	}
	
	public CeddlWebCartPrice getPrice() {
		return price;
	}
	
	public CeddlWebCartAttributes getAttributes() {
		return attributes;
	}
	
	public CeddlWebCartItem[] getItem() {
		return item;
	}
	
	public static class Builder {
		private String nestedCartID;
		private CeddlWebCartPrice nestedPrice;
		private CeddlWebCartAttributes nestedAttributes;
		private CeddlWebCartItem[] nestedItem;
		
		public Builder cartID(final String newCartID) {
			this.nestedCartID = newCartID;
			return this;
		}
		
		public Builder price(final CeddlWebCartPrice newPrice) {
			this.nestedPrice = newPrice;
			return this;
		}

		public Builder attributes(final CeddlWebCartAttributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public Builder item(final CeddlWebCartItem[] newItem) {
			this.nestedItem = newItem;
			return this;
		}
		
		public CeddlWebCartImpl build() {
			return new CeddlWebCartImpl(
				nestedCartID,
				nestedPrice,
				nestedAttributes,
				nestedItem
			);
		}
	}
}
