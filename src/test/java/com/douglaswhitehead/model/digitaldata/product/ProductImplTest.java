package com.douglaswhitehead.model.digitaldata.product;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.common.AttributesImpl;
import com.douglaswhitehead.model.digitaldata.common.CategoryImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductImplTest {
	
	private static final String VALID = "{\"productInfo\":{\"security\":{\"productName\":[\"Analytics\"]},\"productName\":\"Rogaine\",\"productImage\":\"http://site.com/rog300_large.png\",\"productThumbnail\":\"http://site.com/rog300_thumb.png\",\"manufacturer\":\"Pharma\",\"productID\":\"rog3000\",\"sku\":\"ABC123-456D\",\"productURL\":\"http://site.com/r.html\",\"color\":\"brown\",\"description\":\"Hair Regrowth\",\"size\":\"300ml\"},\"linkedProduct\":[{},{}],\"category\":{\"security\":{\"primaryCategory\":[\"Analytics\"]},\"primaryCategory\":\"Haircare\"}}";
	
	@Test
	public void test() throws Exception {
		
		Product object = new ProductImpl.Builder()
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
									.primaryCategory("Haircare").security(new String[]{"Analytics"})
								.build())
							.linkedProduct(new ProductImpl[]{new ProductImpl.Builder().build(), new ProductImpl.Builder().build()})
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
