package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Recommendations implements Serializable {

	private static final long serialVersionUID = -6097935471636424223L;
	private int total;
	private List<Recommendation> recommendations;

	public Recommendations(int total, List<Recommendation> recommendations) {
		this.total = total;
		this.recommendations = recommendations;
	}

	public int getTotal() {
		return total;
	}

	public List<Recommendation> getRecommendations() {
		return recommendations;
	}

}
