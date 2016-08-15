package com.xtsoft.kernel.log.service;

import com.xtsoft.kernel.log.model.LogEvent;
import com.xtsoft.kernel.log.persistence.LogPersistence;

public class LogService {
	private LogPersistence persistence;

	public LogPersistence getPersistence() {
		return persistence;
	}

	public void setPersistence(LogPersistence persistence) {
		this.persistence = persistence;
	}

	public void insertEntity(LogEvent model) {
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

}
