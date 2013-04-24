package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Tags;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TagsNodeMixin {

	@JsonCreator
	public TagsNodeMixin(@JsonProperty("tags") Tags tags) {
	}
}
