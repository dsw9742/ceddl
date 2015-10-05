package com.douglaswhitehead.model.digitaldata.page;

import java.util.Date;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the PageInfo interface.
 * 
 * @author douglas.whitehead
 *
 */
public class PageInfoImpl extends BaseImpl implements PageInfo {
	
	/**
	 * String constant for <tt>pageID</tt>
	 */
	private static final String PAGE_ID = "pageId";
	
	/**
	 * String constant for <tt>pageName</tt>
	 */
	private static final String PAGE_NAME = "pageName";
	
	/**
	 * String constant for <tt>destinationURL</tt>
	 */
	private static final String DESTINATION_URL = "destinationURL";
	
	/**
	 * String constant for <tt>referringURL</tt>
	 */
	private static final String REFERRING_URL = "referringURL";
	
	/**
	 * String constant for <tt>sysEnv</tt>
	 */
	private static final String SYS_ENV = "sysEnv";
	
	/**
	 * String constant for <tt>variant</tt>
	 */
	private static final String VARIANT = "variant";
	
	/**
	 * String constant for <tt>version</tt>
	 */
	private static final String VERSION = "version";
	
	/**
	 * String constant for <tt>breadcrumbs</tt>
	 */
	private static final String BREADCRUMBS = "breadcrumbs";
	
	/**
	 * String constant for <tt>author</tt>
	 */
	private static final String AUTHOR = "author";
	
	/**
	 * String constant for <tt>issueDate</tt>
	 */
	private static final String ISSUE_DATE = "issueDate";
	
	/**
	 * String constant for <tt>effectiveDate</tt>
	 */
	private static final String EFFECTIVE_DATE = "effectiveDate";
	
	/**
	 * String constant for <tt>expiryDate</tt>
	 */
	private static final String EXPIRY_DATE = "expiryDate";
	
	/**
	 * String constant for <tt>language</tt>
	 */
	private static final String LANGUAGE = "language";
	
	/**
	 * String constant for <tt>geoRegion</tt>
	 */
	private static final String GEO_REGION = "geoRegion";
	
	/**
	 * String constant for <tt>industryCodes</tt>
	 */
	private static final String INDUSTRY_CODES = "industryCodes";
	
	/**
	 * String constant for <tt>publisher</tt>
	 */
	private static final String PUBLISHER = "publisher";
	
	/**
	 * String constant for <tt>onsiteSearchTerm</tt>
	 */
	private static final String ONSITE_SEARCH_TERM = "onsiteSearchTerm";
	
	/**
	 * String constant for <tt>onsiteSearchResults</tt>
	 */
	private static final String ONSITE_SEARCH_RESULTS = "onsiteSearchResults";
	
	/**
	 * PageInfoImpl constructor.
	 * 
	 * @param Security security
	 * @param String pageID
	 * @param String pageName
	 * @param String destinationURL
	 * @param String referringURL
	 * @param String sysEnv
	 * @param String variant
	 * @param String version
	 * @param String[] breadcrumbs
	 * @param String author
	 * @param Date issueDate
	 * @param Date effectiveDate
	 * @param Date expiryDate
	 * @param String language
	 * @param String geoRegion
	 * @param String industryCodes
	 * @param String publisher
	 * @param String onsiteSearchTerm
	 * @param Long onsiteSearchResults
	 */
	private PageInfoImpl(
		final Security security,
		final String pageID,
		final String pageName,
		final String destinationURL,
		final String referringURL,
		final String sysEnv,
		final String variant,
		final String version,
		final String[] breadcrumbs,
		final String author,
		final Date issueDate,
		final Date effectiveDate,
		final Date expiryDate,
		final String language,
		final String geoRegion,
		final String industryCodes,
		final String publisher,
		final String onsiteSearchTerm,
		final Long onsiteSearchResults
		) {
		this.security = security;
		this.map.put(PAGE_ID, pageID);
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
	
	/**
	 * Returns the PageID object.
	 * 
	 * @return String
	 */
	@Override
	public String getPageID() {
		return (String)map.get(PAGE_ID);
	}
	
	/**
	 * Returns the PageName object.
	 * 
	 * @return String
	 */
	@Override
	public String getPageName() {
		return (String)map.get(PAGE_NAME);
	}
	
	/**
	 * Returns the DestinationURL object.
	 * 
	 * @return String
	 */
	@Override
	public String getDestinationURL() {
		return (String)map.get(DESTINATION_URL);
	}
	
	/**
	 * Returns the ReferringURL object.
	 * 
	 * @return String
	 */
	@Override
	public String getReferringURL() {
		return (String)map.get(REFERRING_URL);
	}
	
	/**
	 * Returns the SysEnv object.
	 * 
	 * @return String
	 */
	@Override
	public String getSysEnv() {
		return (String)map.get(SYS_ENV);
	}
	
	/**
	 * Returns the Variant object.
	 * 
	 * @return String
	 */
	@Override
	public String getVariant() {
		return (String)map.get(VARIANT);
	}
	
	/**
	 * Returns the Version object.
	 * 
	 * @return String
	 */
	@Override
	public String getVersion() {
		return (String)map.get(VERSION);
	}
	
	/**
	 * Returns the Breadcrumbs object.
	 * 
	 * @return String[]
	 */
	@Override
	public String[] getBreadcrumbs() {
		return (String[])map.get(BREADCRUMBS);
	}
	
	/**
	 * Returns the Author object.
	 * 
	 * @return String
	 */
	@Override
	public String getAuthor() {
		return (String)map.get(AUTHOR);
	}
	
	/**
	 * Returns the IssueDate object.
	 * 
	 * @return Date
	 */
	@Override
	public Date getIssueDate() {
		return (Date)map.get(ISSUE_DATE);
	}
	
	/**
	 * Returns the EffectiveDate object.
	 * 
	 * @return Date
	 */
	@Override
	public Date getEffectiveDate() {
		return (Date)map.get(EFFECTIVE_DATE);
	}
	
	/**
	 * Returns the ExpiryDate object.
	 * 
	 * @return Date
	 */
	@Override
	public Date getExpiryDate() {
		return (Date)map.get(EXPIRY_DATE);
	}
	
	/**
	 * Returns the Language object.
	 * 
	 * @return String
	 */
	@Override
	public String getLanguage() {
		return (String)map.get(LANGUAGE);
	}
	
	/**
	 * Returns the GeoRegion object.
	 * 
	 * @return String
	 */
	@Override
	public String getGeoRegion() {
		return (String)map.get(GEO_REGION);
	}
	
	/**
	 * Returns the IndustryCodes object.
	 * 
	 * @return String
	 */
	@Override
	public String getIndustryCodes() {
		return (String)map.get(INDUSTRY_CODES);
	}
	
	/**
	 * Returns the Publisher object.
	 * 
	 * @return String
	 */
	@Override
	public String getPublisher() {
		return (String)map.get(PUBLISHER);
	}
	
	/**
	 * Returns the OnsiteSearchTerm object.
	 * 
	 * @return String
	 */
	@Override
	public String getOnsiteSearchTerm() {
		return (String)map.get(ONSITE_SEARCH_TERM);
	}
	
	/**
	 * Returns the OnsiteSearchResults object.
	 * 
	 * @return Long
	 */
	@Override
	public Long getOnsiteSearchResults() {
		return (Long)map.get(ONSITE_SEARCH_RESULTS);
	}
	
	/**
	 * Implementation of the PageInfo.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements PageInfo.Builder {
		
		/**
		 * Builds the PageID object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder pageID(final String pageId) {
			this.map.put(PAGE_ID, pageId);
			this.previous = PAGE_ID;
			return builder();
		}
		
		/**
		 * Builds the PageName object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder pageName(final String pageName) {
			this.map.put(PAGE_NAME, pageName);
			this.previous = PAGE_NAME;
			return builder();
		}
		
		/**
		 * Builds the DestinationURL object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder destinationURL(final String destinationURL) {
			this.map.put(DESTINATION_URL, destinationURL);
			this.previous = DESTINATION_URL;
			return builder();
		}
		
		/**
		 * Builds the ReferringURL object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder referringURL(final String referringURL) {
			this.map.put(REFERRING_URL, referringURL);
			this.previous = REFERRING_URL;
			return builder();
		}
		
		/**
		 * Builds the SysEnv object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder sysEnv(final String sysEnv) {
			this.map.put(SYS_ENV, sysEnv);
			this.previous = SYS_ENV;
			return builder();
		}
		
		/**
		 * Builds the Variant object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder variant(final String variant) {
			this.map.put(VARIANT, variant);
			this.previous = VARIANT;
			return builder();
		}
		
		/**
		 * Builds the Version object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder version(final String version) {
			this.map.put(VERSION, version);
			this.previous = VERSION;
			return builder();
		}
		
		/**
		 * Builds the Breadcrumbs object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder breadcrumbs(final String[] breadcrumbs) {
			this.map.put(BREADCRUMBS, breadcrumbs);
			this.previous = BREADCRUMBS;
			return builder();
		}
		
		/**
		 * Builds the Author object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder author(final String author) {
			this.map.put(AUTHOR, author);
			this.previous = AUTHOR;
			return builder();
		}
		
		/**
		 * Builds the IssueDate object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder issueDate(final Date issueDate) {
			this.map.put(ISSUE_DATE, issueDate);
			this.previous = ISSUE_DATE;
			return builder();
		}
		
		/**
		 * Builds the EffectiveDate object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder effectiveDate(final Date effectiveDate) {
			this.map.put(EFFECTIVE_DATE, effectiveDate);
			this.previous = EFFECTIVE_DATE;
			return builder();
		}
		
		/**
		 * Builds the ExpiryDate object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder expiryDate(final Date expiryDate) {
			this.map.put(EXPIRY_DATE, expiryDate);
			this.previous = EXPIRY_DATE;
			return builder();
		}
		
		/**
		 * Builds the Language object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder language(final String language) {
			this.map.put(LANGUAGE, language);
			this.previous = LANGUAGE;
			return builder();
		}
		
		/**
		 * Builds the GeoRegion object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder geoRegion(final String geoRegion) {
			this.map.put(GEO_REGION, geoRegion);
			this.previous = GEO_REGION;
			return builder();
		}
		
		/**
		 * Builds the IndustryCodes object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder industryCodes(final String industryCodes) {
			this.map.put(INDUSTRY_CODES, industryCodes);
			this.previous = INDUSTRY_CODES;
			return builder();
		}
		
		/**
		 * Builds the Publisher object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder publisher(final String publisher) {
			this.map.put(PUBLISHER, publisher);
			this.previous = PUBLISHER;
			return builder();
		}
		
		/**
		 * Builds the OnsiteSearchTerm object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder onsiteSearchTerm(final String onsiteSearchTerm) {
			this.map.put(ONSITE_SEARCH_TERM, onsiteSearchTerm);
			this.previous = ONSITE_SEARCH_TERM;
			return builder();
		}
		
		/**
		 * Builds the OnsiteSearchResults object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder onsiteSearchResults(final Long onsiteSearchResults) {
			this.map.put(ONSITE_SEARCH_RESULTS, onsiteSearchResults);
			this.previous = ONSITE_SEARCH_RESULTS; 
			return builder();
		}
		
		/**
		 * Builds and returns the PageInfoImpl object.
		 * 
		 * @return PageInfoImpl
		 */
		public PageInfoImpl build() {
			return new PageInfoImpl(
				security,
				(String)map.get(PAGE_ID),
				(String)map.get(PAGE_NAME),
				(String)map.get(DESTINATION_URL),
				(String)map.get(REFERRING_URL),
				(String)map.get(SYS_ENV),
				(String)map.get(VARIANT),
				(String)map.get(VERSION),
				(String[])map.get(BREADCRUMBS),
				(String)map.get(AUTHOR),
				(Date)map.get(ISSUE_DATE),
				(Date)map.get(EFFECTIVE_DATE),
				(Date)map.get(EXPIRY_DATE),
				(String)map.get(LANGUAGE),
				(String)map.get(GEO_REGION),
				(String)map.get(INDUSTRY_CODES),
				(String)map.get(PUBLISHER),
				(String)map.get(ONSITE_SEARCH_TERM),
				(Long)map.get(ONSITE_SEARCH_RESULTS)
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
