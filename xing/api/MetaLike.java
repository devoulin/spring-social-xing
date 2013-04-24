package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class MetaLike implements Serializable {

	private static final long serialVersionUID = 1730834768217027538L;

	private String type;
	private int amount;
	private boolean currentUserLiked;

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

	public boolean isCurrentUserLiked() {
		return currentUserLiked;
	}

	public void setCurrentUserLiked(boolean currentUserLiked) {
		this.currentUserLiked = currentUserLiked;
	}

}
