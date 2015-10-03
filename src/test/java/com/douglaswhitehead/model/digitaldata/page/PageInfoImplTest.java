package com.douglaswhitehead.model.digitaldata.page;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.utility.TestImpl;

public class PageInfoImplTest {
	
	public void test() throws Exception {
		PageInfo pageInfo = new PageInfoImpl.Builder()
								.pageId("testPageId-prod")
							.build();
	}

}
