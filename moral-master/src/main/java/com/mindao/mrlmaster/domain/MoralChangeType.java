package com.mindao.mrlmaster.domain;

public enum MoralChangeType {

	PROPOSAL_EXPENDITURE(1), INVEST_EXPENDITURE(2);

	private final int value;

	private MoralChangeType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
