package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Location;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LocationMixin {

	@JsonCreator
	   public LocationMixin(@JsonProperty("city") String city, 
							@JsonProperty("country") String country, 
							@JsonProperty("street") String street, 
							@JsonProperty("zipcode") String zipcode, 
							@JsonProperty("region") String region) {
	}

	@JsonProperty("geo_code")
	Location geoCode;
}
