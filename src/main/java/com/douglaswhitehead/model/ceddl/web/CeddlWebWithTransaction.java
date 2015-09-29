package com.contentualize.model.ceddl.web;

import com.contentualize.model.ceddl.Ceddl;
import com.contentualize.model.ceddl.web.transaction.CeddlWebTransaction;

public interface CeddlWebWithTransaction extends Ceddl {

	public CeddlWebTransaction getTransaction();
	
}
