package com.xtsoft.kernel.log.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xtsoft.kernel.log.model.LogEvent;
import com.xtsoft.kernel.log.persistence.LogPersistence;

@Service("logService")
public class LogService {
	private LogPersistence persistence;

	public LogPersistence getPersistence() {
		return persistence;
	}

	public void setLogPersistence(LogPersistence persistence) {
		this.persistence = persistence;
	}

	public void saveEntity(LogEvent model) {
		if (findByPrimaryKey(model.getId()) != null) {
			getPersistence().updateEntity(model);
		} else {
			getPersistence().insertEntity(model);
		}
	}

	public void removeEntity(LogEvent model) {
		removeEntity(model);
	}

	public void updateEntity(LogEvent model) {
		updateEntity(model);
	}

	public LogEvent findByPrimaryKey(long id) {
		return (LogEvent) findByPrimaryKey(id);
	}

	public LogEvent create(long id) {
		LogEvent model = new LogEvent();
		model.setId(id);
		return model;
	}

}
