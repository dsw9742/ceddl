package com.douglaswhitehead.model.ceddl.web;

import com.douglaswhitehead.model.ceddl.Ceddl;
import com.douglaswhitehead.model.ceddl.web.product.CeddlWebProduct;

public interface CeddlWebWithProduct extends Ceddl {

	public CeddlWebProduct[] getProduct();
	
}
