package com.mindao.mrlmaster.service.impl;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindao.mrlmaster.bean.ExperimentProposalTemplate;
import com.mindao.mrlmaster.domain.IssueBoardMember;
import com.mindao.mrlmaster.domain.MoralAccount;
import com.mindao.mrlmaster.domain.MoralChange;
import com.mindao.mrlmaster.domain.MoralChangeType;
import com.mindao.mrlmaster.domain.MoralEvent;
import com.mindao.mrlmaster.domain.MoralEventStatus;
import com.mindao.mrlmaster.domain.MoralEventType;
import com.mindao.mrlmaster.domain.MoralIssue;
import com.mindao.mrlmaster.domain.MoralIssueStatus;
import com.mindao.mrlmaster.domain.MoralIssueType;
import com.mindao.mrlmaster.repo.IssueBoardMemberRepository;
import com.mindao.mrlmaster.repo.MoralAccountRepository;
import com.mindao.mrlmaster.repo.MoralChangeRepository;
import com.mindao.mrlmaster.repo.MoralEventRepository;
import com.mindao.mrlmaster.repo.MoralIssueRepository;
import com.mindao.mrlmaster.service.MoralIssueService;

@Service
public class MoralIssueServiceImpl implements MoralIssueService {

	@Autowired
	private MoralAccountRepository moralAccountRepository;

	@Autowired
	private MoralIssueRepository moralIssueRepository;

	@Autowired
	private MoralChangeRepository moralChangeRepository;

	@Autowired
	private IssueBoardMemberRepository issueBoardMemberRepository;

	@Autowired
	private MoralEventRepository moralEventRepository;

	@Override
	public MoralIssue proposeExperiment(Long submitter, Set<IssueBoardMember> proposedTeam,
			ExperimentProposalTemplate proposal) {
		MoralIssue experiment = new MoralIssue();
		experiment.setBoardMembers(proposedTeam);
		experiment.setDescription(proposal.toDescription());
		experiment.setOccurTime(new Date());
		experiment.setStatus(MoralIssueStatus.ASSEMBLING.getValue());
		experiment.setSubmitter(submitter);
		experiment.setTitle(proposal.getTitle());
		experiment.setType(MoralIssueType.EXPERIMENT.getValue());
		experiment.setTimeToLive(proposal.getTimeFrameInDays());
		moralIssueRepository.save(experiment);

		// 计算分数减值
		int boardSizeExpenditure = proposedTeam.size() * 5;
		double ttlMultiplier = experiment.getTimeToLive() / 15d;
		int expenditure = (int) Math.floor(boardSizeExpenditure * ttlMultiplier);

		// 扣分
		MoralAccount moralAccount = moralAccountRepository.get(submitter);

		MoralChange change = new MoralChange();
		change.setBeforeChange(moralAccount.getMoralValue());
		change.setChange(-expenditure);
		change.setChangeDate(new Date());
		change.setSourceIssueId(experiment.getId());
		change.setTargetUser(submitter);
		change.setType(MoralChangeType.PROPOSAL_EXPENDITURE.getValue());
		moralChangeRepository.save(change);

		moralAccount.setMoralValue(moralAccount.getMoralValue() - expenditure);
		moralAccountRepository.save(moralAccount);
		return experiment;
	}

	@Override
	public void recruitBoardMember(long boardMemberId, long boardUserId) {
		IssueBoardMember issueBoardMember = issueBoardMemberRepository.get(boardMemberId);
		issueBoardMember.setUserId(boardUserId);
		issueBoardMemberRepository.save(issueBoardMember);
	}

	@Override
	public void investIssue(long issueId, long boosterUserId, int boostValue) {
		MoralEvent moralEvent = new MoralEvent();
		moralEvent.setDescription("投资" + boostValue + "点节操");
		moralEvent.setIssueId(issueId);
		moralEvent.setOccurTime(new Date());
		moralEvent.setStatus(MoralEventStatus.FINISHED.getValue());
		moralEvent.setSubmitter(boosterUserId);
		moralEvent.setTitle("投资");
		moralEvent.setType(MoralEventType.INVEST_ISSUE.getValue());
		moralEventRepository.save(moralEvent);

		// 扣分
		MoralAccount moralAccount = moralAccountRepository.get(boosterUserId);

		MoralChange change = new MoralChange();
		change.setBeforeChange(moralAccount.getMoralValue());
		change.setChange(-boostValue);
		change.setChangeDate(new Date());
		change.setSourceEventId(moralEvent.getId());
		change.setSourceIssueId(issueId);
		change.setTargetUser(boosterUserId);
		change.setType(MoralChangeType.INVEST_EXPENDITURE.getValue());
		moralChangeRepository.save(change);

		moralAccount.setMoralValue(moralAccount.getMoralValue() - boostValue);
		moralAccountRepository.save(moralAccount);
	}

	@Override
	public long milestoneArrive(MoralEvent event) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long problemOccur(MoralEvent event) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long problemSolved(MoralEvent event) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void concludeExperiment(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rateExperimentPerformance(long issueId, int rating, long raterUserId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void archiveExperiment(long id) {
		// TODO Auto-generated method stub

	}

}
