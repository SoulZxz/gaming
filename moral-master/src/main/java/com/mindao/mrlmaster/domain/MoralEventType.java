package com.mindao.mrlmaster.domain;

public enum MoralEventType {

	INVEST_ISSUE(1);

	private final int value;

	private MoralEventType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
