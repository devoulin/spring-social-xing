package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Recommendations;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class RecommendationsNodeMixin {

	@JsonCreator
	public RecommendationsNodeMixin(@JsonProperty("user_recommendations") Recommendations recommendations) {
	}
}
