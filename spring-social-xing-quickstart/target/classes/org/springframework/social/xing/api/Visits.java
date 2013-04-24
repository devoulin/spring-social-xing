package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Visits implements Serializable {

	private static final long serialVersionUID = 7433699729399231220L;
	private List<Visit> visits;

	public List<Visit> getVisits() {
		return visits;
	}

	public Visits(List<Visit> visits) {
		this.visits = visits;
	}

}
