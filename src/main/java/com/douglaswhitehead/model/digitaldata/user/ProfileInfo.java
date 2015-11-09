package com.douglaswhitehead.model.digitaldata.user;

/**
 * <p>ProfileInfo interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>An extensible object for providing information about the user.</p>
 * 
 * <pre>
 * {@code
 * 	digitalData.user[0].profile.<b>profileInfo</b> = {
 * 		<b>profileID:</b> "humanbeing12345",
 * 		<b>userName:</b> "me"
 * 	}
 * }
 * </pre>
 * 
 * <p>
 * <b>Reserved:</b> <tt>profileID</tt> (String), <tt>userName</tt> (String), <tt>email</tt> (String), <tt>language</tt> (String),
 * <tt>returningStatus</tt> (String), <tt>type</tt> (String)
 * </p>
 * 
 * <p>
 * All other names are optional and should fit the individual implementation needs in both naming
 * and values passed.
 * </p>
 * 
 * @author douglas whitehead
 *
 */
public interface ProfileInfo {

	/**
	 * Returns the ProfileID object.
	 * 
	 * @return String
	 */
	public String getProfileID();
	
	/**
	 * Returns the UserName object.
	 * 
	 * @return String
	 */
	public String getUserName();
	
	/**
	 * Returns the Email object.
	 * 
	 * @return String
	 */
	public String getEmail();
	
	/**
	 * Returns the Language object.
	 * 
	 * @return String
	 */
	public String getLanguage();
	
	/**
	 * Returns the ReturningStatus object.
	 * 
	 * @return String
	 */
	public String getReturningStatus();
	
	/**
	 * Returns the Type object.
	 * 
	 * @return String
	 */
	public String getType();
	
	/**
	 * ProfileInfo.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the ProfileID object.
		 * 
		 * @param String profileID
		 * @return Builder
		 */
		public Builder profileID(String profileID);
		
		/**
		 * Builds the UserName object.
		 * 
		 * @param String userName
		 * @return Builder
		 */
		public Builder userName(String userName);
		
		/**
		 * Builds the Email object.
		 * 
		 * @param String email
		 * @return Builder
		 */
		public Builder email(String email);
		
		/**
		 * Builds the Language object.
		 * 
		 * @param String language
		 * @return Builder
		 */
		public Builder language(String language);
		
		/**
		 * Builds the ReturningStatus object.
		 * 
		 * @param String returningStatus
		 * @return Builder
		 */
		public Builder returningStatus(String returningStatus);
		
		/**
		 * Builds the Type object.
		 * 
		 * @param String type
		 * @return Builder
		 */
		public Builder type(String type);
		
		/**
		 * Builds and returns the ProfileInfo object.
		 * 
		 * @return ProfileInfo
		 */
		public ProfileInfo build();
		
	}
}
