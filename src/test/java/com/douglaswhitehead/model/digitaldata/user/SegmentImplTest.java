package com.douglaswhitehead.model.digitaldata.user;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SegmentImplTest {

	private static final String VALID = "{}";
	
	@Test
	public void test() throws Exception {
		
		Segment object = new SegmentImpl.Builder()
								.build();

		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
		
	}

}