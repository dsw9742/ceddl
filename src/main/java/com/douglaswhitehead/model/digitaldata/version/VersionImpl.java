package com.douglaswhitehead.model.digitaldata.version;

import java.util.Map;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

/**
 * Implementation of the Version interface.
 * 
 * @author douglas.whitehead
 *
 */
public class VersionImpl extends BaseImpl implements Version {
	
	/**
	 * String constant for <tt>version</tt>.
	 */
	private static final String VERSION = "version";
	
	/**
	 * VersionImpl constructor.
	 * 
	 * @param Security security
	 * @param String version
	 */
	private VersionImpl(
		final Security security,
		final String version
	) {
		this.security = security;
		this.map.put(VERSION, version);
	}

	/**
	 * Returns the internal map of Version properties as a Version object.
	 * 
	 * @return String
	 */
	@JsonAnyGetter
	@Override
	public Map<String, Object> getMap() {
		return map;
	}
	
	/**
	 * Implementation of the Version.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Version.Builder {

		/**
		 * Builds the Version object.
		 * 
		 * @param String version
		 * @return Builder
		 */
		@Override
		public Builder version(String version) {
			this.map.put(VERSION, version);
			this.previous = VERSION;
			return builder();
		}

		/**
		 * Builds and returns the VersionImpl object.
		 * 
		 * @return VersionImpl
		 */
		@Override
		public Version build() {
			return new VersionImpl(
				security,
				(String)map.get(VERSION)
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
