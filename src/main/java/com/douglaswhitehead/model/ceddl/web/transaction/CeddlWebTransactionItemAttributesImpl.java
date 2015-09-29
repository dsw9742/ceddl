package com.douglaswhitehead.model.ceddl.web.transaction;

/**
 * This object provides extensibility to each item within the transaction. Any additional dimensions
 * related to the item can be provided. All names are optional and should fit the individual
 * implementation needs in both naming and values passed.
 */
public class CeddlWebTransactionItemAttributesImpl implements CeddlWebTransactionItemAttributes {

	private CeddlWebTransactionItemAttributesImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public CeddlWebTransactionItemAttributesImpl build() {
			return new CeddlWebTransactionItemAttributesImpl(
				
			);
		}
		
	}
	
}