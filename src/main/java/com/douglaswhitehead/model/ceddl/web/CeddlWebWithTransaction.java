package com.douglaswhitehead.model.ceddl.web;

import com.douglaswhitehead.model.ceddl.Ceddl;
import com.douglaswhitehead.model.ceddl.web.transaction.CeddlWebTransaction;

public interface CeddlWebWithTransaction extends Ceddl {

	public CeddlWebTransaction getTransaction();
	
}
