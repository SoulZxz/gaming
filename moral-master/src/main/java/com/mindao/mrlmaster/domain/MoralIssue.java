package com.mindao.mrlmaster.domain;

import java.util.Date;
import java.util.Set;

public class MoralIssue {

	private Long id;

	private Integer type;

	private Integer difficulty;

	private Double performance;

	private String title;

	private String description;

	private Long submitter;

	private Date occurTime;

	private Integer timeToLive;

	private Integer status;

	private Set<IssueBoardMember> boardMembers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public Double getPerformance() {
		return performance;
	}

	public void setPerformance(Double performance) {
		this.performance = performance;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getSubmitter() {
		return submitter;
	}

	public void setSubmitter(Long submitter) {
		this.submitter = submitter;
	}

	public Date getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(Integer timeToLive) {
		this.timeToLive = timeToLive;
	}

	public Set<IssueBoardMember> getBoardMembers() {
		return boardMembers;
	}

	public void setBoardMembers(Set<IssueBoardMember> boardMembers) {
		this.boardMembers = boardMembers;
	}

}
