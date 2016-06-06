package com.ccit.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class DBHelper<T> {
	private String url;
	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public DBHelper(String url) {
		this.url = url;
	}

	public void closeCon() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null) {
					pst.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}
	}

	private PreparedStatement getSta(String sql) {
		try {
			con = DriverManager.getConnection(url);
			pst = con.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("pst error");
			e.printStackTrace();
		}
		return pst;

	}

	public int getUpdate(String sql, Object... o) {
		getSta(sql);
		try {
			for (int i = 1; i <= o.length; i++) {
				pst.setObject(i, o[i - 1]);
			}
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update error");
			return -1;
		} finally {
			closeCon();
		}
	}

	public T getQuery(String sql, Build<T> b, Object... o) {
		getSta(sql);
		try {
			for (int i = 1; i <= o.length; i++) {
				pst.setObject(i, o[i - 1]);
			}
			ResultSet rs = pst.executeQuery();
			if (rs != null && rs.next()) {
				return b.build(rs);
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("query error");
			return null;
		} finally {
			closeCon();
		}

	}

	public List<T> getQueryAll(String sql, Build<T> b, Object... o) {
		getSta(sql);
		try {
			for (int i = 1; i <= o.length; i++) {
				pst.setObject(i, o[i - 1]);
			}
			ResultSet rs = pst.executeQuery();
			List<T> list = new ArrayList<>();
			while(rs != null && rs.next()){
				list.add(b.build(rs));
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			closeCon();
		}
	}
}
