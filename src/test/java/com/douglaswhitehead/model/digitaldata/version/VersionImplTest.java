package com.douglaswhitehead.model.digitaldata.version;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VersionImplTest {
	
	private static final String VALID = "{\"security\":{\"version\":[\"Analytics\"]},\"version\":\"1.0\"}";
	
	@Test
	public void test() throws Exception {
		
		Version object = new VersionImpl.Builder()
								.version("1.0").security(new String[]{"Analytics"})
							.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}
}
