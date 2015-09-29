package com.douglaswhitehead.model.ceddl.web;

import com.douglaswhitehead.model.ceddl.Ceddl;
import com.douglaswhitehead.model.ceddl.web.cart.CeddlWebCart;
import com.douglaswhitehead.model.ceddl.web.page.CeddlWebPage;
import com.douglaswhitehead.model.ceddl.web.user.CeddlWebUser;

public interface CeddlWeb extends Ceddl {

	public String getPageInstanceId();
	
	public CeddlWebPage getPage();
	
	public CeddlWebCart getCart();
	
	public CeddlWebUser[] getUser();
	
	public String getVersion();
	
}
