package com.ccit.admindao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;


import com.ccit.admin.Student;
import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;
import com.ccit.entity.MyBuild;

public class StudentDAO {
	
	DBHelper<Student> db = new DBHelper<>(Entity.URL);

	public int insert(Student s) {
		String sql = "insert into `student`(`name`,`id_card`,`sex`,`phone`,`address`,`email`,`majorid`)values(?,?,?,?,?,?,?)";
		return db.getUpdate(sql, s.getName(), s.getId_card(), s.getSex(),
				s.getPhone(), s.getAddress(), s.getEmail(), s.getMajorid());
	}
	public int delete(String studentno){
		String sql = "delete from `student`where `studentno`=?";
		return db.getUpdate(sql, studentno);
	}
	public int alter(Student s){
		String sql = "update `student`set`name`=?,`id_card`=?,`sex`=?,`phone`=?,`address`=?,`email`=?,`majorid`=?";
		return db.getUpdate(sql, s.getName(),s.getId_card(), s.getSex(),
				s.getPhone(), s.getAddress(), s.getEmail(), s.getMajorid());
	}

	public Student find(String studentno) {
		String sql = "select `studentno`, `name`,`id_card`,`sex`,`phone`,`address`,`email`,`majorid` from `student`WHERE `studentno`=?";
		Build<Student> b = new MyBuild<>(Student.class);
		Student s =  (Student) db.getQuery(sql, b, studentno);
		return s;
		
	}

	public List<Student> findAll( ) {
		String sql = "select `studentno`, `name`,`id_card`,`sex`,`phone`,`address`,`email`,`majorid` from `student`";
		Build<Student> b = new MyBuild<>(Student.class);
		return db.getQueryAll(sql, b);
		
	}

//	public Student built(ResultSet rs) throws SQLException {
//		Student s = new Student();
//		s.setStudentno(rs.getString("studentno"));
//		s.setName(rs.getString("name"));
//		s.setId_card(rs.getString("id_card"));
//		s.setSex(rs.getBoolean("sex"));
//		s.setPhone(rs.getString("phone"));
//		s.setAddress(rs.getString("address"));
//		s.setEmail(rs.getString("email"));
//		s.setMajorid(rs.getString("majorid"));
//		return s;
//
//	}
//	class StudentMap implements Build<Student>{
//
//		@Override
//		public Student build(ResultSet rs) throws SQLException {
//			Student s = new Student();
//			s.setStudentno(rs.getString("studentno"));
//			s.setName(rs.getString("name"));
//			s.setId_card(rs.getString("id_card"));
//			s.setSex(rs.getBoolean("sex"));
//			s.setPhone(rs.getString("phone"));
//			s.setAddress(rs.getString("address"));
//			s.setEmail(rs.getString("email"));
//			s.setMajorid(rs.getString("majorid"));
//			return s;
//		}
//		
//	}

}
