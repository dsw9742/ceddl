package com.douglaswhitehead.model.digitaldata.common;

import java.math.BigDecimal;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.cart.PriceImpl;
import com.douglaswhitehead.model.digitaldata.product.ProductImpl;
import com.douglaswhitehead.model.digitaldata.product.ProductInfoImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ItemImplTest {
	
	private static final String VALID = "{\"productInfo\":{\"security\":{\"productName\":[\"Analytics\"]},\"productName\":\"Rogaine\",\"productImage\":\"http://site.com/rog300_large.png\",\"productThumbnail\":\"http://site.com/rog300_thumb.png\",\"manufacturer\":\"Pharma\",\"productID\":\"rog3000\",\"sku\":\"ABC123-456D\",\"productURL\":\"http://site.com/r.html\",\"color\":\"brown\",\"description\":\"Hair Regrowth\",\"size\":\"300ml\"},\"linkedProduct\":[{\"productInfo\":{\"security\":{\"productName\":[\"Analytics\"]},\"productName\":\"Propecia\",\"productImage\":\"http://site.com/pro250_large.png\",\"productThumbnail\":\"http://site.com/pro250_thumb.png\",\"manufacturer\":\"Pharma\",\"productID\":\"pro2500\",\"sku\":\"DEF789-012G\",\"productURL\":\"http://site.com/p.html\",\"color\":\"black\",\"description\":\"Hair Regrowth\",\"size\":\"250ml\"}}],\"price\":{\"shipping\":5.00,\"shippingMethod\":\"UPS\",\"priceWithTax\":120,\"cartTotal\":125,\"basePrice\":200.00,\"voucherCode\":\"Alpha\",\"voucherDiscount\":0.50,\"taxRate\":0.20,\"currency\":\"EUR\"},\"quantity\":1,\"category\":{\"primaryCategory\":\"Haircare\"}}";
	
	@Test
	public void test() throws Exception {
		
		Item object = new ItemImpl.Builder()
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
										.cartTotal(new BigDecimal("125"))
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
								.attributes(new AttributesImpl.Builder().build())
							.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
