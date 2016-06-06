package com.ccit.app;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.ccit.dao.AdminDAO;
import com.ccit.dao.AdminDAO;
import com.ccit.dao.BookDAO;
import com.ccit.dao.BorrowDAO;
import com.ccit.dao.CardDAO;
import com.ccit.sta.Book;
import com.ccit.sta.Borrow;
import com.ccit.sta.Card;

public class App {
	Scanner sc = new Scanner(System.in);
	AdminDAO ad = new AdminDAO();
	BookDAO bo = new BookDAO();
	BorrowDAO bd = new BorrowDAO();
	CardDAO cd = new CardDAO();

	public void start() {
		// 管理员登陆
		login();
		while (true) {
			System.out.println("欢迎登陆图书馆管理系统！");
			System.out.println("1.借书");
			System.out.println("2.还书");
			System.out.println("3.添加新书");
			System.out.println("4.修改书籍");
			System.out.println("5.删除书籍");
			System.out.println("6.查看所有书籍");
			System.out.println("7.查看指定书籍");
			System.out.println("8.新建图书证");
			System.out.println("9.退出！");
			System.out.print("请选择：");
			int i = sc.nextInt();
			if (i == 1) {
				borrow();
			} else if (i == 2) {
				reBook();
			} else if (i == 3) {
				add();
			} else if (i == 4) {
				alter();
			} else if (i == 5) {
				delete();
			} else if (i == 6) {
				findAll();
			} else if (i == 7) {
				find();
			} else if (i == 8) {
				addCard();
			} else if (i == 9) {
				System.out.println("退出成功！");
				break;
			} else {
				System.out.println("输入有误，请重新输入！");

			}

		}
	}

	private void login() {
		String name = getStr("请输入用户名：");
		String pwd = getStr("请输入密码：");
		if (ad.find(name, pwd)) {
			System.out.println("登陆成功！");
		} else {
			login();
		}

	}
//1借书
	private void borrow() {
		String bCode = getStr("请输入书籍编号：");
		if (bo.findOne(bCode) == null && bo.findOne(bCode).getCount() <= 0) {
			System.out.println("没有这本书！");
			return;
		}
		String cCode = getStr("请输入卡号：");
		Card c = cd.find(cCode);
		if (c == null) {
			System.out.println("没有这个人！");
			return;
		}
		Borrow b1 = new Borrow();
		b1.setBid(bo.findOne(bCode).getId());
		b1.setCid(c.getId());
		if (bd.add(b1)) {
			bo.findOne(bCode).setCount(bo.findOne(bCode).getCount() - 1);
			bo.save(bo.findOne(bCode));
			System.out.println("借阅成功！");
		} else {
			System.out.println("借阅失败！");
		}

	}
//2还书
	private void reBook() {
		String cCode = getStr("请输入卡号：");
		List<Book> list = bo.findAllBycode(cCode);
		for (Book book : list) {
			System.out.println(book);
		}
		String bCode = getStr("请输入书籍编号：");
		Book b = bo.findOne(bCode);
		Card c = cd.find(cCode);
		Borrow bor = new Borrow();
		bor.setBid(b.getId());
		bor.setCid(c.getId());
		Date now = new Date();
		Borrow bor1 = bd.find(bor);
		long day = (now.getTime() - bor1.getTime().getTime())/1000/60/60/24 + 1;
		System.out.println("借阅时间为："+day);
		if(bd.delete(bor1)){
			b.setCount(b.getCount()+1);
			bo.save(b);
			System.out.println("还书成功！");
		}else{
			System.out.println("还书失败！");
		}

	}
    //添加新书
	private void add() {
		Book b = new Book();
		b.setCode(getStr("请输入书的编号："));
		b.setTitle(getStr("请输入书名："));
		b.setPublishing(getStr("请输入出版社："));
		b.setAuthor(getStr("请输入作者："));
		b.setTotal(getInt("请输入数量："));
		b.setCount(getInt("请输入总数："));
		if (bo.addBook(b)) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！");
		}

	}
    //修改
	private void alter() {
		Book b = new Book();
		b.setTitle(getStr("请输入书名："));
		b.setCode(getStr("请输入修改后的编号："));
		b.setPublishing(getStr("请输入出版社："));
		b.setAuthor(getStr("请输入作者："));
		b.setTotal(getInt("请输入数量："));
		b.setCount(getInt("请输入总数："));
		if (bo.alterBook(b)) {
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败！");
		}

	}
    //删除
	private void delete() {
		String title = getStr("请输入书名：");
		if (bo.deleteBook(title)) {
			System.out.println("删除成功！");
		} else {
			System.out.println("删除失败！");
		}
	}
   //查看全部的书
	private void findAll() {
		List<Book> list = bo.findAll();
		for (Book book : list) {
			System.out.println(book);
		}
	}
    //
	private void find() {
		String str = getStr("请输入关键字：");
		List<Book> list = bo.findBooks(str);
		for (Book book : list) {
			System.out.println(book);
		}

	}
    //添加图书卡
	private void addCard() {
		Card c = new Card();
		c.setCode(getStr("请输入卡号："));
		c.setName(getStr("请输入姓名："));
		c.setTel(getStr("请输入电话号码："));
		if (cd.add(c)) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！");
		}

	}

	private String getStr(String in) {
		System.out.print(in);
		return sc.next();
	}

	private int getInt(String mes) {
		System.out.print(mes);
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			System.out.print(sc.next() + "不是数字，请重新输入！");
			return getInt(mes);
		}
	}
}
