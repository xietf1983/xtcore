package com.xtsoft.kernel.service.base.persistence;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.xtsoft.kernel.service.base.model.BaseModel;

public class BasePersistence<T extends BaseModel<T>> extends SqlSessionDaoSupport {
	@Autowired
	public void setSqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public void insert(String statement, T model) {
		getSqlSession().insert(statement, model);
	}

	public void remove(String statement, T model) {
		getSqlSession().delete(statement, model);
	}

	public void update(String statement, T model) {
		getSqlSession().update(statement, model);
	}

	public List selectList(String statement) {
		return selectList(statement, null);
	}

	public List selectList(String statement, Object parameter) {
		return getSqlSession().selectList(statement, parameter);
	}

	public List selectPageList(String statement, Object parameter, int start, int limit) {
		return getSqlSession().selectList(statement, parameter, new RowBounds(start, limit));
	}

	public Object selectOne(String statement, Object parameter) {
		return getSqlSession().selectOne(statement, parameter);
	}

	public void close() {
		getSqlSession().close();
	}

	public void commit() {
		getSqlSession().commit();
	}

	public void rollback() {
		getSqlSession().rollback();
	}
}
