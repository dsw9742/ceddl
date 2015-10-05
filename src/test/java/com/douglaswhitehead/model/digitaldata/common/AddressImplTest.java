package com.douglaswhitehead.model.digitaldata.common;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddressImplTest {

	private static final String VALID = "{\"country\":\"test country\",\"stateProvince\":\"test state\",\"postalCode\":\"55555\",\"line1\":\"555 test street\",\"line2\":\"apt test\",\"city\":\"test town\"}";
	
	@Test
	public void test() throws Exception {
		
		Address object = new AddressImpl.Builder()
							.line1("555 test street").security(new String[]{"Analytics"})
							.line2("apt test").security(new String[]{"Analytics"})
							.city("test town")
							.stateProvince("test state")
							.postalCode("55555")
							.country("test country")
						.build();

		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
		
	}

}
