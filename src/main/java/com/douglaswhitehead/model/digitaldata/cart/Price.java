package com.douglaswhitehead.model.digitaldata.cart;

import java.math.BigDecimal;

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