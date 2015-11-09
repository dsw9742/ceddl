package com.douglaswhitehead.model.digitaldata.product;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductInfoImplTest {
	
	private static final String VALID = "{\"security\":{\"productName\":[\"Analytics\"]},\"size\":\"300ml\",\"color\":\"brown\",\"description\":\"Hair Regrowth\",\"productName\":\"Rogaine\",\"productURL\":\"http://site.com/r.html\",\"productImage\":\"http://site.com/rog300_large.png\",\"productThumbnail\":\"http://site.com/rog300_thumb.png\",\"manufacturer\":\"Pharma\",\"sku\":\"ABC123-456D\",\"productID\":\"rog3000\"}";
	
	@Test
	public void test() throws Exception {
		
		ProductInfo object = new ProductInfoImpl.Builder()
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
								.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
		
	}

}
