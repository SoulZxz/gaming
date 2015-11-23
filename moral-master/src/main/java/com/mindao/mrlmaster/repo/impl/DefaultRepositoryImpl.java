package com.mindao.mrlmaster.repo.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DefaultRepositoryImpl<T, K extends Serializable> extends
		BaseRepositoryImpl<T, K> {

	@Autowired
	public void init(@Qualifier("defaultSessionFactory") SessionFactory factory) {
		setSessionFactory(factory);
	}

}
