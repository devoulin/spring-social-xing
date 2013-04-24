package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class JobNode implements Serializable {

	private static final long serialVersionUID = -2350897670585056786L;

	private Job job;

	public JobNode(Job job) {
		this.job = job;
	}

	public Job getJob() {
		return job;
	}
}
