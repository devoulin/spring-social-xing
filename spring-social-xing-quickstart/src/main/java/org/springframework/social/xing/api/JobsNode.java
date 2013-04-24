package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class JobsNode implements Serializable {

	private static final long serialVersionUID = 7626840771219030652L;

	private Jobs jobs;

	public JobsNode(Jobs jobs) {
		this.jobs = jobs;
	}

	public Jobs getJobs() {
		return jobs;
	}
}
