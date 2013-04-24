package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class GeoCode implements Serializable {

	private static final long serialVersionUID = 2431781458846381733L;

	private final String accuracy;
	private final String latitude;
	private final String longitude;

	public GeoCode(String accuracy, String latitude, String longitude) {
		this.accuracy = accuracy;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}
}
