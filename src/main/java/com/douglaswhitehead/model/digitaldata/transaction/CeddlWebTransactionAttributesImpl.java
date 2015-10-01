package com.douglaswhitehead.model.digitaldata.transaction;

/**
 * This object provides extensibility to the transaction as a whole. Any additional dimensions
 * related to the cart can be provided. All names are optional and should fit the individual
 * implementation needs in both naming and values passed.
 */
public class CeddlWebTransactionAttributesImpl implements CeddlWebTransactionAttributes {

	private CeddlWebTransactionAttributesImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public CeddlWebTransactionAttributesImpl build() {
			return new CeddlWebTransactionAttributesImpl(
				
			);
		}
		
	}
	
}