package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Messages;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MessagesNodeMixin {

	@JsonCreator
	public MessagesNodeMixin(@JsonProperty("messages") Messages messages) {
	}
}
