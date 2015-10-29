package com.douglaswhitehead.model.digitaldata.privacy;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Privacy interface.
 * 
 * @author douglas.whitehead
 *
 */
public class PrivacyImpl implements Privacy {
	
	/**
	 * Variable for DEFAULT_ACCESS_CATEGORY object.
	 */
	private final static AccessCategory DEFAULT_ACCESS_CATEGORY = new AccessCategoryImpl.Builder()
																		.categoryName("Default")
																		.domains(new String[]{"*"})
																	.build();
	
	/**
	 * Variable for <tt>accessCategories</tt> object.
	 */
	//private List<AccessCategory> accessCategories = new ArrayList<AccessCategory>();
	private AccessCategory accessCategories[];
	
	/**
	 * PrivacyImpl constructor.
	 * 
	 * @param accessCategories
	 */
	private PrivacyImpl(
		final AccessCategory[] accessCategories
	) {
		/*this.accessCategories.clear();
		for (AccessCategory accessCategory: accessCategories) {
			this.accessCategories.add(accessCategory);
		}*/
		this.accessCategories = accessCategories;
	}
	
	/**
	 * Returns the AccessCategory[] array.
	 * 
	 * @return AccessCategory[]
	 */
	@Override
	public AccessCategory[] getAccessCategories() {
		//return accessCategories.toArray(new AccessCategory[accessCategories.size()]);
		return accessCategories;
	}
	
	/**
	 * Implementation of the Privacy.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder implements Privacy.Builder {
		
		/**
		 * Variable for <tt>accessCategories</tt> array.
		 */
		private AccessCategory[] accessCategories;
		
		/**
		 * Builds the AccessCategory[] array.
		 * 
		 * @param AccessCategory[] accessCategories
		 * @return Builder
		 */
		@Override
		public Builder accessCategories(
			final AccessCategory[] accessCategories
		) {
			this.accessCategories = accessCategories;
			return builder();
		}
		
		/**
		 * Builds and returns the PrivacyImpl object.
		 * 
		 * @return PrivacyImpl
		 */
		@Override
		public PrivacyImpl build() {
			return new PrivacyImpl(
				safeguardDefaultAccessCategory(accessCategories)
			);
		}
		
		/**
		 * Ensures the DEFAULT_ACCESS_CATEGORY object is added to the AccessCategory[] array.
		 * 
		 * @param AccessCategory[] accessCategories
		 * @return AccessCategory[]
		 */
		private AccessCategory[] safeguardDefaultAccessCategory(final AccessCategory[] accessCategories) {
			List<AccessCategory> _accessCategories = new ArrayList<AccessCategory>();
			if (accessCategories != null) {
				for (AccessCategory accessCategory: accessCategories) {
					_accessCategories.add(accessCategory);
				}
			}
			_accessCategories.add(DEFAULT_ACCESS_CATEGORY);
			return _accessCategories.toArray(new AccessCategory[_accessCategories.size()]);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		private Builder builder() {
			return this;
		}
		
	}	

}
