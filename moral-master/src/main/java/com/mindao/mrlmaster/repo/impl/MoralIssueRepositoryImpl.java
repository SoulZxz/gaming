package com.mindao.mrlmaster.repo.impl;

import org.springframework.stereotype.Repository;

import com.mindao.mrlmaster.domain.MoralIssue;
import com.mindao.mrlmaster.repo.MoralIssueRepository;

@Repository
public class MoralIssueRepositoryImpl extends DefaultRepositoryImpl<MoralIssue, Long> implements
		MoralIssueRepository {

}
