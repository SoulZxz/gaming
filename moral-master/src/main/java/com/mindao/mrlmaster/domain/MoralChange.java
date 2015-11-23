package com.mindao.mrlmaster.domain;

import java.util.Date;

public class MoralChange {

	private Long id;

	private Integer change;

	private Date changeDate;

	private Integer type;

	private Long sourceIssueId;

	private Long sourceEventId;

	private Long targetUser;

	private Long sourceUser;

	private Integer beforeChange;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getChange() {
		return change;
	}

	public void setChange(Integer change) {
		this.change = change;
	}

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getSourceIssueId() {
		return sourceIssueId;
	}

	public void setSourceIssueId(Long sourceIssueId) {
		this.sourceIssueId = sourceIssueId;
	}

	public Long getSourceEventId() {
		return sourceEventId;
	}

	public void setSourceEventId(Long sourceEventId) {
		this.sourceEventId = sourceEventId;
	}

	public Long getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(Long targetUser) {
		this.targetUser = targetUser;
	}

	public Long getSourceUser() {
		return sourceUser;
	}

	public void setSourceUser(Long sourceUser) {
		this.sourceUser = sourceUser;
	}

	public Integer getBeforeChange() {
		return beforeChange;
	}

	public void setBeforeChange(Integer beforeChange) {
		this.beforeChange = beforeChange;
	}

}
