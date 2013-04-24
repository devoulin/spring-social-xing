package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Contacts;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SharedContactsNodeMixin {

	@JsonCreator
	public SharedContactsNodeMixin(@JsonProperty("shared_contacts") Contacts contacts) {
	}
}
