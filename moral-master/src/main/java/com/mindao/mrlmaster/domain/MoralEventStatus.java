package com.mindao.mrlmaster.domain;

public enum MoralEventStatus {

	OPENED(1), FINISHED(2);

	private final int value;

	private MoralEventStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
