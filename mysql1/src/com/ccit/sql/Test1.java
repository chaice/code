package com.ccit.sql;

import java.util.Scanner;

import com.ccit.entity.DBHelper;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://127.0.0.1:3306/cc?user=root&password=911215";
		DBHelper db = new DBHelper(url);
		System.out.print("请输入用户名：");
		String name = sc.next();
		System.out.print("请输入密码：");
		String password = sc.next();
		String sql = "delete from `admin`where `name`=?and`pwd=?`";
		int i = db.getUpdate(sql, name, password);

		if (i == 1) {
			System.out.println("成功");
		} else {
			System.out.println("失败");
		}
		sc.close();

	}

}
