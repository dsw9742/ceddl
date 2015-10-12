package com.douglaswhitehead.model.digitaldata.user;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.common.AddressImpl;
import com.douglaswhitehead.model.digitaldata.common.AttributesImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserImplTest {
	
	private static final String VALID = "{\"segment\":{},\"profile\":[{\"address\":{\"security\":{\"line1\":[\"Analytics\"],\"line2\":[\"Analytics\"]},\"country\":\"test country\",\"city\":\"test town\",\"line2\":\"apt test\",\"line1\":\"555 test street\",\"stateProvince\":\"test state\",\"postalCode\":\"55555\"},\"attributes\":{},\"profileInfo\":{\"security\":{\"email\":[\"Analytics\"]},\"type\":\"customer\",\"language\":\"en-US\",\"userName\":\"me\",\"profileID\":\"humanbing12345\",\"returningStatus\":\"new\"},\"social\":{}}]}";
	
	@Test
	public void test() throws Exception {
		
		User object = new UserImpl.Builder()
							.segment(new SegmentImpl.Builder().build())
							.profile(new ProfileImpl[]{
									new ProfileImpl.Builder()
										.profileInfo(new ProfileInfoImpl.Builder()
														.profileID("humanbing12345")
														.userName("me")
														.email("me@test.com").security(new String[]{"Analytics"})
														.language("en-US")
														.returningStatus("new")
														.type("customer")
													.build())
										.address(new AddressImpl.Builder()
													.line1("555 test street").security(new String[]{"Analytics"})
													.line2("apt test").security(new String[]{"Analytics"})
													.city("test town")
													.stateProvince("test state")
													.postalCode("55555")
													.country("test country")
												.build())
										.social(new SocialImpl.Builder().build())
										.attributes(new AttributesImpl.Builder().build())
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
