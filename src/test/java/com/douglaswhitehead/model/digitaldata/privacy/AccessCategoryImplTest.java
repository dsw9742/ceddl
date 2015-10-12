package com.douglaswhitehead.model.digitaldata.privacy;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccessCategoryImplTest {
	
	private static final String VALID = "{\"categoryName\":\"Analytics\",\"domains\":[\"test1.com\",\"test2.com\"]}";
	
	@Test
	public void test() throws Exception {
		
		AccessCategory object = new AccessCategoryImpl.Builder()
										.categoryName("Analytics")
										.domains(new String[]{"test1.com","test2.com"})
									.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}