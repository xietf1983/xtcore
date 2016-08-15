package com.xtsoft.kernel.log.persistence;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.xtsoft.kernel.log.model.LogEvent;
import com.xtsoft.kernel.service.base.model.BaseModel;
import com.xtsoft.kernel.service.base.persistence.BasePersistence;

public class LogPersistence<T extends BaseModel<T>> extends BasePersistence {
	private static final String insert_statement = "";
	private static final String remove_statement = "";
	private static final String update_statement = "";
	private static final String findone_statement = "";

	public void insertEntity(T model) {
		insert(insert_statement, model);
	}

	public void removeEntity(T model) {
		remove(remove_statement, model);
	}

	public void updateEntity(T model) {
		update(update_statement, model);
	}

	public LogEvent findByPrimaryKey(Object parameter) {
		return (LogEvent) selectOne(findone_statement, parameter);
	}
}
