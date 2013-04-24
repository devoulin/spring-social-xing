package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.ContactRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactRequestsMixin {

	@JsonCreator
	public ContactRequestsMixin(@JsonProperty("contact_requests") List<ContactRequest> contactRequests) {
	}
}
