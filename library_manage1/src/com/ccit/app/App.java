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
		// ����Ա��½
		login();
		while (true) {
			System.out.println("��ӭ��½ͼ��ݹ���ϵͳ��");
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.�������");
			System.out.println("4.�޸��鼮");
			System.out.println("5.ɾ���鼮");
			System.out.println("6.�鿴�����鼮");
			System.out.println("7.�鿴ָ���鼮");
			System.out.println("8.�½�ͼ��֤");
			System.out.println("9.�˳���");
			System.out.print("��ѡ��");
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
				System.out.println("�˳��ɹ���");
				break;
			} else {
				System.out.println("�����������������룡");

			}

		}
	}

	private void login() {
		String name = getStr("�������û�����");
		String pwd = getStr("���������룺");
		if (ad.find(name, pwd)) {
			System.out.println("��½�ɹ���");
		} else {
			login();
		}

	}
//1����
	private void borrow() {
		String bCode = getStr("�������鼮��ţ�");
		if (bo.findOne(bCode) == null && bo.findOne(bCode).getCount() <= 0) {
			System.out.println("û���Ȿ�飡");
			return;
		}
		String cCode = getStr("�����뿨�ţ�");
		Card c = cd.find(cCode);
		if (c == null) {
			System.out.println("û������ˣ�");
			return;
		}
		Borrow b1 = new Borrow();
		b1.setBid(bo.findOne(bCode).getId());
		b1.setCid(c.getId());
		if (bd.add(b1)) {
			bo.findOne(bCode).setCount(bo.findOne(bCode).getCount() - 1);
			bo.save(bo.findOne(bCode));
			System.out.println("���ĳɹ���");
		} else {
			System.out.println("����ʧ�ܣ�");
		}

	}
//2����
	private void reBook() {
		String cCode = getStr("�����뿨�ţ�");
		List<Book> list = bo.findAllBycode(cCode);
		for (Book book : list) {
			System.out.println(book);
		}
		String bCode = getStr("�������鼮��ţ�");
		Book b = bo.findOne(bCode);
		Card c = cd.find(cCode);
		Borrow bor = new Borrow();
		bor.setBid(b.getId());
		bor.setCid(c.getId());
		Date now = new Date();
		Borrow bor1 = bd.find(bor);
		long day = (now.getTime() - bor1.getTime().getTime())/1000/60/60/24 + 1;
		System.out.println("����ʱ��Ϊ��"+day);
		if(bd.delete(bor1)){
			b.setCount(b.getCount()+1);
			bo.save(b);
			System.out.println("����ɹ���");
		}else{
			System.out.println("����ʧ�ܣ�");
		}

	}
    //�������
	private void add() {
		Book b = new Book();
		b.setCode(getStr("��������ı�ţ�"));
		b.setTitle(getStr("������������"));
		b.setPublishing(getStr("����������磺"));
		b.setAuthor(getStr("���������ߣ�"));
		b.setTotal(getInt("������������"));
		b.setCount(getInt("������������"));
		if (bo.addBook(b)) {
			System.out.println("��ӳɹ���");
		} else {
			System.out.println("���ʧ�ܣ�");
		}

	}
    //�޸�
	private void alter() {
		Book b = new Book();
		b.setTitle(getStr("������������"));
		b.setCode(getStr("�������޸ĺ�ı�ţ�"));
		b.setPublishing(getStr("����������磺"));
		b.setAuthor(getStr("���������ߣ�"));
		b.setTotal(getInt("������������"));
		b.setCount(getInt("������������"));
		if (bo.alterBook(b)) {
			System.out.println("�޸ĳɹ���");
		} else {
			System.out.println("�޸�ʧ�ܣ�");
		}

	}
    //ɾ��
	private void delete() {
		String title = getStr("������������");
		if (bo.deleteBook(title)) {
			System.out.println("ɾ���ɹ���");
		} else {
			System.out.println("ɾ��ʧ�ܣ�");
		}
	}
   //�鿴ȫ������
	private void findAll() {
		List<Book> list = bo.findAll();
		for (Book book : list) {
			System.out.println(book);
		}
	}
    //
	private void find() {
		String str = getStr("������ؼ��֣�");
		List<Book> list = bo.findBooks(str);
		for (Book book : list) {
			System.out.println(book);
		}

	}
    //���ͼ�鿨
	private void addCard() {
		Card c = new Card();
		c.setCode(getStr("�����뿨�ţ�"));
		c.setName(getStr("������������"));
		c.setTel(getStr("������绰���룺"));
		if (cd.add(c)) {
			System.out.println("��ӳɹ���");
		} else {
			System.out.println("���ʧ�ܣ�");
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
			System.out.print(sc.next() + "�������֣����������룡");
			return getInt(mes);
		}
	}
}
