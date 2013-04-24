package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ActivitiesNode implements Serializable {

	private static final long serialVersionUID = -3589044428891252701L;
	private NetworkFeed activities;

	public NetworkFeed getActivities() {
		return activities;
	}

	public void setActivities(NetworkFeed activities) {
		this.activities = activities;
	}
}
