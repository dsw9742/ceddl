package com.douglaswhitehead.model.digitaldata.page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.douglaswhitehead.model.digitaldata.common.CategoryImpl;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PageImplTest {
	
	private static final String VALID = "{\"category\":{\"primaryCategory\":\"testCat\"},\"pageInfo\":{\"language\":\"en-US\",\"variant\":\"2\",\"version\":\"1.01\",\"destinationURL\":\"http://www.test.com/search/results\",\"referringURL\":\"http://www.test.com/\",\"breadcrumbs\":[\"home\",\"search\",\"results\"],\"effectiveDate\":1052712000000,\"expiryDate\":1055390400000,\"industryCodes\":\"5140, 5141\",\"onsiteSearchTerm\":\"testing 123\",\"onsiteSearchResults\":5432,\"sysEnv\":\"desktop\",\"geoRegion\":\"US\",\"publisher\":\"Shirley J Tester\",\"issueDate\":1050120000000,\"pageId\":\"testPageId-prod\",\"pageName\":\"testPageName\",\"author\":\"Test McGee\"}}";
	
	@Test
	public void test() throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
		Date issueDate = simpleDateFormat.parse("12/28/2001");
		Date effectiveDate = simpleDateFormat.parse("12/29/2001");
		Date expiryDate = simpleDateFormat.parse("12/30/2001");
		
		Page object = new PageImpl.Builder()
							.pageInfo(new PageInfoImpl.Builder()
									.pageId("testPageId-prod")
									.pageName("testPageName")
									.destinationURL("http://www.test.com/search/results")
									.referringURL("http://www.test.com/")
									.sysEnv("desktop")
									.variant("2")
									.version("1.01")
									.breadcrumbs(new String[]{"home", "search", "results"})
									.author("Test McGee")
									.issueDate(issueDate)
									.effectiveDate(effectiveDate)
									.expiryDate(expiryDate)
									.language("en-US")
									.geoRegion("US")
									.industryCodes("5140, 5141")
									.publisher("Shirley J Tester")
									.onsiteSearchTerm("testing 123")
									.onsiteSearchResults(5432)
								.build())
							.category(new CategoryImpl.Builder()
												.primaryCategory("testCat")
											.build())
							.attributes(null)
						.build();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String output = mapper.writeValueAsString(object);
		
		System.out.println(VALID);
		System.out.println(output);
		
		JSONAssert.assertEquals(VALID, output, false);
		
	}

}
