package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class FeedUserMixin {

	@JsonCreator
	public FeedUserMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("id")
	String id;
}
