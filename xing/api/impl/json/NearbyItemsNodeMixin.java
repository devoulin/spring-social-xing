package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.NearbyItems;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NearbyItemsNodeMixin {

	@JsonCreator
	public NearbyItemsNodeMixin(@JsonProperty("nearby_items") NearbyItems nearbyItems) {
	}
}
