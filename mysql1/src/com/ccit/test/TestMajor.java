package com.ccit.test;

import java.util.List;

import com.ccit.admin.Major;
import com.ccit.admindao.MajorDao;

public class TestMajor {
	public static void main(String[] args) {
		MajorDao md = new MajorDao();
		Major ma = md.find(7);
		System.out.println(ma);
		List<Major> list = md.findAll();
		for (Major major: list) {
			System.out.println(major);
		}
		
	}

}
