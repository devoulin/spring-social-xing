package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.NearbyItems;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NearbyItemsMixin {

	@JsonCreator
	public NearbyItemsMixin(@JsonProperty("nearby_items") NearbyItems nearbyItems) {
	}
}
