package com.douglaswhitehead.model.digitaldata.page;

import java.util.Date;
import java.util.Map;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Describes details about the page.
 */
public class PageInfoImpl extends BaseImpl implements PageInfo {
	private static final String PAGE_ID = "pageId";
	private static final String PAGE_NAME = "pageName";
	private static final String DESTINATION_URL = "destinationURL";
	private static final String REFERRING_URL = "referringURL";
	private static final String SYS_ENV = "sysEnv";
	private static final String VARIANT = "variant";
	private static final String VERSION = "version";
	private static final String BREADCRUMBS = "breadcrumbs";
	private static final String AUTHOR = "author";
	private static final String ISSUE_DATE = "issueDate";
	private static final String EFFECTIVE_DATE = "effectiveDate";
	private static final String EXPIRY_DATE = "expiryDate";
	private static final String LANGUAGE = "language";
	private static final String GEO_REGION = "geoRegion";
	private static final String INDUSTRY_CODES = "industryCodes";
	private static final String PUBLISHER = "publisher";
	private static final String ONSITE_SEARCH_TERM = "onsiteSearchTerm";
	private static final String ONSITE_SEARCH_RESULTS = "onsiteSearchResults";
	
	private PageInfoImpl(
		//final Map<String, Object> security,
		final Security security,
		final Object pageId,
		final Object pageName,
		final Object destinationURL,
		final Object referringURL,
		final Object sysEnv,
		final Object variant,
		final Object version,
		final Object breadcrumbs,
		final Object author,
		final Object issueDate,
		final Object effectiveDate,
		final Object expiryDate,
		final Object language,
		final Object geoRegion,
		final Object industryCodes,
		final Object publisher,
		final Object onsiteSearchTerm,
		final Object onsiteSearchResults
		) {
		this.security = security;
		this.map.put(PAGE_ID, pageId);
		this.map.put(PAGE_NAME, pageName);
		this.map.put(DESTINATION_URL, destinationURL);
		this.map.put(REFERRING_URL, referringURL);
		this.map.put(SYS_ENV, sysEnv);
		this.map.put(VARIANT, variant);
		this.map.put(VERSION, version);
		this.map.put(BREADCRUMBS, breadcrumbs);
		this.map.put(AUTHOR, author);
		this.map.put(ISSUE_DATE, issueDate);
		this.map.put(EFFECTIVE_DATE, effectiveDate);
		this.map.put(EXPIRY_DATE, expiryDate);
		this.map.put(LANGUAGE, language);
		this.map.put(GEO_REGION, geoRegion);
		this.map.put(INDUSTRY_CODES, industryCodes);
		this.map.put(PUBLISHER, publisher);
		this.map.put(ONSITE_SEARCH_TERM, onsiteSearchTerm);
		this.map.put(ONSITE_SEARCH_RESULTS, onsiteSearchResults);
	}
	
	public Object getPageId() {
		return map.get(PAGE_ID);
	}
	
	public Object getPageName() {
		return map.get(PAGE_NAME);
	}
	
	public Object getDestinationURL() {
		return map.get(DESTINATION_URL);
	}
	
	public Object getReferringURL() {
		return map.get(REFERRING_URL);
	}
	
	public Object getSysEnv() {
		return map.get(SYS_ENV);
	}
	
	public Object getVariant() {
		return map.get(VARIANT);
	}
	
	public Object getVersion() {
		return map.get(VERSION);
	}
	
	public Object getBreadcrumbs() {
		return map.get(BREADCRUMBS);
	}
	
	public Object getAuthor() {
		return map.get(AUTHOR);
	}
	
	public Object getIssueDate() {
		return map.get(ISSUE_DATE);
	}
	
	public Object getEffectiveDate() {
		return map.get(EFFECTIVE_DATE);
	}
	
	public Object getExpiryDate() {
		return map.get(EXPIRY_DATE);
	}
	
	public Object getLanguage() {
		return map.get(LANGUAGE);
	}
	
	public Object getGeoRegion() {
		return map.get(GEO_REGION);
	}
	
	public Object getIndustryCodes() {
		return map.get(INDUSTRY_CODES);
	}
	
	public Object getPublisher() {
		return map.get(PUBLISHER);
	}
	
	public Object getOnsiteSearchTerm() {
		return map.get(ONSITE_SEARCH_TERM);
	}
	
	public Object getOnsiteSearchResults() {
		return map.get(ONSITE_SEARCH_RESULTS);
	}
	
	public static class Builder extends BaseImpl.Builder {
		
		public Builder security(final String[] accessCategories) {
			validateSecurity();
			this.security.secure(previous, accessCategories);
			return this;
		}
		
		public Builder pageId(final String pageId) {
			this.map.put(PAGE_ID, pageId);
			this.previous = PAGE_ID;
			return this;
		}
		
		public Builder pageName(final String pageName) {
			this.map.put(PAGE_NAME, pageName);
			this.previous = PAGE_NAME;
			return this;
		}
		
		public Builder destinationURL(final String destinationURL) {
			this.map.put(DESTINATION_URL, destinationURL);
			this.previous = DESTINATION_URL;
			return this;
		}
		
		public Builder referringURL(final String referringURL) {
			this.map.put(REFERRING_URL, referringURL);
			this.previous = REFERRING_URL;
			return this;
		}
		
		public Builder sysEnv(final String sysEnv) {
			this.map.put(SYS_ENV, sysEnv);
			this.previous = SYS_ENV;
			return this;
		}
		
		public Builder variant(final String variant) {
			this.map.put(VARIANT, variant);
			this.previous = VARIANT;
			return this;
		}
		
		public Builder version(final String version) {
			this.map.put(VERSION, version);
			this.previous = VERSION;
			return this;
		}
		
		public Builder breadcrumbs(final String[] breadcrumbs) {
			this.map.put(BREADCRUMBS, breadcrumbs);
			this.previous = BREADCRUMBS;
			return this;
		}
		
		public Builder author(final String author) {
			this.map.put(AUTHOR, author);
			this.previous = AUTHOR;
			return this;
		}
		
		public Builder issueDate(final Date issueDate) {
			this.map.put(ISSUE_DATE, issueDate);
			this.previous = ISSUE_DATE;
			return this;
		}
		
		public Builder effectiveDate(final Date effectiveDate) {
			this.map.put(EFFECTIVE_DATE, effectiveDate);
			this.previous = EFFECTIVE_DATE;
			return this;
		}
		
		public Builder expiryDate(final Date expiryDate) {
			this.map.put(EXPIRY_DATE, expiryDate);
			this.previous = EXPIRY_DATE;
			return this;
		}
		
		public Builder language(final String language) {
			this.map.put(LANGUAGE, language);
			this.previous = LANGUAGE;
			return this;
		}
		
		public Builder geoRegion(final String geoRegion) {
			this.map.put(GEO_REGION, geoRegion);
			this.previous = GEO_REGION;
			return this;
		}
		
		public Builder industryCodes(final String industryCodes) {
			this.map.put(INDUSTRY_CODES, industryCodes);
			this.previous = INDUSTRY_CODES;
			return this;
		}
		
		public Builder publisher(final String publisher) {
			this.map.put(PUBLISHER, publisher);
			this.previous = PUBLISHER;
			return this;
		}
		
		public Builder onsiteSearchTerm(final String onsiteSearchTerm) {
			this.map.put(ONSITE_SEARCH_TERM, onsiteSearchTerm);
			this.previous = ONSITE_SEARCH_TERM;
			return this;
		}
		
		public Builder onsiteSearchResults(final Integer onsiteSearchResults) {
			this.map.put(ONSITE_SEARCH_RESULTS, onsiteSearchResults);
			this.previous = ONSITE_SEARCH_RESULTS; 
			return this;
		}
		
		public PageInfoImpl build() {
			return new PageInfoImpl(
				security,
				map.get(PAGE_ID),
				map.get(PAGE_NAME),
				map.get(DESTINATION_URL),
				map.get(REFERRING_URL),
				map.get(SYS_ENV),
				map.get(VARIANT),
				map.get(VERSION),
				map.get(BREADCRUMBS),
				map.get(AUTHOR),
				map.get(ISSUE_DATE),
				map.get(EFFECTIVE_DATE),
				map.get(EXPIRY_DATE),
				map.get(LANGUAGE),
				map.get(GEO_REGION),
				map.get(INDUSTRY_CODES),
				map.get(PUBLISHER),
				map.get(ONSITE_SEARCH_TERM),
				map.get(ONSITE_SEARCH_RESULTS)
			);
		}
	}

}
