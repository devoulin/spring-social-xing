package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Visit;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class VisitsMixin {

	@JsonCreator
	public VisitsMixin(@JsonProperty("visits") List<Visit> visits) {
	}
}
