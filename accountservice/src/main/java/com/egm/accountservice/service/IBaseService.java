package com.egm.accountservice.service;

import java.util.List;

public interface IBaseService<T,R> {

	public R save(T t);
	public List<T> list();
	public boolean delete(T t);
	public  T update(T t);

}
