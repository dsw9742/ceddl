package com.douglaswhitehead.model.digitaldata.cart;

import java.math.BigDecimal;

/**
 * <p>Price interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>
 * This object provides details of the cart price. The <tt>basePrice</tt> SHOULD be the price of 
 * the <tt>item</tt>s before applicable discounts, shipping charges, and tax. The <tt>cartTotal</tt> SHOULD 
 * be the total price inclusive of all discounts, charges, and tax. 
 * </p>
 * 
 * <pre>
 * {@code
 * digitalData.cart.<b>price</b> = {
 * 			<b>basePrice:</b> 200.00,
 * 			<b>voucherCode:</b> "Alpha",
 * 			<b>voucherDiscount:</b> 0.50,
 * 			<b>currency:</b> "EUR",
 * 			<b>taxRate:</b> 0.20,
 * 			<b>shipping:</b> 5.00,
 * 			<b>shippingMethod:</b> "UPS",
 * 			<b>priceWithTax:</b> 120,
 *			<b>cartTotal:</b> 125
 *		};
 * }
 * </pre>
 * 
 * <p>
 * <b>Reserved:</b> <tt>basePrice</tt> (Number), <tt>voucherCode</tt> (String), <tt>voucherDiscount</tt> (Number), 
 * <tt>currency</tt> (String), <tt>taxRate</tt> (Number), <tt>shipping</tt> (Number), <tt>shippingMethod</tt> (String), 
 * <tt>priceWithTax</tt> (Number), <tt>cartTotal</tt> (Number) 
 * </p>
 * 
 * <p>For <tt>currency</tt> values, ISO 4217 is RECOMMENDED.</p>
 * 
 * <p>
 * All other names are optional and should fit the individual implementation needs in both naming 
 * and values passed.
 * </p>
 * 
 * @author douglas whitehead
 *
 */
public interface Price {
	
	/**
	 * Returns the BasePrice object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getBasePrice();
	
	/**
	 * Returns the VoucherCode object.
	 * 
	 * @return String
	 */
	public String getVoucherCode();
	
	/**
	 * Returns the VoucherDiscount
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getVoucherDiscount();
	
	/**
	 * Returns the Currency object.
	 * 
	 * @return String
	 */
	public String getCurrency();
	
	/**
	 * Returns the TaxRate object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getTaxRate();
	
	/**
	 * Returns the Shipping object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getShipping();
	
	/**
	 * Returns the ShippingMethod object.
	 * 
	 * @return String
	 */
	public String getShippingMethod();
	
	/**
	 * Returns the PriceWithTax object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getPriceWithTax();
	
	/**
	 * Returns the CartTotal object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getCartTotal();
	
	/**
	 * Price.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the BasePrice object.
		 * 
		 * @return Builder
		 */
		public Builder basePrice(BigDecimal basePrice);
		
		/**
		 * Builds the VoucherCode object.
		 * 
		 * @return Builder
		 */
		public Builder voucherCode(String voucherCode);
		
		/**
		 * Builds the VoucherDiscount object.
		 * 
		 * @return Builder
		 */
		public Builder voucherDiscount(BigDecimal voucherDiscount);
		
		/**
		 * Builds the Currency object.
		 * 
		 * @return Builder
		 */
		public Builder currency(String currency);
		
		/**
		 * Builds the TaxRate object.
		 * 
		 * @return Builder
		 */
		public Builder taxRate(BigDecimal taxRate);
		
		/**
		 * Builds the Shipping object.
		 * 
		 * @return Builder
		 */
		public Builder shipping(BigDecimal shipping);
		
		/**
		 * Builds the ShippingMethod object.
		 * 
		 * @return Builder
		 */
		public Builder shippingMethod(String shippingMethod);
		
		/**
		 * Builds the PriceWithTax object.
		 * 
		 * @return Builder
		 */
		public Builder priceWithTax(BigDecimal priceWithTax);
		
		/**
		 * Builds the CartTotal object.
		 * 
		 * @return Builder
		 */
		public Builder cartTotal(BigDecimal cartTotal);
		
		/**
		 * Builds and returns the Price object.
		 * 
		 * @return Price
		 */
		public Price build();
		
	}

}
