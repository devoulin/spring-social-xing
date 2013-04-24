package org.springframework.social.xing.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.Award;
import org.springframework.social.xing.api.Company;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfessionalExperienceMixin {

	@JsonCreator
	ProfessionalExperienceMixin(){}
	
	@JsonProperty("primary_company")
	Company primaryCompany;
	
	@JsonProperty("non_primary_companies")
	List<Company> nonPrimaryCompanies;
	
	@JsonProperty("awards")
	List<Award> awards;
}
