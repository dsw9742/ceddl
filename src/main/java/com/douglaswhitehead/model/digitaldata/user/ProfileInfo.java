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

	public String getProfileID();
	public String getUserName();
	public String getEmail();
	public String getLanguage();
	public String getReturningStatus();
	public String getType();
	
	public static interface Builder {
		
		public Builder profileID(String profileID);
		public Builder userName(String userName);
		public Builder email(String email);
		public Builder language(String language);
		public Builder returningStatus(String returningStatus);
		public Builder type(String type);
		
		/**
		 * Builds and returns the ProfileInfo object.
		 * 
		 * @return ProfileInfo
		 */
		public ProfileInfo build();
		
	}
}
