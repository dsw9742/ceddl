package com.douglaswhitehead.model.digitaldata.common;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CategoryImplTest {

	private static final String VALID = "{\"primaryCategory\":\"testCat\"}";
	
	@Test
	public void test() throws Exception {
		
		Category object = new CategoryImpl.Builder()
									.primaryCategory("testCat")
								.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
		
	}

}