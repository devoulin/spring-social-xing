package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.NetworkFeed;

@JsonIgnoreProperties
abstract class ActivitiesNodeMixin {

	@JsonCreator
	public ActivitiesNodeMixin() {
	}

	@JsonProperty("activities")
	NetworkFeed activities;
}
