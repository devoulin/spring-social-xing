package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class TimeZone implements Serializable {

	private static final long serialVersionUID = 2841518721116994742L;

	private String name;
	private double utcOffset;

	public TimeZone(String name, double utcOffset) {
		super();
		this.name = name;
		this.utcOffset = utcOffset;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUtcOffset() {
		return utcOffset;
	}

	public void setUtcOffset(double utcOffset) {
		this.utcOffset = utcOffset;
	}
}
