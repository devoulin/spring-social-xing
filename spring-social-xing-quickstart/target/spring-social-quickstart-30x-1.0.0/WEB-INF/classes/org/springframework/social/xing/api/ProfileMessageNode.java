package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ProfileMessageNode implements Serializable {

	private static final long serialVersionUID = -7954968903680284514L;

	private ProfileMessage profileMessage;

	public ProfileMessageNode(ProfileMessage profileMessage) {
		this.profileMessage = profileMessage;
	}

	public ProfileMessage getProfileMessage() {
		return profileMessage;
	}
}
