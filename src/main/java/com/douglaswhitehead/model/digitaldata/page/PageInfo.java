package com.douglaswhitehead.model.digitaldata.page;

import java.util.Date;

/**
 * <p>PageInfo interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>Describes details about the page.</p>
 * 
 * <pre>
 * {@code
 * digitalData.page.<b>pageInfo</b> = {
 * 			<b>pageID:</b> "316",
 * 			<b>pageName:</b> "Rogaine Hair Regrowth Treatment",
 * 			<b>destinationURL:</b> "http://site.com/r.html",
 * 			<b>referringURL:</b> "http://www.google.com/url?&q=&esrc=s",
 * 			<b>sysEnv:</b> "mobile",
 * 			<b>variant:</b> "2",
 * 			<b>version:</b> "1.14",
 * 			<b>breadCrumbs:</b> ["home","Products","haircare"],
 * 			<b>author:</b> "J Smith",
 * 			<b>issueDate:</b> "2013-09-01",
 * 			<b>effectiveDate:</b> "2013-09-20",
 * 			<b>expiryDate:</b> "2014-09-20",
 * 			<b>language:</b> "en-US",
 * 			<b>geoRegion:</b> "US",
 * 			<b>industryCodes:</b> "SIC codes",
 * 			<b>publisher:</b> "BusDev"
 * 		};
 * }
 * </pre>
 *
 * <p>
 * <b>Reserved:</b> <tt>pageID</tt> (String), <tt>pageName</tt> (String), <tt>destinationURL</tt> (String), <tt>referringURL</tt>
 * (String), <tt>sysEnv</tt> (String), <tt>variant</tt> (String), <tt>version</tt> (String), <tt>breadcrumbs</tt> (Array::String),
 * <tt>author</tt> (String), <tt>issueDate</tt> (String or Date Object), <tt>effectiveDate</tt> (String or Date
 * Object), <tt>expiryDate</tt> (String or Date Object), <tt>language</tt> (String), <tt>industryCodes</tt> (String),
 * <tt>publisher</tt> (String) 
 * </p>
 * 
 * <p>
 * For <tt>destinationURL</tt>, and <tt>referringURL</tt>, RECOMMENDED values are
 * <tt>document.location</tt>, and <tt>document.referrer</tt>, respectively.
 * </p>
 * 
 * <p>
 * The properties <tt>onsiteSearchTerm</tt> and <tt>onsiteSearchResults</tt> are RECOMMENDED for
 * measuring the query term and number of results returned for onsite search functions.
 * </p>
 * 
 * <p>
 * For fields containing dates, JavaScript Date Objects or Strings using ISO 8601 are
 * RECOMMENDED.
 * </p>
 * 
 * <p>For fields containing language or locale, ISO 3166 and 639 are RECOMMENDED.</p>
 * 
 * @author douglas.whitehead
 *
 */
public interface PageInfo {
	
	/**
	 * Returns the PageID object.
	 * 
	 * @return String
	 */
	public String getPageID();
	
	/**
	 * Returns the PageName object.
	 * 
	 * @return String
	 */
	public String getPageName();
	
	/**
	 * Returns the DestinationURL object.
	 * 
	 * @return String
	 */
	public String getDestinationURL();
	
	/**
	 * Returns the ReferringURL object.
	 * 
	 * @return String
	 */
	public String getReferringURL();
	
	/**
	 * Returns the SysEnv object.
	 * 
	 * @return String
	 */
	public String getSysEnv();
	
	/**
	 * Returns the Variant object.
	 * 
	 * @return String
	 */
	public String getVariant();
	
	/**
	 * Returns the Version object.
	 * 
	 * @return String
	 */
	public String getVersion();
	
	/**
	 * Returns the Breadcrumbs array.
	 * 
	 * @return String[]
	 */
	public String[] getBreadcrumbs();
	
	/**
	 * Returns the Author object.
	 * 
	 * @return String
	 */
	public String getAuthor();
	
	/**
	 * Returns the IssueDate object.
	 * 
	 * @return Date
	 */
	public Date getIssueDate();
	
	/**
	 * Returns the EffectiveDate object.
	 * 
	 * @return Date
	 */
	public Date getEffectiveDate();
	
	/**
	 * Returns the ExpiryDate object.
	 * 
	 * @return Date
	 */
	public Date getExpiryDate();
	
	/**
	 * Returns the Language object.
	 * 
	 * @return String
	 */
	public String getLanguage();
	
	/**
	 * Returns the GeoRegion object.
	 * 
	 * @return String
	 */
	public String getGeoRegion();
	
	/**
	 * Returns the IndustryCodes object.
	 * 
	 * @return String
	 */
	public String getIndustryCodes();
	
	/**
	 * Returns the Publisher object.
	 * 
	 * @return String
	 */
	public String getPublisher();
	
	/**
	 * Returns the OnsiteSearchTerm object.
	 * 
	 * @return String
	 */
	public String getOnsiteSearchTerm();
	
	/**
	 * Returns the OnsiteSearchResults object.
	 * 
	 * @return Long
	 */
	public Long getOnsiteSearchResults();
	
	/**
	 * PageInfo.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the PageID object.
		 * 
		 * @return Builder
		 */
		public Builder pageID(String pageID);
		
		/**
		 * Builds the PageName object.
		 * 
		 * @return Builder
		 */
		public Builder pageName(String pageName);
		
		/**
		 * Builds the DestinationURL object.
		 * 
		 * @return Builder
		 */
		public Builder destinationURL(String destinationURL);
		
		/**
		 * Builds the ReferringURL object.
		 * 
		 * @return Builder
		 */
		public Builder referringURL(String referringURL);
		
		/**
		 * Builds the SysEnv object.
		 * 
		 * @return Builder
		 */
		public Builder sysEnv(String sysEnv);
		
		/**
		 * Builds the Variant object.
		 * 
		 * @return Builder
		 */
		public Builder variant(String variant);
		
		/**
		 * Builds the Version object.
		 * 
		 * @return Builder
		 */
		public Builder version(String version);
		
		/**
		 * Builds the Breadcrumbs array.
		 * 
		 * @return Builder
		 */
		public Builder breadcrumbs(String[] breadcrumbs);
		
		/**
		 * Builds the Author object.
		 * 
		 * @return Builder
		 */
		public Builder author(String author);
		
		/**
		 * Builds the IssueDate object.
		 * 
		 * @return Builder
		 */
		public Builder issueDate(Date issueDate);
		
		/**
		 * Builds the EffectiveDate object.
		 * 
		 * @return Builder
		 */
		public Builder effectiveDate(Date effectiveDate);
		
		/**
		 * Builds the ExpiryDate object.
		 * 
		 * @return Builder
		 */
		public Builder expiryDate(Date expiryDate);
		
		/**
		 * Builds the Language object.
		 * 
		 * @return Builder
		 */
		public Builder language(String language);
		
		/**
		 * Builds the GeoRegion object.
		 * 
		 * @return Builder
		 */
		public Builder geoRegion(String geoRegion);
		
		/**
		 * Builds the  object.
		 * 
		 * @return Builder
		 */
		public Builder industryCodes(String industryCodes);
		
		/**
		 * Builds the Publisher object.
		 * 
		 * @return Builder
		 */
		public Builder publisher(String publisher);
		
		/**
		 * Builds the OnsiteSearchTerm object.
		 * 
		 * @return Builder
		 */
		public Builder onsiteSearchTerm(String onsiteSearchTerm);
		
		/**
		 * Builds the OnsiteSearchResults object.
		 * 
		 * @return Builder
		 */
		public Builder onsiteSearchResults(Long onsiteSearchResults);
		
		/**
		 * Builds and returns the PageInfo object.
		 * 
		 * @return PageInfo
		 */
		public PageInfo build();
		
	}
	
}
