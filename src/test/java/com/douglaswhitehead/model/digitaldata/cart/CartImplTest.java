package com.douglaswhitehead.model.digitaldata.cart;

import java.math.BigDecimal;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.common.CategoryImpl;
import com.douglaswhitehead.model.digitaldata.common.ItemImpl;
import com.douglaswhitehead.model.digitaldata.product.ProductImpl;
import com.douglaswhitehead.model.digitaldata.product.ProductInfoImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CartImplTest {
	
	private static final String VALID = "";
	
	@Test
	public void test() throws Exception {
		
		Cart object = new CartImpl.Builder()
							.cartID("cart0001-Prod")
							.price(new PriceImpl.Builder()
									.basePrice(new BigDecimal("350.00"))
									.voucherCode("Alpha")
									.voucherDiscount(new BigDecimal("0.50"))
									.currency("EUR")
									.taxRate(new BigDecimal("0.20"))
									.shipping(new BigDecimal("10.00"))
									.shippingMethod("UPS")
									.priceWithTax(new BigDecimal("205"))
									.cartTotal(new BigDecimal("215"))
								.build())
							.attributes(null)
							.item(new ItemImpl[]{
									new ItemImpl.Builder()
										.productInfo(new ProductInfoImpl.Builder()
												.productID("pro2500")
												.productName("Propecia").security(new String[]{"Analytics"})
												.description("Hair Regrowth")
												.productURL("http://site.com/p.html")
												.productImage("http://site.com/pro250_large.png")
												.productThumbnail("http://site.com/pro250_thumb.png")
												.manufacturer("Pharma")
												.sku("DEF789-012G")
												.color("black")
												.size("250ml")
											.build())
										.category(new CategoryImpl.Builder()
												.primaryCategory("Haircare")
											.build())
										.quantity(1)
										.price(new PriceImpl.Builder()
												.basePrice(new BigDecimal("150.00"))
												.voucherCode("Alpha")
												.voucherDiscount(new BigDecimal("0.50"))
												.currency("EUR")
												.taxRate(new BigDecimal("0.20"))
												.shipping(new BigDecimal("5.00"))
												.shippingMethod("UPS")
												.priceWithTax(new BigDecimal("85"))
												//.cartTotal(new BigDecimal("90")) // shouldn't use cartTotal on items in a cart
											.build())
										.linkedProduct(new ProductImpl[]{
												new ProductImpl.Builder()
													.productInfo(new ProductInfoImpl.Builder()
															.productID("rog3000")
															.productName("Rogaine").security(new String[]{"Analytics"})
															.description("Hair Regrowth")
															.productURL("http://site.com/r.html")
															.productImage("http://site.com/rog300_large.png")
															.productThumbnail("http://site.com/rog300_thumb.png")
															.manufacturer("Pharma")
															.sku("ABC123-456D")
															.color("brown")
															.size("300ml")
														.build())
													.build()
												})
										.attributes(null)
									.build(),
								new ItemImpl.Builder()
									.productInfo(new ProductInfoImpl.Builder()
											.productID("rog3000")
											.productName("Rogaine").security(new String[]{"Analytics"})
											.description("Hair Regrowth")
											.productURL("http://site.com/r.html")
											.productImage("http://site.com/rog300_large.png")
											.productThumbnail("http://site.com/rog300_thumb.png")
											.manufacturer("Pharma")
											.sku("ABC123-456D")
											.color("brown")
											.size("300ml")
										.build())
									.category(new CategoryImpl.Builder()
											.primaryCategory("Haircare")
										.build())
									.quantity(1)
									.price(new PriceImpl.Builder()
											.basePrice(new BigDecimal("200.00"))
											.voucherCode("Alpha")
											.voucherDiscount(new BigDecimal("0.50"))
											.currency("EUR")
											.taxRate(new BigDecimal("0.20"))
											.shipping(new BigDecimal("5.00"))
											.shippingMethod("UPS")
											.priceWithTax(new BigDecimal("120"))
											//.cartTotal(new BigDecimal("125")) // shouldn't use cartTotal on items in a cart
										.build())
									.linkedProduct(new ProductImpl[]{
											new ProductImpl.Builder()
													.productInfo(new ProductInfoImpl.Builder()
															.productID("pro2500")
															.productName("Propecia").security(new String[]{"Analytics"})
															.description("Hair Regrowth")
															.productURL("http://site.com/p.html")
															.productImage("http://site.com/pro250_large.png")
															.productThumbnail("http://site.com/pro250_thumb.png")
															.manufacturer("Pharma")
															.sku("DEF789-012G")
															.color("black")
															.size("250ml")
														.build())
												.build()
											})
									.attributes(null)
								.build()
							})
						.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
