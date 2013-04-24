package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class MetaComment implements Serializable {

	private static final long serialVersionUID = 403099768300189890L;
	private String type;
	private int amount;
	private boolean currentUserCommented;
	private List<Comment> latestComments;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isCurrentUserCommented() {
		return currentUserCommented;
	}

	public void setCurrentUserCommented(boolean currentUserCommented) {
		this.currentUserCommented = currentUserCommented;
	}

	public List<Comment> getLatestComments() {
		return latestComments;
	}

	public void setLatestComments(List<Comment> latestComments) {
		this.latestComments = latestComments;
	}

}
