package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ProfessionalExperience implements Serializable {

	private static final long serialVersionUID = 8017359819991108037L;

	private Company primaryCompany;
	private List<Company> nonPrimaryCompanies;
	private List<Award> awards;

	public Company getPrimaryCompany() {
		return primaryCompany;
	}

	public void setPrimaryCompany(Company primaryCompany) {
		this.primaryCompany = primaryCompany;
	}

	public List<Company> getNonPrimaryCompanies() {
		return nonPrimaryCompanies;
	}

	public void setNonPrimaryCompanies(List<Company> nonPrimaryCompanies) {
		this.nonPrimaryCompanies = nonPrimaryCompanies;
	}

	public List<Award> getAwards() {
		return awards;
	}

	public void setAwards(List<Award> awards) {
		this.awards = awards;
	}
}
