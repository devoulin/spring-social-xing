package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NearbyUsersMixin {

	@JsonCreator
	public NearbyUsersMixin(@JsonProperty("updated_at") String updatedAt, 
							@JsonProperty("user") User user, 
							@JsonProperty("distance") Long distance) {
	}
}
