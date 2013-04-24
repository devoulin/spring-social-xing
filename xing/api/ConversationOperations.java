package org.springframework.social.xing.api;

/**
 * Operations on Conversations API
 * 
 * @author Tomasz Wojtowicz
 *
 */
public interface ConversationOperations {

	/**
	 * Returns the list of conversations for the given user. The list is sorted by the 
	 * updated_at field of each conversation. The number of unread conversations in the
	 * unread_count response field is limited to 100.
	 * @param userId - required. ID of the user starting the conversation
	 * @param limit - optional. Restrict the number of conversations to be returned. 
	 * This must be a positive number. Default: 10, Maximum: 100
	 * @param offset - optional. This must be a positive number. Default: 0
	 * @param withLatestMessages - optional. Number of latest messages to include. 
	 * Must be non-negative. Default: 0, Maximum: 100
	 * @return {@link ConversationsNode}
	 */

	Conversations getConversations(String userId, Integer limit, Integer offset, Integer withLatestMessages);

	/**
	 * Starts a conversation by sending the passed message to the recipients. The subject
	 * of a conversation cannot be changed afterwards. Basic members are not allowed to send
	 * messages to non-contacts. Premium members are limited to 20 messages to non-contacts per month.
	 * @param content - required. Message text. Max. size is 16384 UTF-8 characters.
	 * @param recipientIds - required. Comma-separated list of recipients. There must be between one
	 * and 10 recipients. Sender cannot be included.
	 * @param subject - required. Subject for conversation. Max. size is 32 UTF-8 characters
	 * @param userId - required. ID of the user starting the conversation
	 */

	Conversation createConversation(String content, String recipientIds, String subject, String userId);

	/**
	 * Check if it's possible to send a message to the selected recipient.
	 * @param id - required. ID of the user that should be validated
	 */

	boolean isRecipientValidate(String id);

	/**
	 * Returns a single conversation. This call returns the same conversations format as the 
	 * "List conversations" call.
	 * @param id - required. Conversation ID.
	 * @param userId - required. ID of the user starting the conversation
	 * @param withLatestMessages - Optional. Number of latest messages to include. 
	 * Must be non-negative. Default: 0, Maximum: 100
	 * @return {@link Conversation}
	 */

	Conversation getConversation(String id, String userId, Integer withLatestMessages);

	/**
	 * Marks all messages in the conversation as read.
	 * @param id - required. ID of the conversation that should be marked as read
	 * @param userId - required. ID of the user owning the message.
	 */

	void markConversationAsRead(String id, String userId);

	/**
	 * Add a contact of yours to a conversation.
	 * @param conversationId required. ID of a conversation
	 * @param id - required. ID of the user that should be invited to the conversation
	 * @param userId - required. ID of the user starting the conversation.
	 */

	void addContactToConversation(String conversationId, String id, String userId);

	/**
	 * Returns the messages for a conversation.
	 * @param conversationId - required. ID of the conversation that the message belongs to
	 * @param userId - required. ID of the user owning the message
	 * @param limit - optional. Restrict the number of conversations to be returned. This must be a 
	 * positive number. Default: 10
	 * @param offset - optional. Offset. This must be a positive number. Default: 0
	 * @return {@link Messages}
	 */

	Messages getMessages(String conversationId, String userId, Integer limit, Integer offset);

	/**
	 * Returns a single message.
	 * @param conversationId - required. ID of the conversation where the message is created in
	 * @param id - required. Message text with max size of 16384 characters
	 * @param userId - required. ID of the message sender
	 * @return {@link Message}
	 */

	Message getMessage(String conversationId, String id, String userId);

	/**
	 * Marks a message in a conversation as read.
	 * @param conversationId - required. ID of the conversation that the message belongs to
	 * @param id - required. ID of the message that should be marked as read
	 * @param userId - required. ID of the user owning the message
	 */

	void markMessageAsRead(String conversationId, String id, String userId);

	/**
	 * Marks a message in a conversation as unread.
	 * @param conversationId - required. ID of the conversation that the message belongs to
	 * @param id - required. ID of the message that should be marked as read
	 * @param userId - required. ID of the user owning the message
	 */

	void markMessageAsUnread(String conversationId, String id, String userId);

	/**
	 * Creates a new message in an existing conversation.
	 * @param content - required. Message text with max size of 16384 characters
	 * @param conversationId - required. ID of the conversation where the message is created in
	 * @param userId - required. ID of the message sender
	 * @return {@link Message}
	 */

	Message createMessage(String content, String conversationId, String userId);

	/**
	 * Delete a conversation
	 * @param id - required. ID ot the conversation to delete
	 * @param userId - required. ID of the user deleting the conversation
	 */

	void deleteConversation(String id, String userId);
}
