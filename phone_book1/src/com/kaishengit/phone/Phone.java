package com.kaishengit.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.kaishengit.entity.Entity;

public class Phone {
	Scanner sc = new Scanner(System.in);
	Entity[] users = new Entity[20];
	
	File file = new File("data");

	public void start() {
		read();
		while (true) {
			System.out.println("====电话本====");
			System.out.println("1.新增联系人");
			System.out.println("2.修改联系人");
			System.out.println("3.删除联系人");
			System.out.println("4.查看全部联系人");
			System.out.println("5.查看指定联系人");
			System.out.println("6.退出");
			System.out.println("==============");
			System.out.print("请输入选项：");
			int in = sc.nextInt();
			if (in == 1) {
				addUsers();

			} else if (in == 2) {
				alterUser();

			} else if (in == 3) {
				deleteUser();

			} else if (in == 4) {
				findAll();
			} else if (in == 5) {
				find();
			} else if (in == 6) {
				writer();
				System.out.println("退出成功！");
				break;
			} else {
				System.out.println("输入错误,请重新输入！");
			}
		}

	}

	private void addUsers() {
		boolean flag = false;
		System.out.print("请输入联系人的姓名：");
		String name = sc.next();
		System.out.print("请输入联系人的号码：");
		String number = sc.next();
		System.out.print("请输入联系人的地址：");
		String adress = sc.next();
		Entity en = new Entity();
		en.setNames(name);
		en.setPhone(number);
		en.setAdress(adress);
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				users[i] = en;
				flag = true;
				break;
			}

		}
		if (flag) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！");
		}
	}

	private void alterUser() {
		System.out.print("要修改的姓名:");
		String in = sc.next();
		boolean flag = false;

		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && in.equals(users[i].getNames())) {
				users[i].setNames(getStr("修改 后的名字："));
				users[i].setPhone(getStr("修改 后的号码："));
				users[i].setAdress(getStr("修改 后的地址："));
				flag = true;
			}

		}
		if (flag) {
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败！");
		}

	}

	private void deleteUser() {
		System.out.print("输入删除人的姓名：");
		String in = sc.next();
		boolean flag = false;
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && in.equals(users[i].getNames())){
				users[i] = null;
			    flag = true;
			    break;
			}
		}
		if (flag) {
			System.out.println("删除成功！");
		} else {
			System.out.println("删除失败！");
		}
	}

	private void findAll() {
		System.out.println("姓名" + "\t" + "号码" + "\t" + "地址");
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null) {
				System.out.println(users[i].getNames() + "\t" + users[i].getPhone()
						+ "\t" + users[i].getAdress());
			}
		}
	}

	private void find() {
		System.out.print("要查找的姓名:");
		String in = sc.next();
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && in.equals(users[i].getNames())) {
				System.out.println("姓名" + "\t" + "号码" + "\t" + "地址");
				System.out.println(users[i].getNames() + "\t" + users[i].getPhone()
						+ "\t" + users[i].getAdress());
			}
		}
//		for (Entity user : users) {
//			if (user != null && getStr("查找的联系人的姓名：").equals(user)) {
//				System.out.println("姓名" + "\t" + "号码" + "\t" + "地址");
//				System.out.println(user.getNames() + "\t" + user.getPhone()
//						+ "\t" + user.getAdress());
//				break;
//			} else if (!getStr("查找的联系人的姓名：").equals(user)) {
//				System.out.println("没有这个人！");
//				break;
//			}
//		}
	}

	private void read() {
		try {
			// file.createNewFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			System.out.println("姓名" + "\t" + "号码" + "\t" + "地址");
			while (str != null) {
				String[] s = str.split("\t");
				System.out.println(s[0] + "\t" + s[1] + "\t" + s[2]);
				// System.out.println(s[2]);
				str = br.readLine();
			}

			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	private void writer() {
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < users.length; i++) {
				if (users[i] != null) {
					String str = users[i].getNames() + "\t"
							+ users[i].getPhone() + "\t" + users[i].getAdress();
					bw.write(str);
					bw.newLine();
				}
			}

			bw.flush();
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private String getStr(String in) {
		System.out.print(in);
		return sc.next();
	}
}
