package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BookmarkMixin {

	@JsonCreator
	public BookmarkMixin(@JsonProperty("created_at") String createdAt, 
						 @JsonProperty("user") User user) {
	}
}
