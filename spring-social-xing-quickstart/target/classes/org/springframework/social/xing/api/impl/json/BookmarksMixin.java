package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Bookmark;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BookmarksMixin {

	@JsonCreator
	public BookmarksMixin(@JsonProperty("total") int total, 
						  @JsonProperty("items") List<Bookmark> items) {
	}
}
