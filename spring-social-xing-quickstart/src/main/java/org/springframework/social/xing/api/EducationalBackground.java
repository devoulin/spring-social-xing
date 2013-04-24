package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class EducationalBackground implements Serializable {

	private static final long serialVersionUID = -4329261815258892216L;

	private List<School> schools;
	private List<String> qualifications;

	public EducationalBackground(List<School> schools, List<String> qualifications) {
		super();
		this.schools = schools;
		this.qualifications = qualifications;
	}

	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public List<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
}
