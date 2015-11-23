package com.mindao.mrlmaster.domain;

import java.util.Date;

public class MoralEvent {

	private Long id;

	private Long issueId;

	private Integer type;

	private String title;

	private String description;

	private Long submitter;

	private Long handler;

	private Date occurTime;

	private Date handleTime;

	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public Long getHandler() {
		return handler;
	}

	public void setHandler(Long handler) {
		this.handler = handler;
	}

	public Date getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public Date getHandleTime() {
		return handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
