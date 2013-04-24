package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Job;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class JobNodeMixin {

	@JsonCreator
	JobNodeMixin(@JsonProperty("job") Job job) {
	}
}
