package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Paths;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactPathsMixin {

	@JsonCreator
	   public ContactPathsMixin(@JsonProperty("paths") Paths paths, 
								@JsonProperty("distance") int distance, 
								@JsonProperty("total") int total) {
	}
}
