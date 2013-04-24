/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.social.xing.api.Actor;
import org.springframework.social.xing.api.Award;
import org.springframework.social.xing.api.BirthDate;
import org.springframework.social.xing.api.BusinessAddress;
import org.springframework.social.xing.api.Comment;
import org.springframework.social.xing.api.CommentsNode;
import org.springframework.social.xing.api.Company;
import org.springframework.social.xing.api.ContactPaths;
import org.springframework.social.xing.api.ContactPathsNode;
import org.springframework.social.xing.api.ContactRequest;
import org.springframework.social.xing.api.ContactRequests;
import org.springframework.social.xing.api.Contacts;
import org.springframework.social.xing.api.ContactsNode;
import org.springframework.social.xing.api.Conversation;
import org.springframework.social.xing.api.ConversationNode;
import org.springframework.social.xing.api.Conversations;
import org.springframework.social.xing.api.ConversationsNode;
import org.springframework.social.xing.api.EducationalBackground;
import org.springframework.social.xing.api.FeedObject;
import org.springframework.social.xing.api.GeoCode;
import org.springframework.social.xing.api.Group;
import org.springframework.social.xing.api.Job;
import org.springframework.social.xing.api.JobNode;
import org.springframework.social.xing.api.Jobs;
import org.springframework.social.xing.api.JobsNode;
import org.springframework.social.xing.api.Like;
import org.springframework.social.xing.api.LikesNode;
import org.springframework.social.xing.api.Message;
import org.springframework.social.xing.api.MessageNode;
import org.springframework.social.xing.api.Messages;
import org.springframework.social.xing.api.MessagesNode;
import org.springframework.social.xing.api.MetaComment;
import org.springframework.social.xing.api.MetaLike;
import org.springframework.social.xing.api.NearbyItems;
import org.springframework.social.xing.api.NearbyItemsNode;
import org.springframework.social.xing.api.NearbyUsers;
import org.springframework.social.xing.api.NetworkActivitiesNode;
import org.springframework.social.xing.api.NetworkFeed;
import org.springframework.social.xing.api.Paths;
import org.springframework.social.xing.api.PhotoUrls;
import org.springframework.social.xing.api.PrivateAddress;
import org.springframework.social.xing.api.ProfessionalExperience;
import org.springframework.social.xing.api.Recommendation;
import org.springframework.social.xing.api.Recommendations;
import org.springframework.social.xing.api.RecommendationsNode;
import org.springframework.social.xing.api.School;
import org.springframework.social.xing.api.SharedContactsNode;
import org.springframework.social.xing.api.TimeZone;
import org.springframework.social.xing.api.User;
import org.springframework.social.xing.api.Visit;
import org.springframework.social.xing.api.Visits;
import org.springframework.social.xing.api.XingProfile;
import org.springframework.social.xing.api.XingProfiles;

import com.twentyzen.webzunder.server.share.model.foursquare.Location;

/**
 * Jackson module for registering mixin annotations against Xing model classes.
 */
public class XingModule extends SimpleModule {

	public XingModule() {
		super("XingModule", new Version(1, 0, 0, null));
	}

	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(XingProfile.class, XingProfileMixin.class);
		context.setMixInAnnotations(XingProfiles.class, XingProfilesMixin.class);
		context.setMixInAnnotations(BirthDate.class, BirthDateMixin.class);
		context.setMixInAnnotations(PhotoUrls.class, PhotoUrlsMixin.class);
		context.setMixInAnnotations(BusinessAddress.class, BusinessAddressMixin.class);
		context.setMixInAnnotations(Award.class, AwardMixin.class);
		context.setMixInAnnotations(Company.class, CompanyMixin.class);
		context.setMixInAnnotations(Conversation.class, ConversationMixin.class);
		context.setMixInAnnotations(ConversationNode.class, ConversationNodeMixin.class);
		context.setMixInAnnotations(Conversations.class, ConversationsMixin.class);
		context.setMixInAnnotations(ConversationsNode.class, ConversationsNodeMixin.class);
		context.setMixInAnnotations(Message.class, MessageMixin.class);
		context.setMixInAnnotations(MessageNode.class, MessageNodeMixin.class);
		context.setMixInAnnotations(Messages.class, MessagesMixin.class);
		context.setMixInAnnotations(MessagesNode.class, MessagesNodeMixin.class);
		context.setMixInAnnotations(EducationalBackground.class, EducationalBackgroundMixin.class);
		context.setMixInAnnotations(PrivateAddress.class, PrivateAddressMixin.class);
		context.setMixInAnnotations(ProfessionalExperience.class, ProfessionalExperienceMixin.class);
		context.setMixInAnnotations(School.class, SchoolMixin.class);
		context.setMixInAnnotations(TimeZone.class, TimeZoneMixin.class);
		context.setMixInAnnotations(User.class, UserMixin.class);

		context.setMixInAnnotations(Job.class, JobMixin.class);
		context.setMixInAnnotations(JobNode.class, JobNodeMixin.class);
		context.setMixInAnnotations(Jobs.class, JobsMixin.class);
		context.setMixInAnnotations(JobsNode.class, JobsNodeMixin.class);
		context.setMixInAnnotations(GeoCode.class, GeoCodeMixin.class);
		context.setMixInAnnotations(Location.class, LocationMixin.class);

		context.setMixInAnnotations(Contacts.class, ContactsMixin.class);
		context.setMixInAnnotations(ContactsNode.class, ContactsNodeMixin.class);
		context.setMixInAnnotations(SharedContactsNode.class, SharedContactsNodeMixin.class);

		context.setMixInAnnotations(ContactRequest.class, ContactRequestMixin.class);
		context.setMixInAnnotations(ContactRequests.class, ContactRequestsMixin.class);

		context.setMixInAnnotations(Paths.class, PathsMixin.class);
		context.setMixInAnnotations(ContactPaths.class, ContactPathsMixin.class);
		context.setMixInAnnotations(ContactPathsNode.class, ContactPathsNodeMixin.class);

		context.setMixInAnnotations(NetworkActivitiesNode.class, NetworkActivitiesNodeMixin.class);
		context.setMixInAnnotations(NetworkFeed.class, NetworkFeedMixin.class);
		context.setMixInAnnotations(MetaComment.class, MetaCommentMixin.class);
		context.setMixInAnnotations(MetaLike.class, MetaLikeMixin.class);
		context.setMixInAnnotations(Actor.class, ActorMixin.class);
		context.setMixInAnnotations(Group.class, GroupMixin.class);
		context.setMixInAnnotations(FeedObject.class, FeedObjectMixin.class);
		context.setMixInAnnotations(Comment.class, CommentMixin.class);
		context.setMixInAnnotations(CommentsNode.class, CommentsNodeMixin.class);
		context.setMixInAnnotations(Like.class, LikeMixin.class);
		context.setMixInAnnotations(LikesNode.class, LikesNodeMixin.class);
		context.setMixInAnnotations(Visit.class, VisitMixin.class);
		context.setMixInAnnotations(Visits.class, VisitsMixin.class);
		context.setMixInAnnotations(Recommendation.class, RecommendationMixin.class);
		context.setMixInAnnotations(Recommendations.class, RecommendationsMixin.class);
		context.setMixInAnnotations(RecommendationsNode.class, RecommendationsNodeMixin.class);
		context.setMixInAnnotations(NearbyUsers.class, NearbyUsersMixin.class);
		context.setMixInAnnotations(NearbyItems.class, NearbyItems.class);
		context.setMixInAnnotations(NearbyItemsNode.class, NearbyItemsNode.class);
	}
}
