package com.douglaswhitehead.model.digitaldata.transaction;

import java.math.BigDecimal;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.cart.PriceImpl;
import com.douglaswhitehead.model.digitaldata.common.AddressImpl;
import com.douglaswhitehead.model.digitaldata.common.AttributesImpl;
import com.douglaswhitehead.model.digitaldata.common.CategoryImpl;
import com.douglaswhitehead.model.digitaldata.common.ItemImpl;
import com.douglaswhitehead.model.digitaldata.product.ProductImpl;
import com.douglaswhitehead.model.digitaldata.product.ProductInfoImpl;
import com.douglaswhitehead.model.digitaldata.user.ProfileImpl;
import com.douglaswhitehead.model.digitaldata.user.ProfileInfoImpl;
import com.douglaswhitehead.model.digitaldata.user.SocialImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TransactionImplTest {
	
	private static final String VALID = "{\"attributes\":{},\"total\":{\"voucherCode\":\"Alpha\",\"voucherDiscount\":0.50,\"shippingMethod\":\"UPS\",\"priceWithTax\":205,\"basePrice\":350.00,\"currency\":\"EUR\",\"taxRate\":0.20,\"shipping\":10.00,\"transactionTotal\":215},\"item\":[{\"category\":{\"primaryCategory\":\"Haircare\"},\"price\":{\"voucherCode\":\"Alpha\",\"voucherDiscount\":0.50,\"shippingMethod\":\"UPS\",\"priceWithTax\":85,\"basePrice\":150.00,\"currency\":\"EUR\",\"taxRate\":0.20,\"shipping\":5.00},\"productInfo\":{\"security\":{\"productName\":[\"Analytics\"]},\"size\":\"250ml\",\"color\":\"black\",\"description\":\"Hair Regrowth\",\"productName\":\"Propecia\",\"productURL\":\"http://site.com/p.html\",\"productImage\":\"http://site.com/pro250_large.png\",\"productThumbnail\":\"http://site.com/pro250_thumb.png\",\"manufacturer\":\"Pharma\",\"productID\":\"pro2500\",\"sku\":\"DEF789-012G\"},\"linkedProduct\":[{\"productInfo\":{\"security\":{\"productName\":[\"Analytics\"]},\"size\":\"300ml\",\"color\":\"brown\",\"description\":\"Hair Regrowth\",\"productName\":\"Rogaine\",\"productURL\":\"http://site.com/r.html\",\"productImage\":\"http://site.com/rog300_large.png\",\"productThumbnail\":\"http://site.com/rog300_thumb.png\",\"manufacturer\":\"Pharma\",\"productID\":\"rog3000\",\"sku\":\"ABC123-456D\"}}],\"quantity\":1},{\"category\":{\"primaryCategory\":\"Haircare\"},\"price\":{\"voucherCode\":\"Alpha\",\"voucherDiscount\":0.50,\"shippingMethod\":\"UPS\",\"priceWithTax\":120,\"basePrice\":200.00,\"currency\":\"EUR\",\"taxRate\":0.20,\"shipping\":5.00},\"productInfo\":{\"security\":{\"productName\":[\"Analytics\"]},\"size\":\"300ml\",\"color\":\"brown\",\"description\":\"Hair Regrowth\",\"productName\":\"Rogaine\",\"productURL\":\"http://site.com/r.html\",\"productImage\":\"http://site.com/rog300_large.png\",\"productThumbnail\":\"http://site.com/rog300_thumb.png\",\"manufacturer\":\"Pharma\",\"productID\":\"rog3000\",\"sku\":\"ABC123-456D\"},\"linkedProduct\":[{\"productInfo\":{\"security\":{\"productName\":[\"Analytics\"]},\"size\":\"250ml\",\"color\":\"black\",\"description\":\"Hair Regrowth\",\"productName\":\"Propecia\",\"productURL\":\"http://site.com/p.html\",\"productImage\":\"http://site.com/pro250_large.png\",\"productThumbnail\":\"http://site.com/pro250_thumb.png\",\"manufacturer\":\"Pharma\",\"productID\":\"pro2500\",\"sku\":\"DEF789-012G\"}}],\"quantity\":1}],\"profile\":{\"address\":{\"security\":{\"line1\":[\"Analytics\"],\"line2\":[\"Analytics\"]},\"country\":\"test country\",\"city\":\"test town\",\"line2\":\"apt test\",\"line1\":\"555 test street\",\"stateProvince\":\"test state\",\"postalCode\":\"55555\"},\"attributes\":{},\"social\":{},\"profileInfo\":{\"security\":{\"email\":[\"Analytics\"]},\"type\":\"customer\",\"language\":\"en-US\",\"userName\":\"me\",\"profileID\":\"humanbing12345\",\"returningStatus\":\"new\"}},\"transactionID\":\"ABC-123D\"}";

	@Test
	public void test() throws Exception {
		
		Transaction object = new TransactionImpl.Builder()
									.transactionID("ABC-123D")
									.profile(new ProfileImpl.Builder()
											.profileInfo(new ProfileInfoImpl.Builder()
													.profileID("humanbing12345")
													.userName("me")
													.email(null).security(new String[]{"Analytics"})
													.language("en-US")
													.returningStatus("new")
													.type("customer")
												.build())
											.address(new AddressImpl.Builder()
														.line1("555 test street").security(new String[]{"Analytics"})
														.line2("apt test").security(new String[]{"Analytics"})
														.city("test town")
														.stateProvince("test state")
														.postalCode("55555")
														.country("test country")
													.build())
											.shippingAddress(new AddressImpl.Builder()
													.line1("555 test street").security(new String[]{"Analytics"})
													.line2("apt test").security(new String[]{"Analytics"})
													.city("test town")
													.stateProvince("test state")
													.postalCode("55555")
													.country("test country")
												.build())
											.social(new SocialImpl.Builder().build())
											.attributes(new AttributesImpl.Builder().build())
										.build())
									.total(new TotalImpl.Builder()
											.basePrice(new BigDecimal("350.00"))
											.voucherCode("Alpha")
											.voucherDiscount(new BigDecimal("0.50"))
											.currency("EUR")
											.taxRate(new BigDecimal("0.20"))
											.shipping(new BigDecimal("10.00"))
											.shippingMethod("UPS")
											.priceWithTax(new BigDecimal("205"))
											.transactionTotal(new BigDecimal("215"))
										.build())
									.attributes(new AttributesImpl.Builder().build())
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
															//.cartTotal(new BigDecimal("90")) // shouldn't use cartTotal on items in a transaction
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
													.attributes(new AttributesImpl.Builder().build())
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
														//.cartTotal(new BigDecimal("125")) // shouldn't use cartTotal on items in a transaction
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
