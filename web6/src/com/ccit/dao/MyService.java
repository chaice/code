package com.ccit.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import com.ccit.entity.Entity;

public class MyService {
	public String book_Bro(String bookcode, String cardcode) {
		return event("{call pro_bro(?,?,?)}",bookcode, cardcode);
	}

	public String book_Ret(String bookcode, String cardcode) {
		return event("{call pro_re(?,?,?)}",bookcode,cardcode);
	}

	private String event(String sql, String bookcode, String cardcode) {
		String mes = "";
		try {
			Connection con = DriverManager.getConnection(Entity.URL);
			CallableStatement cst = con.prepareCall(sql);
			cst.setString(1, bookcode);
			cst.setString(2, cardcode);
			cst.executeQuery();
			mes = cst.getString(3);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mes;
	}
}
