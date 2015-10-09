package com.douglaswhitehead.model.digitaldata.component;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComponentInfoImplTest {
	
	private static final String VALID = "{\"componentID\":\"rog300v\"}";
	
	@Test
	public void test() throws Exception {
		ComponentInfo object = new ComponentInfoImpl.Builder()
										.componentID("rog300v")
									.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
