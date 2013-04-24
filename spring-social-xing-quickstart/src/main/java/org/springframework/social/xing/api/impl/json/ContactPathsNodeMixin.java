package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.ContactPaths;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactPathsNodeMixin {

	@JsonCreator
	public ContactPathsNodeMixin(@JsonProperty("contact_paths") ContactPaths contactPaths) {
	}
}
