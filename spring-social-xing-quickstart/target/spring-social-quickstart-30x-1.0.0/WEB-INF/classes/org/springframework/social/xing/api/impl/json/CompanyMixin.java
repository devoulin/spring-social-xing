package org.springframework.social.xing.api.impl.json;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Company.CareerLevel;
import org.springframework.social.xing.api.Company.Industry;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CompanyMixin {

	@JsonCreator
	CompanyMixin() {
	}

	@JsonProperty("name")
	String name;

	@JsonProperty("title")
	String title;

	@JsonProperty("company_size")
	String companySize;

	@JsonProperty("tag")
	String tag;

	@JsonProperty("url")
	String url;

	@JsonProperty("career_level")
	CareerLevel careerLevel;

	@JsonProperty("begin_date")
	String beginDate;

	@JsonProperty("description")
	String description;

	@JsonProperty("end_date")
	String endDate;

	@JsonProperty("industry")
	Industry industry;

	@JsonProperty("links")
	Map<String, String> links;
}
