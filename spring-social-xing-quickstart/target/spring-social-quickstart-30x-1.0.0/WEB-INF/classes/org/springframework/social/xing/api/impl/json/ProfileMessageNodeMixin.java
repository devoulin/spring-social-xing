package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.ProfileMessage;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfileMessageNodeMixin {

	@JsonCreator
	public ProfileMessageNodeMixin(@JsonProperty("profile_message") ProfileMessage profileMessage) {
	}
}
