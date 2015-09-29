package com.contentualize.model.ceddl.web.transaction;

import java.math.BigDecimal;

/**
 * As for the main transaction object digitalData.transaction.price, where tracking on
 * each individual item is desired.
 */
public class CeddlWebTransactionItemPriceImpl implements CeddlWebTransactionItemPrice {

	private final BigDecimal basePrice;
	private final String voucherCode;
	private final BigDecimal voucherDiscount;
	private final String currency;
	private final BigDecimal taxRate;
	private final BigDecimal shipping;
	private final String shippingMethod;
	private final BigDecimal priceWithTax;
	
	private CeddlWebTransactionItemPriceImpl(
		final BigDecimal newBasePrice,
		final String newVoucherCode,
		final BigDecimal newVoucherDiscount,
		final String newCurrency,
		final BigDecimal newTaxRate,
		final BigDecimal newShipping,
		final String newShippingMethod,
		final BigDecimal newPriceWithTax
	) {
		this.basePrice = newBasePrice;
		this.voucherCode = newVoucherCode;
		this.voucherDiscount = newVoucherDiscount;
		this.currency = newCurrency;
		this.taxRate = newTaxRate;
		this.shipping = newShipping;
		this.shippingMethod = newShippingMethod;
		this.priceWithTax = newPriceWithTax;
	}
	
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	
	public String getVoucherCode() {
		return voucherCode;
	}
	
	public BigDecimal getVoucherDiscount() {
		return voucherDiscount;
	}
	
	public String getCurrency() {
		return currency;
	}

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public BigDecimal getShipping() {
		return shipping;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public BigDecimal getPriceWithTax() {
		return priceWithTax;
	}

	public static class Builder {
		private BigDecimal nestedBasePrice;
		private String nestedVoucherCode;
		private BigDecimal nestedVoucherDiscount;
		private String nestedCurrency;
		private BigDecimal nestedTaxRate;
		private BigDecimal nestedShipping;
		private String nestedShippingMethod;
		private BigDecimal nestedPriceWithTax;
		
		public Builder basePrice(final BigDecimal newBasePrice) {
			this.nestedBasePrice = newBasePrice;
			return this;
		}
		
		public Builder voucherCode(final String newVoucherCode) {
			this.nestedVoucherCode = newVoucherCode;
			return this;
		}
		
		public Builder voucherDiscount(final BigDecimal newVoucherDiscount) {
			this.nestedVoucherDiscount = newVoucherDiscount;
			return this;
		}
		
		public Builder currency(final String newCurrency) {
			this.nestedCurrency = newCurrency;
			return this;
		}
		
		public Builder taxRate(final BigDecimal newTaxRate) {
			this.nestedTaxRate = newTaxRate;
			return this;
		}
		
		public Builder shipping(final BigDecimal newShipping) {
			this.nestedShipping = newShipping;
			return this;
		}
		
		public Builder shippingMethod(final String newShippingMethod) {
			this.nestedShippingMethod = newShippingMethod;
			return this;
		}
		
		public Builder priceWithTax(final BigDecimal newPriceWithTax) {
			this.nestedPriceWithTax = newPriceWithTax;
			return this;
		}
		
		public CeddlWebTransactionItemPriceImpl build() {
			return new CeddlWebTransactionItemPriceImpl(
				nestedBasePrice,
				nestedVoucherCode,
				nestedVoucherDiscount,
				nestedCurrency,
				nestedTaxRate,
				nestedShipping,
				nestedShippingMethod,
				nestedPriceWithTax
			);
		}
	}
}
