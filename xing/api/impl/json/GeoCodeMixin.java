package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class GeoCodeMixin {

	@JsonCreator
	   GeoCodeMixin(@JsonProperty("accuracy") String accuracy, 
					@JsonProperty("latitude") String latitude,
					@JsonProperty("longitude") String longitude) {
	}
}
