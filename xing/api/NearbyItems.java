package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class NearbyItems implements Serializable {

	private static final long serialVersionUID = 2976845085779708032L;
	private int total;
	private List<NearbyUsers> nearbyUsers;

	public NearbyItems(int total, List<NearbyUsers> nearbyUsers) {
		this.total = total;
		this.nearbyUsers = nearbyUsers;
	}

	public int getTotal() {
		return total;
	}

	public List<NearbyUsers> getNearbyUsers() {
		return nearbyUsers;
	}

}
