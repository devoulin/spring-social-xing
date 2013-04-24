package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactsMixin {

	@JsonCreator
	public ContactsMixin(@JsonProperty("total") int total, 
						 @JsonProperty("users") List<User> users) {
	}
}
