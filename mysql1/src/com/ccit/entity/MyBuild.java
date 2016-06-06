package com.ccit.entity;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



public class MyBuild<T> implements Build<T> {
	private Class<T> type;

	public MyBuild(Class<T> type) {
		this.type = type;
	}

	@Override
	public T build(ResultSet rs) throws SQLException {
		T obj = null;
		try {
			obj = type.newInstance();
		} catch (Exception e) {
			System.out.println("obj error");
		}
		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			String name = rsmd.getColumnLabel(i);
			name = "set" + name.substring(0, 1).toUpperCase()
					+ name.substring(1);
			Method[] mts = type.getMethods(); 
			for (Method mt : mts) {
				if (mt.getName().equals(name)) {
					try {
						mt.invoke(obj, rs.getObject(i));
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}

		}
		return obj;

	}

}
