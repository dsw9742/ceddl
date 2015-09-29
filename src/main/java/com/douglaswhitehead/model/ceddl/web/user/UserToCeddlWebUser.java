package com.contentualize.model.ceddl.web.user;

import com.contentualize.model.User;
import com.contentualize.model.ceddl.web.CeddlWebProfileAddressImpl;

public class UserToCeddlWebUser {

	public static CeddlWebUser userToCeddlWebUser(User user) {
		
		CeddlWebUserProfile profile = new CeddlWebUserProfileImpl.Builder()
			.profileInfo(new CeddlWebUserProfileInfoImpl.Builder()
				.profileID(user.getId().toString())
				.userName(user.getUsername())
				.email(user.getEmail())
				.language(user.getLanguage().getName())
				.returningStatus("")
				.type("")
				.build())
			.address(new CeddlWebProfileAddressImpl.Builder()
				.line1("")
				.line2("")
				.city("")
				.stateProvince("")
				.postalCode("")
				.country("")
				.build())
			.social(new CeddlWebUserProfileSocialImpl.Builder()
				.twitter("")
				.twitterInfo(new Object())
				.facebook("")
				.facebookInfo(new Object())
				.build())
			.attributes(new CeddlWebUserProfileAttributesImpl.Builder()
				.build())
			.build();
		
		CeddlWebUserProfile[] profiles = new CeddlWebUserProfile[1];
		profiles[0] = profile;
		
		return new CeddlWebUserImpl.Builder()
			.segment(new CeddlWebUserSegmentImpl.Builder().build())
			.profile(profiles)
			.build();
	}
	
}
