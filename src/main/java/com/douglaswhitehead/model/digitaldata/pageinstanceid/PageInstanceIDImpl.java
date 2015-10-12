package com.douglaswhitehead.model.digitaldata.pageinstanceid;

import java.util.Map;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class PageInstanceIDImpl extends BaseImpl implements PageInstanceID {
	
	/**
	 * String constant for <tt>pageInstanceID</tt>.
	 */
	private static final String PAGE_INSTANCE_ID = "pageInstanceID";
	
	/**
	 * PageInstanceIDImpl constructor.
	 * 
	 * @param Security security
	 * @param String pageInstanceID
	 */
	private PageInstanceIDImpl(
		final Security security,
		final String pageInstanceID
	) {
		this.security = security;
		this.map.put(PAGE_INSTANCE_ID, pageInstanceID);
	}
	
	/**
	 * Returns the internal map of PageInstanceID properties as a PageInstance object.
	 * 
	 * @return String
	 */
	@JsonAnyGetter
	@Override
	public Map<String, Object> getMap() {
		return map;
	}

	/**
	 * Implementation of the PageInstanceID.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements PageInstanceID.Builder {

		/**
		 * Builds the PageInstanceID object.
		 * 
		 * @param String pageInstanceID
		 * @return Builder
		 */
		@Override
		public Builder pageInstanceID(String pageInstanceID) {
			this.map.put(PAGE_INSTANCE_ID, pageInstanceID);
			this.previous = PAGE_INSTANCE_ID;
			return builder();
		}

		/**
		 * Builds and returns the PageInstanceID object.
		 * 
		 * @return PageInstanceID
		 */
		@Override
		public PageInstanceID build() {
			return new PageInstanceIDImpl(
				security,
				(String)map.get(PAGE_INSTANCE_ID)
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
