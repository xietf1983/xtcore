package com.xtsoft.kernel.service.base.model;

import java.io.Serializable;

public abstract class BaseModel<T> implements Cloneable, Serializable {

	public abstract Object clone();

}