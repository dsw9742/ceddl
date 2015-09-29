package com.contentualize.model.ceddl.web;

import com.contentualize.model.ceddl.Ceddl;
import com.contentualize.model.ceddl.web.cart.CeddlWebCart;
import com.contentualize.model.ceddl.web.page.CeddlWebPage;
import com.contentualize.model.ceddl.web.user.CeddlWebUser;

public interface CeddlWeb extends Ceddl {

	public String getPageInstanceId();
	
	public CeddlWebPage getPage();
	
	public CeddlWebCart getCart();
	
	public CeddlWebUser[] getUser();
	
	public String getVersion();
	
}
