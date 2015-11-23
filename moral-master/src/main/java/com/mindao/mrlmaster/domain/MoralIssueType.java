package com.mindao.mrlmaster.domain;

public enum MoralIssueType {

	EXPERIMENT(1);

	private final int value;

	private MoralIssueType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
