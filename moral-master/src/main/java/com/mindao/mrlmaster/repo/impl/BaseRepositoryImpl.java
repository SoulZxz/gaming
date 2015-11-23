package com.mindao.mrlmaster.repo.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.mindao.mrlmaster.repo.BaseRepository;

/**
 * <p>
 * 通用数据访问实现类
 * </p>
 * 
 * @author zhaoxuanzhang 2013-9-12
 * @param <T>
 *            数据类型
 * @param <K>
 *            数据主键类型
 */
public class BaseRepositoryImpl<T, K extends Serializable> extends HibernateDaoSupport implements
		BaseRepository<T, K> {

	public void save(T t) {
		this.getHibernateTemplate().saveOrUpdate(t);
	}

	public T get(K id) {
		return this.getHibernateTemplate().get(resolveClass(), id);
	}

	public void remove(T t) {
		this.getHibernateTemplate().delete(t);
	}

	@SuppressWarnings("unchecked")
	public List<T> list() {
		return (List<T>) this.getHibernateTemplate().find(
				new StringBuilder("from ").append(getEntityName()).append(" obj order by obj.id")
						.toString());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String hql, Object... params) {
		return (List<T>) this.getHibernateTemplate().find(hql, params);
	}

	@SuppressWarnings("unchecked")
	private Class<T> resolveClass() {
		return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	private String getEntityName() {
		return resolveClass().getName();
	}
}
