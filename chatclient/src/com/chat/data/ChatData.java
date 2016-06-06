package com.chat.data;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class ChatData {
	private String name ;
	private BufferedReader br ;
	private PrintWriter pw ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BufferedReader getBr() {
		return br;
	}
	public void setBr(BufferedReader br) {
		this.br = br;
	}
	public PrintWriter getPw() {
		return pw;
	}
	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}
}
