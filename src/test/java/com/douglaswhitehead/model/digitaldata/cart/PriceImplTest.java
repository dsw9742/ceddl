package com.douglaswhitehead.model.digitaldata.cart;

import java.math.BigDecimal;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.cart.Price;
import com.douglaswhitehead.model.digitaldata.cart.PriceImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PriceImplTest {
	
	private static final String VALID = "{\"basePrice\":200.00,\"voucherCode\":\"Alpha\",\"voucherDiscount\":0.50,\"taxRate\":0.20,\"shipping\":5.00,\"shippingMethod\":\"UPS\",\"priceWithTax\":120,\"cartTotal\":125,\"currency\":\"EUR\"}";
	
	@Test
	public void test() throws Exception {
		Price object = new PriceImpl.Builder()
								.basePrice(new BigDecimal("200.00"))
								.voucherCode("Alpha")
								.voucherDiscount(new BigDecimal("0.50"))
								.currency("EUR")
								.taxRate(new BigDecimal("0.20"))
								.shipping(new BigDecimal("5.00"))
								.shippingMethod("UPS")
								.priceWithTax(new BigDecimal("120"))
								.cartTotal(new BigDecimal("125"))
							.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
