package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface InvitationOperations {

	/**
	 * Send invitations via email to contacts who do not have a XING profile. 
	 * The user is allowed to invite 2000 people per week.
	 * @param toEmails required. List of one or more comma-separated email addresses. 
	 * NOTE: The current user's email address will be filtered out.
	 * @param message optional. Message that is sent together with the invitation. 
	 * The maximum length of this message is 150 characters for BASIC users and 600 
	 * characters for PREMIUM users. Defaults to the XING standard text for invitations.
	 */

	void sendInvitations(String toEmails, String message);
}
