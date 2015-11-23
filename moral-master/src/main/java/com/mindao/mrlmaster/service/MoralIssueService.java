package com.mindao.mrlmaster.service;

import java.util.Set;

import com.mindao.mrlmaster.bean.ExperimentProposalTemplate;
import com.mindao.mrlmaster.domain.IssueBoardMember;
import com.mindao.mrlmaster.domain.MoralEvent;
import com.mindao.mrlmaster.domain.MoralIssue;

public interface MoralIssueService {

	/**
	 * <p>
	 * 发起试验
	 * </p>
	 * 
	 * @return
	 */
	MoralIssue proposeExperiment(Long submitter, Set<IssueBoardMember> proposedTeam,
			ExperimentProposalTemplate proposal);

	/**
	 * <p>
	 * 人员加入试验团队
	 * </p>
	 * 
	 * @param boardMemberId
	 * @param boardUserId
	 */
	void recruitBoardMember(long boardMemberId, long boardUserId);

	/**
	 * <p>
	 * 往试验投入
	 * </p>
	 * 
	 * @param issueId
	 * @param investerUserId
	 * @param investValue
	 */
	void investIssue(long issueId, long investerUserId, int investValue);

	/**
	 * <p>
	 * 到达里程碑
	 * </p>
	 * 
	 * @param event
	 * @return
	 */
	long milestoneArrive(MoralEvent event);

	/**
	 * <p>
	 * 问题发生
	 * </p>
	 * 
	 * @param event
	 * @return
	 */
	long problemOccur(MoralEvent event);

	/**
	 * <p>
	 * 问题解决
	 * </p>
	 * 
	 * @param event
	 * @return
	 */
	long problemSolved(MoralEvent event);

	/**
	 * <p>
	 * 试验进入结论阶段
	 * </p>
	 * 
	 * @param id
	 */
	void concludeExperiment(long id);

	/**
	 * <p>
	 * 对试验成果做评分
	 * </p>
	 * 
	 * @param issueId
	 * @param rating
	 * @param raterUserId
	 */
	void rateExperimentPerformance(long issueId, int rating, long raterUserId);

	/**
	 * <p>
	 * 试验存档
	 * </p>
	 * 
	 * @param id
	 */
	void archiveExperiment(long id);
}
