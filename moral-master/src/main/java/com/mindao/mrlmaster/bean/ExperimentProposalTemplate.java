package com.mindao.mrlmaster.bean;

public class ExperimentProposalTemplate {

	private String title;

	private String objective;

	private String expectedResult;

	private Integer timeFrameInDays;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

	public Integer getTimeFrameInDays() {
		return timeFrameInDays;
	}

	public void setTimeFrameInDays(Integer timeFrameInDays) {
		this.timeFrameInDays = timeFrameInDays;
	}

	public String toDescription() {
		StringBuilder result = new StringBuilder();
		result.append("目的: ").append(objective).append("\n");
		result.append("期望结果: ").append(expectedResult).append("\n");
		return result.toString();
	}

}
