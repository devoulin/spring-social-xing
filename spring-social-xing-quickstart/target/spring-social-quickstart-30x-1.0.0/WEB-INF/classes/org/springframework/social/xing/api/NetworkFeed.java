package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class NetworkFeed implements Serializable {

	private static final long serialVersionUID = 7666852315597050497L;

	private List<Actor> actors;
	private String verb;
	private List<FeedObject> objects;
	private List<Group> targets;
	private List<String> ids;
	private String type;
	private Boolean aggregated;
	private String aggregatedBy;
	private List<PossibleActions> possibleActions;
	private Date createdAt;
	private List<String> changes;
	private MetaComment comments;
	private MetaLike likes;

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public List<FeedObject> getObjects() {
		return objects;
	}

	public void setObjects(List<FeedObject> objects) {
		this.objects = objects;
	}

	public List<Group> getTargets() {
		return targets;
	}

	public void setTargets(List<Group> targets) {
		this.targets = targets;
	}

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getAggregated() {
		return aggregated;
	}

	public void setAggregated(Boolean aggregated) {
		this.aggregated = aggregated;
	}

	public String getAggregatedBy() {
		return aggregatedBy;
	}

	public void setAggregatedBy(String aggregatedBy) {
		this.aggregatedBy = aggregatedBy;
	}

	public List<PossibleActions> getPossibleActions() {
		return possibleActions;
	}

	public void setPossibleActions(List<PossibleActions> possibleActions) {
		this.possibleActions = possibleActions;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<String> getChanges() {
		return changes;
	}

	public void setChanges(List<String> changes) {
		this.changes = changes;
	}

	public MetaComment getComments() {
		return comments;
	}

	public void setComments(MetaComment comments) {
		this.comments = comments;
	}

	public MetaLike getLikes() {
		return likes;
	}

	public void setLikes(MetaLike likes) {
		this.likes = likes;
	}

	public static enum PossibleActions {
		COMMENT, LIKE, SHARE, DELETE, IGNORE
	}
}
