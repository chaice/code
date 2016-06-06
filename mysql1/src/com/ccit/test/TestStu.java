package com.ccit.test;

import java.util.List;

import com.ccit.admin.Student;
import com.ccit.admindao.StudentDAO;

public class TestStu {
	public static void main(String[] args) {
		StudentDAO sd = new StudentDAO();
		// List<Student> list = sd.findAll();
		// for (Student student : list) {
		// System.out.println(student);
		// }
		Student s = sd.find("200801056");
		System.out.println(s);
		List<Student> list = sd.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
