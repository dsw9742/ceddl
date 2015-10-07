package com.douglaswhitehead.model.digitaldata.cart;

import java.math.BigDecimal;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Price interface.
 * 
 * @author Douglas.Whitehead
 *
 */
public class PriceImpl extends BaseImpl implements Price {

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
	 * String constant for <tt>cartTotal</tt>.
	 */
	private final static String CART_TOTAL = "cartTotal";
	
	/**
	 * PriceImpl constructor.
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
	 * @param BigDecimal cartTotal
	 */
	private PriceImpl(
		final Security security,
		final BigDecimal basePrice,
		final String voucherCode,
		final BigDecimal voucherDiscount,
		final String currency,
		final BigDecimal taxRate,
		final BigDecimal shipping,
		final String shippingMethod,
		final BigDecimal priceWithTax,
		final BigDecimal cartTotal
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
		this.map.put(CART_TOTAL, cartTotal);
	}
	
	/**
	 * Returns the BasePrice object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getBasePrice() {
		return (BigDecimal)map.get(BASE_PRICE);
	}
	
	/**
	 * Returns the VoucherCode object.
	 * 
	 * @return String
	 */
	public String getVoucherCode() {
		return (String)map.get(VOUCHER_CODE);
	}
	
	/**
	 * Returns the VoucherDiscount object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getVoucherDiscount() {
		return (BigDecimal)map.get(VOUCHER_DISCOUNT);
	}
	
	/**
	 * Returns the Currency object.
	 * 
	 * @return String
	 */
	public String getCurrency() {
		return (String)map.get(CURRENCY);
	}

	/**
	 * Returns the TaxRate object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getTaxRate() {
		return (BigDecimal)map.get(TAX_RATE);
	}

	/**
	 * Returns the Shipping object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getShipping() {
		return (BigDecimal)map.get(SHIPPING);
	}

	/**
	 * Returns the ShippingMethod object.
	 * 
	 * @return String
	 */
	public String getShippingMethod() {
		return (String)map.get(SHIPPING_METHOD);
	}

	/**
	 * Returns the PriceWithTax object.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getPriceWithTax() {
		return (BigDecimal)map.get(PRICE_WITH_TAX);
	}

	/**
	 * Returns the CartTotal object. 
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getCartTotal() {
		return (BigDecimal)map.get(CART_TOTAL);
	}

	/**
	 * Implementation of the Price.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Price.Builder {
		
		/**
		 * Builds the BasePrice object.
		 * 
		 * @param BigDecimal BasePrice
		 * @return Builder
		 */
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
		public Builder priceWithTax(final BigDecimal priceWithTax) {
			this.map.put(PRICE_WITH_TAX, priceWithTax);
			this.previous = PRICE_WITH_TAX;
			return builder();
		}
		
		/**
		 * Builds the CartTotal object.
		 * 
		 * @param BigDecimal cartTotal
		 * @return Builder
		 */
		public Builder cartTotal(final BigDecimal cartTotal) {
			this.map.put(CART_TOTAL, cartTotal);
			this.previous = CART_TOTAL;
			return builder();
		}
		
		/**
		 * Builds and returns the PriceImpl object.
		 * 
		 * @return PriceImpl
		 */
		@Override
		public PriceImpl build() {
			return new PriceImpl(
				security,
				(BigDecimal)map.get(BASE_PRICE),
				(String)map.get(VOUCHER_CODE),
				(BigDecimal)map.get(VOUCHER_DISCOUNT),
				(String)map.get(CURRENCY),
				(BigDecimal)map.get(TAX_RATE),
				(BigDecimal)map.get(SHIPPING),
				(String)map.get(SHIPPING_METHOD),
				(BigDecimal)map.get(PRICE_WITH_TAX),
				(BigDecimal)map.get(CART_TOTAL)
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
