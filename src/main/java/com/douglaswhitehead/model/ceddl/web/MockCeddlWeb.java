package com.douglaswhitehead.model.ceddl.web;

import com.douglaswhitehead.model.ceddl.web.cart.CeddlWebCart;
import com.douglaswhitehead.model.ceddl.web.cart.CeddlWebCartImpl;
import com.douglaswhitehead.model.ceddl.web.page.CeddlWebPageImpl;
import com.douglaswhitehead.model.ceddl.web.user.CeddlWebUser;
import com.douglaswhitehead.model.ceddl.web.user.CeddlWebUserImpl;

public class MockCeddlWeb implements CeddlWeb {

	@Override
	public String getPageInstanceId() {
		return "mock-ceddl";
	}

	@Override
	public CeddlWebPageImpl getPage() {
		return new CeddlWebPageImpl.Builder().build();
	}
	
	@Override
	public CeddlWebCart getCart() {
		return new CeddlWebCartImpl.Builder().build();
	}

	@Override
	public CeddlWebUser[] getUser() {
		CeddlWebUser[] users = new CeddlWebUser[1];
		users[0] = new CeddlWebUserImpl.Builder().build();
		return users;
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

}
