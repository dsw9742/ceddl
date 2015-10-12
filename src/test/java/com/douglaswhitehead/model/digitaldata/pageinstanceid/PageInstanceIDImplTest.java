package com.douglaswhitehead.model.digitaldata.pageinstanceid;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.pageinstanceid.PageInstanceIDImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PageInstanceIDImplTest {
	
	private static final String VALID = "{\"security\":{\"pageInstanceID\":[\"Analytics\"]},\"pageInstanceID\":\"homepage-01-prod\"}";
	
	@Test
	public void test() throws Exception {
		
		PageInstanceID object = new PageInstanceIDImpl.Builder()
										.pageInstanceID("homepage-01-prod").security(new String[]{"Analytics"})
									.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
