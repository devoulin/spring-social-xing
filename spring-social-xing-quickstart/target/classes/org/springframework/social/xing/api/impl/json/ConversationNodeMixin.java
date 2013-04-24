package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Conversation;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationNodeMixin {

	@JsonCreator
	public ConversationNodeMixin(@JsonProperty("conversation") Conversation conversation) {
	}
}
