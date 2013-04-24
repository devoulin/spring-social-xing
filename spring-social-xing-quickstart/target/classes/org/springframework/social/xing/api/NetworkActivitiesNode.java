package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class NetworkActivitiesNode implements Serializable {

	private static final long serialVersionUID = -2903087075142697397L;
	private List<NetworkFeed> networkFeed;

	public NetworkActivitiesNode(List<NetworkFeed> networkFeed) {
		this.networkFeed = networkFeed;
	}

	public List<NetworkFeed> getNetworkFeed() {
		return networkFeed;
	}
}
