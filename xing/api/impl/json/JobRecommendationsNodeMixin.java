package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Jobs;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class JobRecommendationsNodeMixin {

	@JsonCreator
	public JobRecommendationsNodeMixin(@JsonProperty("job_recommendations") Jobs jobs) {
	}
}
