package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class NearbyItemsNode implements Serializable {

	private static final long serialVersionUID = 4301795027882787869L;
	private NearbyItems nearbyItems;

	public NearbyItems getNearbyItems() {
		return nearbyItems;
	}

	public NearbyItemsNode(NearbyItems nearbyItems) {
		this.nearbyItems = nearbyItems;
	}

}
