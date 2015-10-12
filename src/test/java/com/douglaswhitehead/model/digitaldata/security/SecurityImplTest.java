package com.douglaswhitehead.model.digitaldata.security;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SecurityImplTest {
	
	private static final String VALID = "{\"key1\":[\"Default\",\"Analytics\"],\"key2\":[\"Ad Server\",\"Data Management Platform\"]}";
	
	@Test
	public void test() throws Exception {
		
		Security object = new SecurityImpl();
		object.secure("key1", new String[]{"Default", "Analytics"});
		object.secure("key2", new String[]{"Ad Server", "Data Management Platform"});
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
