package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Conversations;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationsNodeMixin {

	@JsonCreator
	ConversationsNodeMixin(@JsonProperty("conversations") Conversations conversations) {
	}
}
