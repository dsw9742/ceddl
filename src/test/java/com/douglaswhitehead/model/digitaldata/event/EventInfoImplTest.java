package com.douglaswhitehead.model.digitaldata.event;

import java.util.Date;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EventInfoImplTest {

	private static final String VALID = "{\"cause\":\"add portal 1234 button clicked\",\"type\":\"contentModifier\",\"timestamp\":1444349360457,\"eventAction\":\"addportal\",\"eventPoints\":200,\"effect\":\"include portal 1234\",\"eventName\":\"Add News Portal\"}";
	
	@Test
	public void test() throws Exception {
		
		EventInfo object = new EventInfoImpl.Builder()
									.eventName("Add News Portal")
									.eventAction("addportal")
									.eventPoints(200)
									.type("contentModifier")
									.timestamp(new Date(Long.valueOf("1444349360457")))
									.cause("add portal 1234 button clicked")
									.effect("include portal 1234")
								.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
	}
}
