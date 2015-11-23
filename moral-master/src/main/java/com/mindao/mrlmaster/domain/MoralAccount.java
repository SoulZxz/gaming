package com.mindao.mrlmaster.domain;

public class MoralAccount {

	private Long userId;

	private Integer status;

	private Integer moralValue;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getMoralValue() {
		return moralValue;
	}

	public void setMoralValue(Integer moralValue) {
		this.moralValue = moralValue;
	}

}
