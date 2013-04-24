package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Jobs;

@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class JobsMixin {

	@JsonCreator
	  JobsMixin(@JsonProperty("total") int total,
				@JsonProperty("items") Jobs jobs){
	}
}
