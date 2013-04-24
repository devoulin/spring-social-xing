package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class User implements Serializable {

	private static final long serialVersionUID = 155224425814052325L;

	private final String id;
	private String firstName;
	private String lastName;
	private String displayName;
	private String pageName;
	private String permalink;
	private String gender;
	private BirthDate birthDate;
	private String activeEmail;
	private TimeZone timeZone;
	private List<PremiumService> premiumServices;
	private List<String> badges;
	private String wants;
	private String haves;
	private String interests;
	private String organisationMember;
	private Map<Language, LanguageLevel> languages;
	private PrivateAddress privateAddress;
	private BusinessAddress BusinessAddress;
	private Map<String, List<String>> webProfiles;
	private Map<InstantMessagingAccount, String> instantMessagingAccount;
	private ProfessionalExperience professionalExperience;
	private EducationalBackground educationalBackground;
	private PhotoUrls photoUrls;

	public User(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BirthDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getActiveEmail() {
		return activeEmail;
	}

	public void setActiveEmail(String activeEmail) {
		this.activeEmail = activeEmail;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public List<PremiumService> getPremiumServices() {
		return premiumServices;
	}

	public void setPremiumServices(List<PremiumService> premiumServices) {
		this.premiumServices = premiumServices;
	}

	public List<String> getBadges() {
		return badges;
	}

	public void setBadges(List<String> badges) {
		this.badges = badges;
	}

	public String getHaves() {
		return haves;
	}

	public void setHaves(String haves) {
		this.haves = haves;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getOrganisationMember() {
		return organisationMember;
	}

	public void setOrganisationMember(String organisationMember) {
		this.organisationMember = organisationMember;
	}

	public Map<Language, LanguageLevel> getLanguages() {
		return languages;
	}

	public void setLanguages(Map<Language, LanguageLevel> languages) {
		this.languages = languages;
	}

	public PrivateAddress getPrivateAddress() {
		return privateAddress;
	}

	public void setPrivateAddress(PrivateAddress privateAddress) {
		this.privateAddress = privateAddress;
	}

	public BusinessAddress getBusinessAddress() {
		return BusinessAddress;
	}

	public void setBusinessAddress(BusinessAddress businessAddress) {
		BusinessAddress = businessAddress;
	}

	public Map<InstantMessagingAccount, String> getInstantMessagingAccount() {
		return instantMessagingAccount;
	}

	public void setInstantMessagingAccount(Map<InstantMessagingAccount, String> instantMessagingAccount) {
		this.instantMessagingAccount = instantMessagingAccount;
	}

	public ProfessionalExperience getProfessionalExperience() {
		return professionalExperience;
	}

	public void setProfessionalExperience(ProfessionalExperience professionalExperience) {
		this.professionalExperience = professionalExperience;
	}

	public EducationalBackground getEducationalBackground() {
		return educationalBackground;
	}

	public void setEducationalBackground(EducationalBackground educationalBackground) {
		this.educationalBackground = educationalBackground;
	}

	public PhotoUrls getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(PhotoUrls photoUrls) {
		this.photoUrls = photoUrls;
	}

	public String getId() {
		return id;
	}

	public String getWants() {
		return wants;
	}

	public void setWants(String wants) {
		this.wants = wants;
	}

	public Map<String, List<String>> getWebProfiles() {
		return webProfiles;
	}

	public void setWebProfiles(Map<String, List<String>> webProfiles) {
		this.webProfiles = webProfiles;
	}

	public static enum InstantMessagingAccount {
		skype, icq, msn, yahoo, aim, jabber, googletalk
	}

	public static enum LanguageLevel {
		BASIC, GOOD, FLUENT, NATIVE
	}

	public static enum Language {
		de, en, es, fi, fr, hu, it, ja, ko, nl, pl, pt, ru, sv, tr, zh, ro, no, cs, el, da, ar, he
	}

	//	public static enum Badge {
	//		PREMIUM, MODERATOR, EXPERT, AMBASSADOR
	//	}

	public static enum PremiumService {
		SEARCH, PRIVATEMESSAGES, NOADVERTISING
	}
}
