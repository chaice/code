package com.kaishengit.phone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.kaishengit.entity.Entity;

public class Phone {
	Scanner sc = new Scanner(System.in);
	Map<String, Entity> m = new HashMap<>();
	File file = new File("Data");

	public void start() {

		read();
		while (true) {
			System.out.println("===PhoneBook===");
			System.out.println("1.增加联系人");
			System.out.println("2.修改联系人");
			System.out.println("3.删除联系人");
			System.out.println("4.查看指定联系人");
			System.out.println("5.查看全部联系人");
			System.out.println("6.退出");
			System.out.print("请输入选项：");
			int in = sc.nextInt();
			if (in == 1) {
				addUser();
			} else if (in == 2) {
				alterUser();
			} else if (in == 3) {
				deleteUser();
			} else if (in == 4) {
				findUser();
			} else if (in == 5) {
				findAll();
			} else if (in == 6) {
				writer();
				System.out.println("退出成功！");
				break;
			} else {
				System.out.println("你输入的有误，请重新输入！");
			}
		}
	}

	private void addUser() {
		boolean flag = false;
		Entity en = new Entity(getStr("请输入姓名："), getStr("请输入号码："));
		Set<String> s = m.keySet();
		if (s.contains(en.getName())) {
			String y = "Y";
			if (y.equals(getStr("联系人重复,是否覆盖:Y / N "))) {
				m.put(en.getName(), en);
				flag = true;
			}
		} else {
			m.put(en.getName(), en);
			flag = true;
		}
		if (flag) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！");
		}
	}

	private void alterUser() {
		boolean flag = false;
		Set<String> s = m.keySet();
		System.out.print("请输入要修改的姓名：");
		String str = sc.next();
		if (s.contains(str)) {
			m.remove(str);
			Entity en = new Entity(getStr("请输入修改后的姓名："), getStr("请输入修改后的号码："));
			m.put(en.getName(), en);
			flag = true;

		}
		if (flag) {
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败！");
		}
	}

	private void deleteUser() {
		boolean flag = false;
		Set<String> s = m.keySet();
		System.out.print("请输入要删除的姓名：");
		String str = sc.next();
		if (s.contains(str)) {
			m.remove(str);
			flag = true;
		}
		if (flag) {
			System.out.println("删除成功！");
		} else {
			System.out.println("删除失败！");
		}

	}

	private void findUser() {
		Set<String> s = m.keySet();

		System.out.print("请输入要查找的姓名：");
		String str = sc.next();
		if (s.contains(str)) {
			System.out.println(m.get(str));
		} else {
			System.out.println("查无此人！");
		}

	}

	private void findAll() {
		Set<Entry<String, Entity>> s = m.entrySet();
		for (Entry<String, Entity> entry : s) {
			String str = "" + entry.getValue();
			System.out.println(str);
		}
	}

	private void read() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
				m = (HashMap<String, Entity>) ois.readObject();
			
			for (String str : m.keySet()) {
				System.out.println(m.get(str));
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writer() {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getStr(String in) {
		System.out.print(in);
		return sc.next();
	}

}
