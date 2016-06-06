package com.ccit.admindao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.ccit.admin.Subject;
import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;


public class SubjectDAO {
	DBHelper db = new DBHelper(Entity.URL);

	public int insert(Subject sub) {
		String sql = "insert into `subject`(`name`,`classhour`,`majorid`) values(?,?,?)";
		return db.getUpdate(sql, sub.getName(), sub.getClasshour(),
				sub.getMajorid());
	}

	public int delete(Integer id) {
		String sql = "delete from `subject`where `id`=?";
		return db.getUpdate(sql, id);
	}

	public int alter(Subject sub) {
		String sql = "update `subject` set  `name` = ?, `classhour` = ?, `majorid` = ? where`id`=?";
		return db.getUpdate(sql, sub.getName(), sub.getClasshour(),
				sub.getMajorid(), sub.getId());
	}

	public Subject find(Integer id) {
		String sql = "select`id`, `name`,`classhour`,`majorid` from `subject`where `id`=? ";
		Build<Subject> b = new SubjectMap();
		Subject su = (Subject)db.getQuery(sql, b, id);
		return su;
	}

	public List<Subject> findAll() {
		String sql = "select `id`,`name`,`classhour`,`majorid` from `subject`";
		Build<Subject> b = new SubjectMap();
		return db.getQueryAll(sql, b);

	}

	public Subject build(ResultSet rs) throws SQLException {
		Subject sub = new Subject();
		sub.setId(rs.getInt("id"));
		sub.setName(rs.getString("name"));
		sub.setClasshour(rs.getInt("classhour"));
		sub.setMajorid(rs.getInt("majorid"));
		return sub;
	}
	class SubjectMap implements Build<Subject>{

		@Override
		public Subject build(ResultSet rs) throws SQLException {
			Subject sub = new Subject();
			sub.setId(rs.getInt("id"));
			sub.setName(rs.getString("name"));
			sub.setClasshour(rs.getInt("classhour"));
			sub.setMajorid(rs.getInt("majorid"));
			return sub;
		}
		
	}
}
