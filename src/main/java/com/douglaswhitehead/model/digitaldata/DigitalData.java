package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProduct;
import com.douglaswhitehead.model.digitaldata.transaction.CeddlWebTransaction;
import com.douglaswhitehead.model.digitaldata.user.CeddlWebUser;

public interface DigitalData {
	
	public String getPageInstanceId();
	
	public Page getPage();
	
	public CeddlWebProduct[] getProduct();
	
	public Cart getCart();
	
	public CeddlWebTransaction getTransaction();
	
	public CeddlWebUser[] getUser();
	
	public String getVersion();
	
}