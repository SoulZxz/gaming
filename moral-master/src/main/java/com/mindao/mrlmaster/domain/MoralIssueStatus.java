package com.mindao.mrlmaster.domain;

public enum MoralIssueStatus {

	ASSEMBLING(1);

	private final int value;

	private MoralIssueStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
