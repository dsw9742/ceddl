package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the ProfileInfo interface.
 * 
 * @author douglas whitehead
 *
 */
public class ProfileInfoImpl extends BaseImpl implements ProfileInfo {

	/**
	 * String constant for <tt>profileID</tt>.
	 */
	private final static String PROFILE_ID = "profileID";
	
	/**
	 * String constant for <tt>userName</tt>.
	 */
	private final static String USER_NAME = "userName";
	
	/**
	 * String constant for <tt>email</tt>.
	 */
	private final static String EMAIL = "email";
	
	/**
	 * String constant for <tt>language</tt>.
	 */
	private final static String LANGUAGE = "language";
	
	/**
	 * String constant for <tt>returningStatus</tt>.
	 */
	private final static String RETURNING_STATUS = "returningStatus";
	
	/**
	 * String constant for <tt>type</tt>.
	 */
	private final static String TYPE = "type";
	
	/**
	 * ProfileInfoImpl constructor.
	 * 
	 * @param Security security
	 * @param String profileID
	 * @param String userName
	 * @param String email
	 * @param String language
	 * @param String returningStatus
	 * @param String type
	 */
	private ProfileInfoImpl(
		final Security security,
		final String profileID,
		final String userName,
		final String email,
		final String language,
		final String returningStatus,
		final String type
	) {
		this.security = security;
		this.map.put(PROFILE_ID, profileID);
		this.map.put(USER_NAME, userName);
		this.map.put(EMAIL, email);
		this.map.put(LANGUAGE, language);
		this.map.put(RETURNING_STATUS, returningStatus);
		this.map.put(TYPE, type);
	}
	
	/**
	 * Returns the ProfileID object.
	 * 
	 * @return String
	 */
	public String getProfileID() {
		return (String)map.get(PROFILE_ID);
	}
	
	/**
	 * Returns the UserName object.
	 * 
	 * @return String
	 */
	public String getUserName() {
		return (String)map.get(USER_NAME);
	}
	
	/**
	 * Returns the Email object.
	 * 
	 * @return String
	 */
	public String getEmail() {
		return (String)map.get(EMAIL);
	}
	
	/**
	 * Returns the Language object.
	 * 
	 * @return String
	 */
	public String getLanguage() {
		return (String)map.get(LANGUAGE);
	}
	
	/**
	 * Returns the ReturningStatus object.
	 * 
	 * @return String
	 */
	public String getReturningStatus() {
		return (String)map.get(RETURNING_STATUS);
	}
	
	/**
	 * Returns the Type object.
	 * 
	 * @return String
	 */
	public String getType() {
		return (String)map.get(TYPE);
	}
	
	/**
	 * Implementation of the ProfileInfo.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements ProfileInfo.Builder {

		/**
		 * Builds the ProfileID object.
		 * 
		 * @param String profileID
		 * @return Builder
		 */
		@Override
		public Builder profileID(final String profileID) {
			this.map.put(PROFILE_ID, profileID);
			this.previous = PROFILE_ID;
			return builder();
		}
		
		/**
		 * Builds the UserName object.
		 * 
		 * @param String userName
		 * @return Builder
		 */
		@Override
		public Builder userName(final String userName) {
			this.map.put(USER_NAME, userName);
			this.previous = USER_NAME;
			return builder();
		}
		
		/**
		 * Builds the Email object.
		 * 
		 * @param String email
		 * @return Builder
		 */
		@Override
		public Builder email(final String email) {
			this.map.put(EMAIL, email);
			this.previous = EMAIL;
			return builder();
		}
		
		/**
		 * Builds the Language object.
		 * 
		 * @param String language
		 * @return Builder
		 */
		@Override
		public Builder language(final String language) {
			this.map.put(LANGUAGE, language);
			this.previous = LANGUAGE;
			return builder();
		}
		
		/**
		 * Builds the ReturningStatus object.
		 * 
		 * @param String returningStatus
		 * @return Builder
		 */
		@Override
		public Builder returningStatus(final String returningStatus) {
			this.map.put(RETURNING_STATUS, returningStatus);
			this.previous = RETURNING_STATUS;
			return builder();
		}
		
		/**
		 * Builds the Type object.
		 * 
		 * @param String type
		 * @return Builder
		 */
		@Override
		public Builder type(final String type) {
			this.map.put(TYPE, type);
			this.previous = TYPE;
			return builder();
		}
		
		/**
		 * Builds and returns the ProfileImpl object.
		 * 
		 * @return ProfileInfoImpl
		 */
		public ProfileInfoImpl build() {
			return new ProfileInfoImpl(
				security,
				(String)map.get(PROFILE_ID),
				(String)map.get(USER_NAME),
				(String)map.get(EMAIL),
				(String)map.get(LANGUAGE),
				(String)map.get(RETURNING_STATUS),
				(String)map.get(TYPE)
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
