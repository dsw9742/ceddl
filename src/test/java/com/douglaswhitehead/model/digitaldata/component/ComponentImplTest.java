package com.douglaswhitehead.model.digitaldata.component;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.common.AttributesImpl;
import com.douglaswhitehead.model.digitaldata.common.CategoryImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComponentImplTest {
	
private static final String VALID = "{\"attributes\":{},\"category\":{\"primaryCategory\":\"testCat\"},\"componentInfo\":{\"security\":{\"componentID\":[\"Analytics\"]},\"componentID\":\"rog300v\"}}";
	
	@Test
	public void test() throws Exception {
		Component object = new ComponentImpl.Builder()
									.componentInfo(new ComponentInfoImpl.Builder()
											.componentID("rog300v").security(new String[]{"Analytics"})
										.build())
									.category(new CategoryImpl.Builder()
											.primaryCategory("testCat")
										.build())
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
