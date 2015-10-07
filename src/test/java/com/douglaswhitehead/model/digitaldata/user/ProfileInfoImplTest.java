package com.douglaswhitehead.model.digitaldata.user;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProfileInfoImplTest {
	
	private static final String VALID = "{\"security\":{\"email\":[\"Analytics\"]},\"profileID\":\"humanbing12345\",\"returningStatus\":\"new\",\"userName\":\"me\",\"language\":\"en-US\",\"type\":\"customer\"}";
	
	@Test
	public void test() throws Exception {
		
		ProfileInfo object = new ProfileInfoImpl.Builder()
									.profileID("humanbing12345")
									.userName("me")
									.email(null).security(new String[]{"Analytics"})
									.language("en-US")
									.returningStatus("new")
									.type("customer")
								.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
