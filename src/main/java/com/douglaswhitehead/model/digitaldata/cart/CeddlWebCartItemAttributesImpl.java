package com.douglaswhitehead.model.digitaldata.cart;

/**
 * This object provides extensibility to each item within the cart. Any additional dimensions related
 * to the item can be provided. All names are optional and should fit the individual implementation
 * needs in both naming and values passed.
 */
public class CeddlWebCartItemAttributesImpl implements CeddlWebCartItemAttributes {

	private CeddlWebCartItemAttributesImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public CeddlWebCartItemAttributesImpl build() {
			return new CeddlWebCartItemAttributesImpl(
				
			);
		}
		
	}
	
}