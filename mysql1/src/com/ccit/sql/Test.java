package com.ccit.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*jdbc是java数据库连接技术的简称，提供连接各种常见数据库的能力。
 *在使用jdbc驱动之前要先注册驱动。
 *String str = jdbc驱动的绝对地址 Class.forName(str).
 *String url = "jdbc:mysql://ip:port/数据库名?参数1=值1&参数2=值2...."参数中不能有空格,参数为数据库的用户名和密码，
 *用户名必须为user=.. 密码为password=....
 *把java与数据库连接起来，Connection coo = DriverManager.getConnection(url)
 *Statement sta = coo.createStatement();创造一个statement对象把sql语句发送到数据库
 *int result = sta.executeUpdate(String sql);执行给定的sql语句，对表进行增(insert)删(delete)改(update)的操作,
 *对于什么都不操作的返回int类型的0，有操作的返回1。返回的是受影响的行数
 *ResultSet rs = sta.execute.Query(String sql);执行给定的sql语句，返回单个ResultSet对象。
 *rs.next();将光标从当前行一到下一行，返回结果为boolean型
 *关闭连接一定要注意！！！
 *
*/
public class Test {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String  name = sc.next();
		System.out.print("请输入密码：");
		String password = sc.next();
		String url = "jdbc:mysql://127.0.0.1:3306/cc";
		Connection coo = null;
		PreparedStatement sta = null;
		ResultSet rs = null;
		try {
			coo = DriverManager.getConnection(url,"root","911215");
			String sql1 = "select * from `admin` where `name` = ? and `pwd`=?";
			sta = coo.prepareStatement(sql1);//创造一个statement对象把sql语句发送到数据库
			sta.setString(1, name);
			sta.setString(2, password);
			rs = sta.executeQuery();
			if(rs.next()){
				System.out.println("123");
			}else{
				System.out.println("321");
			}
			
//			while(rs.next()){
//				System.out.println("登陆成功！");
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String sql = "insert into `admin`(`name`,`pwd`) values ('"+name+"','"+password+"')";
//		int result = sta.executeUpdate(sql);
//		if(result == 1){
//			System.out.println("成功~");
//		}else{
//			System.out.println("失败~");
//		}
		try {
			coo.close();
			sta.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
