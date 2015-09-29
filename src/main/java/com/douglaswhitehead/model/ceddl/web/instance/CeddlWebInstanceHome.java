package com.contentualize.model.ceddl.web.instance;

import java.util.Locale;

import org.joda.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mobile.device.Device;

import com.contentualize.model.ceddl.DeviceToString;
import com.contentualize.model.ceddl.web.page.CeddlWebPage;
import com.contentualize.model.ceddl.web.page.CeddlWebPageAttributesImpl;
import com.contentualize.model.ceddl.web.page.CeddlWebPageImpl;
import com.contentualize.model.ceddl.web.page.CeddlWebPageInfoImpl;
import com.contentualize.model.ceddl.web.page.ContentualizeCeddlWebPageCategoryImpl;

public class CeddlWebInstanceHome extends CeddlWebInstanceBase {
	
	@Autowired
	private Environment environment;
	
	public CeddlWebInstanceHome(Locale locale, Device device) {
		this.pageInstanceId = buildPageInstanceId();
		this.page = buildPage(locale, device);
		this.user = buildUser();
		this.version = buildVersion();
	}
	
	private String buildPageInstanceId() {
		return (environment == null) ? "null-home" : this.environment.getActiveProfiles()+"-home";
	}
	
	private CeddlWebPage buildPage(Locale locale, Device device) {
		return new CeddlWebPageImpl.Builder()
			.pageInfo(new CeddlWebPageInfoImpl.Builder()
				.pageId("home")
				.pageName("home")
				.destinationURL("")
				.referringURL("")
				.sysEnv(DeviceToString.deviceToString(device))
				.variant("1")
				.version("1.00")
				.breadcrumbs(new String[0])
				.author("system")
				.issueDate(new Instant(0))
				.effectiveDate(new Instant(0))
				.expiryDate(new Instant(0))
				.language(locale.getLanguage())
				.geoRegion(locale.getCountry())
				.industryCodes("")
				.publisher("system")
				.build())
			.category(new ContentualizeCeddlWebPageCategoryImpl.Builder()
				.sectionCategory("home")
				.primaryCategory("home")
				.secondaryCategory("")
				.tertiaryCategory("")
				.build())
			.attributes(new CeddlWebPageAttributesImpl.Builder()
				.build())
			.build();
	}

}
