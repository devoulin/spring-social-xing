package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Visit implements Serializable {

	private static final long serialVersionUID = -6154442688176459442L;

	private String companyName;
	private String visitedAtEncrypted;
	private Map<String, String> reason;
	private String userId;
	private PhotoUrls photoUrls;
	private String displayName;
	private String visitedAt;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getVisitedAtEncrypted() {
		return visitedAtEncrypted;
	}

	public void setVisitedAtEncrypted(String visitedAtEncrypted) {
		this.visitedAtEncrypted = visitedAtEncrypted;
	}

	public Map<String, String> getReason() {
		return reason;
	}

	public void setReason(Map<String, String> reason) {
		this.reason = reason;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PhotoUrls getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(PhotoUrls photoUrls) {
		this.photoUrls = photoUrls;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getVisitedAt() {
		return visitedAt;
	}

	public void setVisitedAt(String visitedAt) {
		this.visitedAt = visitedAt;
	}
}
