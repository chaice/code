package com.ccit.entity;

import java.sql.ResultSet;


public interface Build<T> {
	T build(ResultSet rs)throws Exception ;

}
