package com.douglaswhitehead.model.digitaldata.common;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CategoryImplTest {

	private static final String VALID = "{\"primaryCategory\":{\"testCat\":{\"security\":[\"Analytics\"]}}}";
	
	@Test
	public void test() throws Exception {
		
		String[] categories = new String[]{"Analytics"};
		
		Category object = new CategoryImpl.Builder().primaryCategory("testCat").security(categories).build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
		
	}

}