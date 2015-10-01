package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.cart.CartImpl;
import com.douglaswhitehead.model.digitaldata.page.CeddlWebPage;
import com.douglaswhitehead.model.digitaldata.page.CeddlWebPageImpl;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProduct;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProductImpl;
import com.douglaswhitehead.model.digitaldata.transaction.CeddlWebTransaction;
import com.douglaswhitehead.model.digitaldata.transaction.CeddlWebTransactionImpl;
import com.douglaswhitehead.model.digitaldata.user.CeddlWebUser;
import com.douglaswhitehead.model.digitaldata.user.CeddlWebUserImpl;

public class MockDigitalDataImpl implements DigitalData {

	@Override
	public String getPageInstanceId() {
		return "mock-ceddl";
	}

	@Override
	public CeddlWebPage getPage() {
		return new CeddlWebPageImpl.Builder().build();
	}
	
	@Override
	public CeddlWebProduct[] getProduct() {
		CeddlWebProduct[] products = new CeddlWebProduct[1];
		products[0] = new CeddlWebProductImpl.Builder().build();
		return products;
	}
	
	@Override
	public Cart getCart() {
		return new CartImpl.Builder().build();
	}
	
	@Override
	public CeddlWebTransaction getTransaction() {
		return new CeddlWebTransactionImpl.Builder().build();
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
