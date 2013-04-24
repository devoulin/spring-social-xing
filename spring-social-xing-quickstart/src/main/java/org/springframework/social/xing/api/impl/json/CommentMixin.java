package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CommentMixin {

	@JsonCreator
	public CommentMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("id")
	String id;

	@JsonProperty("created_at")
	String createdAt;

	@JsonProperty("content")
	String content;

	@JsonProperty("creator")
	User creator;
}
