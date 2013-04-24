package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class RecommendationsNode implements Serializable {

	private static final long serialVersionUID = -3751164773473516880L;
	private Recommendations recommendations;

	public Recommendations getRecommendations() {
		return recommendations;
	}

	public RecommendationsNode(Recommendations recommendations) {
		this.recommendations = recommendations;
	}

}
