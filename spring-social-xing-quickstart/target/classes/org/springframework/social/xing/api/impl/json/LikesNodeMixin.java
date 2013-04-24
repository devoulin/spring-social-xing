package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Like;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LikesNodeMixin {

	@JsonCreator
	public LikesNodeMixin(@JsonProperty("likes") List<Like> likes) {
	}
}
