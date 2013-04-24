package org.springframework.social.xing.api.impl.json;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MessageMixin {

	@JsonCreator
	   MessageMixin(@JsonProperty("id") String id,
					@JsonProperty("created_at") Date createdAt,
					@JsonProperty("content") String content,
					@JsonProperty("read") boolean read) {}
	
	@JsonProperty("sender")
	User sender;
}
