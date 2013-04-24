package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.Conversation;
import org.springframework.social.xing.api.ConversationNode;
import org.springframework.social.xing.api.ConversationOperations;
import org.springframework.social.xing.api.Conversations;
import org.springframework.social.xing.api.ConversationsNode;
import org.springframework.social.xing.api.Message;
import org.springframework.social.xing.api.MessageNode;
import org.springframework.social.xing.api.Messages;
import org.springframework.social.xing.api.MessagesNode;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ConversationTemplate extends AbstractTemplate implements ConversationOperations {

	private RestOperations restOperations;

	public ConversationTemplate(RestTemplate restOperations) {

		this.restOperations = restOperations;
	}

	@Override
	public Conversations getConversations(String userId, Integer limit, Integer offset, Integer withLatestMessages) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));

		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));

		if (withLatestMessages != null && withLatestMessages > -1)
			parameters.add("with_latest_messages", String.valueOf(withLatestMessages));

		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), ConversationsNode.class).getConversations();
	}

	@Override
	public Conversation createConversation(String content, String recipientIds, String subject, String userId) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("content", content);
		parameters.add("recipient_ids", recipientIds);
		parameters.add("subject", subject);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations").queryParams(parameters);
		return restOperations.postForObject(uriBuilder.build(), null, ConversationNode.class).getConversation();
	}

	@Override
	public boolean isRecipientValidate(String id) {

		try {
			URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/me/conversations/valid_recipients/" + id + ".json");
			restOperations.getForObject(uriBuilder.build(), String.class);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	@Override
	public Conversation getConversation(String id, String userId, Integer withLatestMessages) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (withLatestMessages != null && withLatestMessages > -1)
			parameters.add("with_latest_messages", String.valueOf(withLatestMessages));

		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + id + ".json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), ConversationNode.class).getConversation();
	}

	@Override
	public void markConversationAsRead(String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + id + "/read.json");
		restOperations.put(uriBuilder.build(), null);
	}

	@Override
	public void addContactToConversation(String conversationId, String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + conversationId + "participants/" + id + ".json");
		restOperations.put(uriBuilder.build(), null);
	}

	@Override
	public Messages getMessages(String conversationId, String userId, Integer limit, Integer offset) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));

		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));

		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + conversationId + "/messages.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), MessagesNode.class).getMessages();
	}

	@Override
	public Message getMessage(String conversationId, String id, String userId) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + conversationId + "/messages/" + id + ".json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), MessageNode.class).getMessage();
	}

	@Override
	public void markMessageAsRead(String conversationId, String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + conversationId + "/messages/" + id + "/read.json");
		restOperations.put(uriBuilder.build(), null);
	}

	@Override
	public void markMessageAsUnread(String conversationId, String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + conversationId + "/messages/" + id + "/read.json");
		restOperations.delete(uriBuilder.build());
	}

	@Override
	public Message createMessage(String content, String conversationId, String userId) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("content", content);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + conversationId + "/messages.json").queryParams(parameters);
		return restOperations.postForObject(uriBuilder.build(), null, MessageNode.class).getMessage();
	}

	@Override
	public void deleteConversation(String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/conversations/" + id + ".json");
		restOperations.delete(uriBuilder.build());
	}
}
