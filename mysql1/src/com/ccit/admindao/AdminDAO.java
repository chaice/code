package com.ccit.admindao;

import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.List;

import com.ccit.admin.Admin;

import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;

public class AdminDAO{
	DBHelper db = new DBHelper(Entity.URL);

	public int insert(Admin ad) {
		String sql = "insert into `admin`(`name`,`pwd`) values(?,?)";
		return db.getUpdate(sql, ad.getName(), ad.getPwd());
	}

	public int remove(Integer id) {
		String sql = "delete from `admin`where `id`=?";
		return db.getUpdate(sql, id);
	}

	public int alter(Admin ad) {
		String sql = "update `admin` set `name` = ?,`pwd` = ?where id = ? ";
		return db.getUpdate(sql, ad.getName(), ad.getPwd(), ad.getId());
	}

	public Admin find(Integer id) {
		String sql = "select `id`,`name`,`pwd`from `admin` where id = ?";
		Build<Admin> b = new AdminMap();
		Admin ad = (Admin) db.getQuery(sql, b, id);
		return ad;
	}

	public List<Admin> findAll() {
		String sql = "select `id`,`name`,`pwd`from `admin`";
		Build<Admin> b = new AdminMap();
		return db.getQueryAll(sql, b);
	}

	// public Admin build(ResultSet rs) throws SQLException {
	// Admin ad = new Admin();
	// ad.setId(rs.getInt("id"));
	// ad.setName(rs.getString("name"));
	// ad.setPwd(rs.getString("pwd"));
	// return ad;
	// }
	class AdminMap implements Build<Admin> {

		@Override
		public Admin build(ResultSet rs) throws SQLException {
			Admin ad = new Admin();
			ad.setId(rs.getInt("id"));
			ad.setName(rs.getString("name"));
			ad.setPwd(rs.getString("pwd"));
			return ad;

		}

	}
}
