package com.ccit.test;

import java.util.List;

import com.ccit.admin.Result;
import com.ccit.admindao.ResultDao;

public class TsetRes {
	public static void main(String[] args) {
		ResultDao rd = new ResultDao();
		System.out.println(rd.find(5));
		List<Result> list = rd.findAll();
		for (Result result : list) {
			System.out.println(result);
		}
		
	}

}
