package com.ccit.tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBHelper<T> {
	private String url;
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private PreparedStatement getSta(String sql){
		try {
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("getSta error");
			e.printStackTrace();
		}
		return ps;
	}
	public int getUpdate(String sql , Object...o){
		getSta(sql);
		try {
			for (int i = 0; i < o.length; i++) {
				ps.setObject(i, o[i-1]);
			}
			return ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("getUpdate error");
			return -1;
		}		
	}
	
	
}
