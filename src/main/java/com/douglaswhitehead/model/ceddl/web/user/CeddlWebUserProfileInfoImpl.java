package com.douglaswhitehead.model.ceddl.web.user;

/**
 * An extensible object for providing information about the user.
 */
public class CeddlWebUserProfileInfoImpl implements CeddlWebUserProfileInfo {

	private final String profileID;
	private final String userName;
	private final String email;
	private final String language;
	private final String returningStatus;
	private final String type;
	
	private CeddlWebUserProfileInfoImpl(
		final String newProfileID,
		final String newUserName,
		final String newEmail,
		final String newLanguage,
		final String newReturningStatus,
		final String newType
	) {
		this.profileID = newProfileID;
		this.userName = newUserName;
		this.email = newEmail;
		this.language = newLanguage;
		this.returningStatus = newReturningStatus;
		this.type = newType;
	}
	
	public String getProfileID() {
		return this.profileID;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public String getReturningStatus() {
		return this.returningStatus;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static class Builder {
		private String nestedProfileID;
		private String nestedUserName;
		private String nestedEmail;
		private String nestedLanguage;
		private String nestedReturningStatus;
		private String nestedType;
		
		public Builder profileID(final String newProfileID) {
			this.nestedProfileID = newProfileID;
			return this;
		}
		
		public Builder userName(final String newUserName) {
			this.nestedUserName = newUserName;
			return this;
		}
		
		public Builder email(final String newEmail) {
			this.nestedEmail = newEmail;
			return this;
		}
		
		public Builder language(final String newLanguage) {
			this.nestedLanguage = newLanguage;
			return this;
		}
		
		public Builder returningStatus(final String newReturningStatus) {
			this.nestedReturningStatus = newReturningStatus;
			return this;
		}
		
		public Builder type(final String newType) {
			this.nestedType = newType;
			return this;
		}
		
		public CeddlWebUserProfileInfoImpl build() {
			return new CeddlWebUserProfileInfoImpl(
				nestedProfileID,
				nestedUserName,
				nestedEmail,
				nestedLanguage,
				nestedReturningStatus,
				nestedType
			);
		}
	}
}
