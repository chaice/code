package com.ccit.admin;

import java.sql.Timestamp;



public class Result {
	private Integer id;
	private String studentno;
	private Integer subjectid;
	private Float score;
	private  Timestamp  examdate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentno() {
		return studentno;
	}
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}
	public Integer getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	public Timestamp getExamdate() {
		return examdate;
	}
	public void setExamdate(Timestamp examdate) {
		this.examdate = examdate;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", studentno=" + studentno + ", subjectid="
				+ subjectid + ", score=" + score + ", examdate=" + examdate
				+ "]";
	}
	

}
