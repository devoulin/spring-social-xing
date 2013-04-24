package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Conversation;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationsMixin {

	@JsonCreator
	ConversationsMixin(@JsonProperty("unread_count") String unreadCount,
					   @JsonProperty("items") List<Conversation> items,
					   @JsonProperty("total") String total) {
		
	}
}
