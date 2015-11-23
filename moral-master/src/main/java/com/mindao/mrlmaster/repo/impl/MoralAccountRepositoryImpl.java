package com.mindao.mrlmaster.repo.impl;

import org.springframework.stereotype.Repository;

import com.mindao.mrlmaster.domain.MoralAccount;
import com.mindao.mrlmaster.repo.MoralAccountRepository;

@Repository
public class MoralAccountRepositoryImpl extends DefaultRepositoryImpl<MoralAccount, Long> implements
		MoralAccountRepository {

}
