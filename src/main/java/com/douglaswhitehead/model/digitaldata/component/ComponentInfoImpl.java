package com.douglaswhitehead.model.digitaldata.component;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the ComponentInfo interface.
 * 
 * @author Douglas.Whitehead
 * 
 */
public class ComponentInfoImpl extends BaseImpl implements ComponentInfo {

	/**
	 * String constant fot <tt>componentID</tt>.
	 */
	private final static String COMPONENT_ID = "componentID";
	
	/**
	 * ComponentInfoImpl constructor.
	 * 
	 * @param Security security
	 * @param String componentID
	 */
	private ComponentInfoImpl(
		final Security security,
		final String componentID
	) {
		this.security = security;
		this.map.put(COMPONENT_ID, componentID);
	}

	/**
	 * Returns the ComponentID object.
	 * 
	 * @return String
	 */
	@Override
	public String getComponentID() {
		return (String)map.get(COMPONENT_ID);
	}
	
	/**
	 * Implementation of the ComponentInfo.Builder interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements ComponentInfo.Builder {

		/**
		 * Builds the ComponentID object.
		 * 
		 * @param String componentID
		 * @return Builder
		 */
		@Override
		public Builder componentID(final String componentID) {
			this.map.put(COMPONENT_ID, componentID);
			this.previous = COMPONENT_ID;
			return builder();
		}
		
		/**
		 * Builds and returns the ComponentInfoImpl object.
		 * 
		 * @return ComponentInfoImpl
		 */
		@Override
		public ComponentInfoImpl build() {
			return new ComponentInfoImpl(
				security,
				(String)map.get(COMPONENT_ID)
			);
		}
		
		/**
		 * Returns the Builder.
		 * 		
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}

}
