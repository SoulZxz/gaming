package com.mindao.mrlmaster.repo.impl;

import org.springframework.stereotype.Repository;

import com.mindao.mrlmaster.domain.MoralEvent;
import com.mindao.mrlmaster.repo.MoralEventRepository;

@Repository
public class MoralEventRepositoryImpl extends DefaultRepositoryImpl<MoralEvent, Long> implements
		MoralEventRepository {

}
