package com.douglaswhitehead.model.digitaldata.transaction;

import java.math.BigDecimal;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TotalImplTest {
	
	private static final String VALID = "{\"basePrice\":200.00,\"voucherCode\":\"Alpha\",\"voucherDiscount\":0.50,\"taxRate\":0.20,\"shipping\":5,\"shippingMethod\":\"UPS\",\"priceWithTax\":120,\"transactionTotal\":125,\"currency\":\"EUR\"}";
	
	@Test
	public void test() throws Exception {
		Total object = new TotalImpl.Builder()
								.basePrice(new BigDecimal("200.00"))
								.voucherCode("Alpha")
								.voucherDiscount(new BigDecimal("0.50"))
								.currency("EUR")
								.taxRate(new BigDecimal("0.20"))
								.shipping(new BigDecimal("5"))
								.shippingMethod("UPS")
								.priceWithTax(new BigDecimal("120"))
								.transactionTotal(new BigDecimal("125"))
							.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
