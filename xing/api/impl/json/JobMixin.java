package org.springframework.social.xing.api.impl.json;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Company;
import org.springframework.social.xing.api.Contact;
import org.springframework.social.xing.api.Job.Industry;
import org.springframework.social.xing.api.Job.Level;
import org.springframework.social.xing.api.Location;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class JobMixin {

	@JsonCreator
	JobMixin(@JsonProperty("id") String id) {
	}

	@JsonProperty("location")
	Location location;

	@JsonProperty("title")
	String title;

	@JsonProperty("level")
	Level level;

	@JsonProperty("job_type")
	String jobType;

	@JsonProperty("industry")
	Industry industry;

	@JsonProperty("company")
	Company company;

	@JsonProperty("skills")
	List<String> skills;

	@JsonProperty("description")
	String description;

	@JsonProperty("tags")
	List<String> tags;

	@JsonProperty("published_at")
	String publishedAt;

	@JsonProperty("links")
	Map<String, String> links;

	@JsonProperty("contact")
	Contact contact;
}
