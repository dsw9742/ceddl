package com.douglaswhitehead.model.digitaldata.transaction;

import java.math.BigDecimal;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Total interface.
 * 
 * @author Douglas.Whitehead
 *
 */
public class TotalImpl extends BaseImpl implements Total {

	/**
	 * String constant for <tt>basePrice</tt>.
	 */
	private final static String BASE_PRICE = "basePrice";
	
	/**
	 * String constant for <tt>voucherCode</tt>.
	 */
	private final static String VOUCHER_CODE = "voucherCode";
	
	/**
	 * String constant for <tt>voucherDiscount</tt>.
	 */
	private final static String VOUCHER_DISCOUNT = "voucherDiscount";
	
	/**
	 * String constant for <tt>currency</tt>.
	 */
	private final static String CURRENCY = "currency";
	
	/**
	 * String constant for <tt>taxRate</tt>.
	 */
	private final static String TAX_RATE = "taxRate";
	
	/**
	 * String constant for <tt>shipping</tt>.
	 */
	private final static String SHIPPING = "shipping";
	
	/**
	 * String constant for <tt>shippingMethod</tt>.
	 */
	private final static String SHIPPING_METHOD = "shippingMethod";
	
	/**
	 * String constant for <tt>priceWithTax</tt>.
	 */
	private final static String PRICE_WITH_TAX = "priceWithTax";
	
	/**
	 * String constant for <tt>transactionTotal</tt>.
	 */
	private final static String TRANSACTION_TOTAL = "transactionTotal";
	
	/**
	 * TotalImpl constructor.
	 * 
	 * @param Security security
	 * @param BigDecimal basePrice
	 * @param String voucherCode
	 * @param BigDecimal voucherDiscount
	 * @param String currency
	 * @param BigDecimal taxRate
	 * @param BigDecimal shipping
	 * @param String shippingMethod
	 * @param BigDecimal priceWithTax
	 * @param BigDecimal transactionTotal
	 */
	private TotalImpl(
		final Security security,
		final BigDecimal basePrice,
		final String voucherCode,
		final BigDecimal voucherDiscount,
		final String currency,
		final BigDecimal taxRate,
		final BigDecimal shipping,
		final String shippingMethod,
		final BigDecimal priceWithTax,
		final BigDecimal transactionTotal
	) {
		this.security = security;
		this.map.put(BASE_PRICE, basePrice);
		this.map.put(VOUCHER_CODE, voucherCode);
		this.map.put(VOUCHER_DISCOUNT, voucherDiscount);
		this.map.put(CURRENCY, currency);
		this.map.put(TAX_RATE, taxRate);
		this.map.put(SHIPPING, shipping);
		this.map.put(SHIPPING_METHOD, shippingMethod);
		this.map.put(PRICE_WITH_TAX, priceWithTax);
		this.map.put(TRANSACTION_TOTAL, transactionTotal);
	}
	
	/**
	 * Returns the BasePrice object.
	 * 
	 * @return BigDecimal
	 */
	@Override
	public BigDecimal getBasePrice() {
		return (BigDecimal)map.get(BASE_PRICE);
	}
	
	/**
	 * Returns the VoucherCode object.
	 * 
	 * @return String
	 */
	@Override
	public String getVoucherCode() {
		return (String)map.get(VOUCHER_CODE);
	}
	
	/**
	 * Returns the VoucherDiscount object.
	 * 
	 * @return BigDecimal
	 */
	@Override
	public BigDecimal getVoucherDiscount() {
		return (BigDecimal)map.get(VOUCHER_DISCOUNT);
	}
	
	/**
	 * Returns the Currency object.
	 * 
	 * @return String
	 */
	@Override
	public String getCurrency() {
		return (String)map.get(CURRENCY);
	}

	/**
	 * Returns the TaxRate object.
	 * 
	 * @return BigDecimal
	 */
	@Override
	public BigDecimal getTaxRate() {
		return (BigDecimal)map.get(TAX_RATE);
	}

	/**
	 * Returns the Shipping object.
	 * 
	 * @return BigDecimal
	 */
	@Override
	public BigDecimal getShipping() {
		return (BigDecimal)map.get(SHIPPING);
	}

	/**
	 * Returns the ShippingMethod object.
	 * 
	 * @return String
	 */
	@Override
	public String getShippingMethod() {
		return (String)map.get(SHIPPING_METHOD);
	}

	/**
	 * Returns the PriceWithTax object.
	 * 
	 * @return BigDecimal
	 */
	@Override
	public BigDecimal getPriceWithTax() {
		return (BigDecimal)map.get(PRICE_WITH_TAX);
	}

	/**
	 * Returns the TransactionTotal object. 
	 * 
	 * @return BigDecimal
	 */
	@Override
	public BigDecimal getTransactionTotal() {
		return (BigDecimal)map.get(TRANSACTION_TOTAL);
	}

	/**
	 * Implementation of the Transaction.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Total.Builder {
		
		/**
		 * Builds the BasePrice object.
		 * 
		 * @param BigDecimal BasePrice
		 * @return Builder
		 */
		@Override
		public Builder basePrice(final BigDecimal basePrice) {
			this.map.put(BASE_PRICE, basePrice);
			this.previous = BASE_PRICE;
			return builder();
		}
		
		/**
		 * Builds the VoucherCode object.
		 * 
		 * @param String VoucherCode
		 * @return Builder
		 */
		@Override
		public Builder voucherCode(final String voucherCode) {
			this.map.put(VOUCHER_CODE, voucherCode);
			this.previous = VOUCHER_CODE;
			return builder();
		}
		
		/**
		 * Builds the VoucherDiscount object.
		 * 
		 * @param BigDecimal VoucherDiscount
		 * @return Builder
		 */
		@Override
		public Builder voucherDiscount(final BigDecimal voucherDiscount) {
			this.map.put(VOUCHER_DISCOUNT, voucherDiscount);
			this.previous = VOUCHER_DISCOUNT;
			return builder();
		}
		
		/**
		 * Builds the Currency object.
		 * 
		 * @param String currency
		 * @return Builder
		 */
		@Override
		public Builder currency(final String currency) {
			this.map.put(CURRENCY, currency);
			this.previous = CURRENCY;
			return builder();
		}
		
		/**
		 * Builds the TaxRate object.
		 * 
		 * @param BigDecimal taxRate
		 * @return Builder
		 */
		@Override
		public Builder taxRate(final BigDecimal taxRate) {
			this.map.put(TAX_RATE, taxRate);
			this.previous = TAX_RATE;
			return builder();
		}
		
		/**
		 * Builds the Shipping object.
		 * 
		 * @param BigDecimal shipping
		 * @return Builder
		 */
		@Override
		public Builder shipping(final BigDecimal shipping) {
			this.map.put(SHIPPING, shipping);
			this.previous = SHIPPING;
			return builder();
		}
		
		/**
		 * Builds the ShippingMethod object.
		 * 
		 * @param String shippingMethod
		 * @return Builder
		 */
		@Override
		public Builder shippingMethod(final String shippingMethod) {
			this.map.put(SHIPPING_METHOD, shippingMethod);
			this.previous = SHIPPING_METHOD;
			return builder();
		}
		
		/**
		 * Builds the PriceWithTax object.
		 * 
		 * @param BigDecimal priceWithTax
		 * @return Builder
		 */
		@Override
		public Builder priceWithTax(final BigDecimal priceWithTax) {
			this.map.put(PRICE_WITH_TAX, priceWithTax);
			this.previous = PRICE_WITH_TAX;
			return builder();
		}
		
		/**
		 * Builds the TransactionTotal object.
		 * 
		 * @param BigDecimal transactionTotal
		 * @return Builder
		 */
		@Override
		public Builder transactionTotal(final BigDecimal transactionTotal) {
			this.map.put(TRANSACTION_TOTAL, transactionTotal);
			this.previous = TRANSACTION_TOTAL;
			return builder();
		}
		
		/**
		 * Builds and returns the TotalImpl object.
		 * 
		 * @return TotalImpl
		 */
		@Override
		public TotalImpl build() {
			return new TotalImpl(
				security,
				(BigDecimal)map.get(BASE_PRICE),
				(String)map.get(VOUCHER_CODE),
				(BigDecimal)map.get(VOUCHER_DISCOUNT),
				(String)map.get(CURRENCY),
				(BigDecimal)map.get(TAX_RATE),
				(BigDecimal)map.get(SHIPPING),
				(String)map.get(SHIPPING_METHOD),
				(BigDecimal)map.get(PRICE_WITH_TAX),
				(BigDecimal)map.get(TRANSACTION_TOTAL)
			);
		}
		
		/**
		 * Returns the builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}
}
