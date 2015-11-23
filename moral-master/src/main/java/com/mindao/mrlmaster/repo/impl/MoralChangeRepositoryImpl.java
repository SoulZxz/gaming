package com.mindao.mrlmaster.repo.impl;

import org.springframework.stereotype.Repository;

import com.mindao.mrlmaster.domain.MoralChange;
import com.mindao.mrlmaster.repo.MoralChangeRepository;

@Repository
public class MoralChangeRepositoryImpl extends DefaultRepositoryImpl<MoralChange, Long> implements
		MoralChangeRepository {

}
