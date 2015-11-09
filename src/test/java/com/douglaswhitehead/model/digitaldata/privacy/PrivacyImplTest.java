package com.douglaswhitehead.model.digitaldata.privacy;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrivacyImplTest {
	
	private static final String VALID = "{\"accessCategories\":[{\"categoryName\":\"Analytics\",\"domains\":[\"*\"]},{\"categoryName\":\"Default\",\"domains\":[\"*\"]}]}";
	
	@Test
	public void test() throws Exception {
		Privacy object = new PrivacyImpl.Builder()
								.accessCategories(new AccessCategory[]{
													new AccessCategoryImpl.Builder()
															.categoryName("Analytics")
															.domains(new String[]{"*"})
														.build()
								})
							.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}

}
