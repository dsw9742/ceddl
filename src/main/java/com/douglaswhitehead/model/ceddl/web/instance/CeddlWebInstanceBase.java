package com.contentualize.model.ceddl.web.instance;

import org.springframework.beans.factory.annotation.Autowired;

import com.contentualize.model.User;
import com.contentualize.model.ceddl.web.CeddlWeb;
import com.contentualize.model.ceddl.web.CeddlWebWithProduct;
import com.contentualize.model.ceddl.web.CeddlWebWithTransaction;
import com.contentualize.model.ceddl.web.cart.CeddlWebCart;
import com.contentualize.model.ceddl.web.page.CeddlWebPage;
import com.contentualize.model.ceddl.web.product.CeddlWebProduct;
import com.contentualize.model.ceddl.web.transaction.CeddlWebTransaction;
import com.contentualize.model.ceddl.web.user.CeddlWebUser;
import com.contentualize.model.ceddl.web.user.UserToCeddlWebUser;
import com.contentualize.security.CurrentUser;
import com.contentualize.security.CurrentUserImpl;

public abstract class CeddlWebInstanceBase implements CeddlWeb, CeddlWebWithProduct, CeddlWebWithTransaction {
	
	protected String pageInstanceId;
	protected CeddlWebPage page;
	protected CeddlWebProduct[] product;
	protected CeddlWebCart cart;
	protected CeddlWebTransaction transaction;
	protected CeddlWebUser[] user;
	protected String version;
	
	@Autowired
	private CurrentUser currentUserBean;
	
	protected CeddlWebCart buildCart() {
		//TODO: fully implement this once there are products that can be put into a cart
		CeddlWebCart cart = null;
		return cart;
	}
	
	protected CeddlWebUser[] buildUser() {
		CeddlWebUser[] users = new CeddlWebUser[1];
		//User currentUser = CurrentUserImpl.getUser();
		User currentUser = currentUserBean.getUser();
		if (currentUser == null) {
			users[0] = null;
		} else {
			users[0] = UserToCeddlWebUser.userToCeddlWebUser(currentUser);
		}
		return users;
	}
	
	protected String buildVersion() {
		return "1.0";
	}
	
	public String getPageInstanceId() {
		return pageInstanceId;
	}
	
	public CeddlWebPage getPage() {
		return page;
	}
	
	public CeddlWebProduct[] getProduct() {
		return product;
	}
	
	public CeddlWebCart getCart() {
		return cart;
	}
	
	public CeddlWebTransaction getTransaction() {
		return transaction;
	}
	
	public CeddlWebUser[] getUser() {
		return user;
	}
	
	public String getVersion() {
		return version;
	}

}
