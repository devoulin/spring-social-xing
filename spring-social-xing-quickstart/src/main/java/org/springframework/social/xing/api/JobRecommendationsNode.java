package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class JobRecommendationsNode implements Serializable {

	private static final long serialVersionUID = 375955522258810885L;
	private Jobs jobRecommendations;

	public JobRecommendationsNode(Jobs jobRecommendations) {
		this.jobRecommendations = jobRecommendations;
	}

	public Jobs getJobRecommendations() {
		return jobRecommendations;
	}
}
