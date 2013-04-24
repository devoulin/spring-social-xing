package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.School;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class EducationalBackgroundMixin {

	@JsonCreator
	 EducationalBackgroundMixin(@JsonProperty("schools")List<School> schools,
								@JsonProperty("qualifications") List<String> qualifications) {}
}
