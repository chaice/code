package com.ccit.test;


import java.sql.SQLException;
import java.util.List;

import com.ccit.admin.Admin;
import com.ccit.admindao.AdminDAO;



public class TestAdmin {
	public static void main(String[] args) throws SQLException {
		AdminDAO add = new AdminDAO();
//		Admin ad = new Admin(18,"laa", "123");
//		int i = add.alter(ad);
		//int i = add.insert(ad);
		//int i = add.remove(ad);
//		ad = add.find(19);
//		System.out.println(ad);
		List<Admin> list = add.findAll();
		for (Admin admin : list) {
			System.out.println(admin);
		}
        
//		
//		if(i == 1){
//			System.out.println("³É¹¦");
//		}else{
//			System.out.println("Ê§°Ü");
//		}
	
	}

}
