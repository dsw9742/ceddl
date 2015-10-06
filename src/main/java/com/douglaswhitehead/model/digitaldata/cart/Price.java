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
	
	public BigDecimal getBasePrice();
	public String getVoucherCode();
	public BigDecimal getVoucherDiscount();
	public String getCurrency();
	public BigDecimal getTaxRate();
	public BigDecimal getShipping();
	public String getShippingMethod();
	public BigDecimal getPriceWithTax();
	public BigDecimal getCartTotal();
	
	public static interface Builder {
		
		public Builder basePrice();
		public Builder voucherCode();
		public Builder voucherDiscount();
		public Builder currency();
		public Builder taxRate();
		public Builder shipping();
		public Builder shippingMethod();
		public Builder priceWithTax();
		public Builder cartTotal();
		
		public Price build();
		
	}

}
