package com.ccit.admindao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.ccit.admin.Major;
import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;


public class MajorDao {
	DBHelper db = new DBHelper(Entity.URL);

	public int insert(Major ma) {
		String sql = "insert into `major`(`name`)values(?)";
		return db.getUpdate(sql, ma.getName());
	}

	public int remove(Integer id) {
		String sql = "delete from `major`where `id` = ?";
		return db.getUpdate(sql, id);
	}

	public int alter(Major ma) {
		String sql = "update `major` set `name`=? where `id`=? ";
		return db.getUpdate(sql, ma.getName(), ma.getId());
	}

	public Major find(Integer id) {
		String sql = "select `id`,`name`from`major`where `id` = ?";
		Build<Major> b = new MajorMap();
		Major ma = (Major) db.getQuery(sql, b, id);
		return ma;
		
		
	}
	public List<Major> findAll(){
		String sql = "select `id`, `name` from `major`";
		Build<Major> b = new MajorMap();
		return db.getQueryAll(sql, b);
		
	}

	private Major build(ResultSet rs) throws SQLException {
		Major ma = new Major();
		ma.setId(rs.getInt("id"));
		ma.setName(rs.getString("name"));
		return ma;
	}
	class MajorMap implements Build<Major>{

		@Override
		public Major build(ResultSet rs) throws SQLException {
			Major ma = new Major();
			ma.setId(rs.getInt("id"));
			ma.setName(rs.getString("name"));
			return ma;
		
		}
		
	}

}
