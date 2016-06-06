package com.ccit.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*jdbc��java���ݿ����Ӽ����ļ�ƣ��ṩ���Ӹ��ֳ������ݿ��������
 *��ʹ��jdbc����֮ǰҪ��ע��������
 *String str = jdbc�����ľ��Ե�ַ Class.forName(str).
 *String url = "jdbc:mysql://ip:port/���ݿ���?����1=ֵ1&����2=ֵ2...."�����в����пո�,����Ϊ���ݿ���û��������룬
 *�û�������Ϊuser=.. ����Ϊpassword=....
 *��java�����ݿ�����������Connection coo = DriverManager.getConnection(url)
 *Statement sta = coo.createStatement();����һ��statement�����sql��䷢�͵����ݿ�
 *int result = sta.executeUpdate(String sql);ִ�и�����sql��䣬�Ա������(insert)ɾ(delete)��(update)�Ĳ���,
 *����ʲô���������ķ���int���͵�0���в����ķ���1�����ص�����Ӱ�������
 *ResultSet rs = sta.execute.Query(String sql);ִ�и�����sql��䣬���ص���ResultSet����
 *rs.next();�����ӵ�ǰ��һ����һ�У����ؽ��Ϊboolean��
 *�ر�����һ��Ҫע�⣡����
 *
*/
public class Test {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������û�����");
		String  name = sc.next();
		System.out.print("���������룺");
		String password = sc.next();
		String url = "jdbc:mysql://127.0.0.1:3306/cc";
		Connection coo = null;
		PreparedStatement sta = null;
		ResultSet rs = null;
		try {
			coo = DriverManager.getConnection(url,"root","911215");
			String sql1 = "select * from `admin` where `name` = ? and `pwd`=?";
			sta = coo.prepareStatement(sql1);//����һ��statement�����sql��䷢�͵����ݿ�
			sta.setString(1, name);
			sta.setString(2, password);
			rs = sta.executeQuery();
			if(rs.next()){
				System.out.println("123");
			}else{
				System.out.println("321");
			}
			
//			while(rs.next()){
//				System.out.println("��½�ɹ���");
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String sql = "insert into `admin`(`name`,`pwd`) values ('"+name+"','"+password+"')";
//		int result = sta.executeUpdate(sql);
//		if(result == 1){
//			System.out.println("�ɹ�~");
//		}else{
//			System.out.println("ʧ��~");
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
