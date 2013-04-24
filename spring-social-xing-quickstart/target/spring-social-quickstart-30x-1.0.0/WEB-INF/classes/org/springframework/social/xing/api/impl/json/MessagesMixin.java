package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessagesMixin {

	@JsonCreator
	  MessagesMixin(@JsonProperty("total") int total,
					@JsonProperty("items")  List<Message> items) {}
}
