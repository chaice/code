package com.ccit.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TsetSql {
	public static void main(String[] args) {
//		String str = "com.mysql.jdbc.Driver";//ע��jdbc����
//		try {
//			Class.forName(str);
//			System.out.println("ע��ɹ���");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://127.0.0.1:3306/cc?user=root&password=911215";
		System.out.print("�������û�����");
		String name = sc.next();
		System.out.print("���������룺");
		String password = sc.next();
		try {
			Connection coo = DriverManager.getConnection(url);
			Statement sta = coo.createStatement();
			String sql = "insert into `admin`(`name`,`pwd`)values('"+name+"','"+password+"')";
			int result = sta.executeUpdate(sql);
			if(result == 1){
				System.out.println("ע��ɹ���");
			}else
				System.out.println("ע��ʧ�ܣ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
