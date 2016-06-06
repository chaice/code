package com.ccit.test;

import java.util.List;

import com.ccit.admin.Subject;
import com.ccit.admindao.SubjectDAO;

public class TsetSub {
	public static void main(String[] args) {
		SubjectDAO sud = new SubjectDAO();
		System.out.println(sud.find(13));
		System.out.println("eeeeee");
		List<Subject> list = sud.findAll();
		for (Subject subject : list) {
			System.out.println(subject);
		}
	}

}
