package com.ccit.sql;

import java.util.Scanner;

import com.ccit.entity.DBHelper;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://127.0.0.1:3306/cc?user=root&password=911215";
		DBHelper db = new DBHelper(url);
		System.out.print("�������û�����");
		String name = sc.next();
		System.out.print("���������룺");
		String password = sc.next();
		String sql = "delete from `admin`where `name`=?and`pwd=?`";
		int i = db.getUpdate(sql, name, password);

		if (i == 1) {
			System.out.println("�ɹ�");
		} else {
			System.out.println("ʧ��");
		}
		sc.close();

	}

}
