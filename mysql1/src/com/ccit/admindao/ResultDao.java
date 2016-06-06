package com.ccit.admindao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.ccit.admin.Result;
import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;


public class ResultDao {
	DBHelper db = new DBHelper(Entity.URL);

	public int insert(Result res) {
		String sql = "insert into `result`(`studentno`,`subjectid`,`score`,`examdate`)values(?,?,?,?)";
		return db.getUpdate(sql, res.getStudentno(), res.getSubjectid(),
				res.getScore(), res.getExamdate());
	}

	public int delete(Integer id) {
		String sql = "delete from `subject` where `id`=?";
		return db.getUpdate(sql, id);
	}

	public int alter(Result r) {
		String sql = "update `subject`set `studentno`=?,`subjectid` =?,`score`=?,`examdate`=? where `id`=?";
		return db.getUpdate(sql, r.getStudentno(), r.getSubjectid(),
				r.getScore(), r.getExamdate(), r.getId());
	}
	public Result find(Integer id){
		String sql = "select `id`,`studentno`,`subjectid`,`score`,`examdate` from `result`where `id`=? ";
		Build<Result> b = new ResultMap();
		Result r = (Result)db.getQuery(sql, b, id);
		return r;
	}
	public List<Result> findAll(){
		String sql = "select `id`,`studentno`,`subjectid`,`score`,`examdate` from `result`";
		Build<Result> b = new ResultMap();
		return db.getQueryAll(sql, b);
	}
	public Result build(ResultSet rs) throws SQLException{
		Result r = new Result();
		r.setId(rs.getInt("id"));
		r.setStudentno(rs.getString("studentno"));
		r.setSubjectid(rs.getInt("subjectid"));
		r.setScore(rs.getFloat("score"));
		r.setExamdate(rs.getTimestamp("examdate"));
		return r;
		
	}
	class ResultMap implements Build<Result>{

		@Override
		public Result build(ResultSet rs) throws SQLException {
			Result r = new Result();
			r.setId(rs.getInt("id"));
			r.setStudentno(rs.getString("studentno"));
			r.setSubjectid(rs.getInt("subjectid"));
			r.setScore(rs.getFloat("score"));
			r.setExamdate(rs.getTimestamp("examdate"));
			return r;
		} 
		
	}

}
