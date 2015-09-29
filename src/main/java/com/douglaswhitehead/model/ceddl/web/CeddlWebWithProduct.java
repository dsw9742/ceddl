package com.contentualize.model.ceddl.web;

import com.contentualize.model.ceddl.Ceddl;
import com.contentualize.model.ceddl.web.product.CeddlWebProduct;

public interface CeddlWebWithProduct extends Ceddl {

	public CeddlWebProduct[] getProduct();
	
}
