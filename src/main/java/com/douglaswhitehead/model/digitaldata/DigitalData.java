package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.cart.CeddlWebCart;
import com.douglaswhitehead.model.digitaldata.page.CeddlWebPage;
import com.douglaswhitehead.model.digitaldata.product.CeddlWebProduct;
import com.douglaswhitehead.model.digitaldata.transaction.CeddlWebTransaction;
import com.douglaswhitehead.model.digitaldata.user.CeddlWebUser;

public interface DigitalData {
	
	public String getPageInstanceId();
	
	public CeddlWebPage getPage();
	
	public CeddlWebProduct[] getProduct();
	
	public CeddlWebCart getCart();
	
	public CeddlWebTransaction getTransaction();
	
	public CeddlWebUser[] getUser();
	
	public String getVersion();
	
}