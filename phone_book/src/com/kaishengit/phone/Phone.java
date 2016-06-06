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
			System.out.println("1.������ϵ��");
			System.out.println("2.�޸���ϵ��");
			System.out.println("3.ɾ����ϵ��");
			System.out.println("4.�鿴ָ����ϵ��");
			System.out.println("5.�鿴ȫ����ϵ��");
			System.out.println("6.�˳�");
			System.out.print("������ѡ�");
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
				System.out.println("�˳��ɹ���");
				break;
			} else {
				System.out.println("��������������������룡");
			}
		}
	}

	private void addUser() {
		boolean flag = false;
		Entity en = new Entity(getStr("������������"), getStr("��������룺"));
		Set<String> s = m.keySet();
		if (s.contains(en.getName())) {
			String y = "Y";
			if (y.equals(getStr("��ϵ���ظ�,�Ƿ񸲸�:Y / N "))) {
				m.put(en.getName(), en);
				flag = true;
			}
		} else {
			m.put(en.getName(), en);
			flag = true;
		}
		if (flag) {
			System.out.println("��ӳɹ���");
		} else {
			System.out.println("���ʧ�ܣ�");
		}
	}

	private void alterUser() {
		boolean flag = false;
		Set<String> s = m.keySet();
		System.out.print("������Ҫ�޸ĵ�������");
		String str = sc.next();
		if (s.contains(str)) {
			m.remove(str);
			Entity en = new Entity(getStr("�������޸ĺ��������"), getStr("�������޸ĺ�ĺ��룺"));
			m.put(en.getName(), en);
			flag = true;

		}
		if (flag) {
			System.out.println("�޸ĳɹ���");
		} else {
			System.out.println("�޸�ʧ�ܣ�");
		}
	}

	private void deleteUser() {
		boolean flag = false;
		Set<String> s = m.keySet();
		System.out.print("������Ҫɾ����������");
		String str = sc.next();
		if (s.contains(str)) {
			m.remove(str);
			flag = true;
		}
		if (flag) {
			System.out.println("ɾ���ɹ���");
		} else {
			System.out.println("ɾ��ʧ�ܣ�");
		}

	}

	private void findUser() {
		Set<String> s = m.keySet();

		System.out.print("������Ҫ���ҵ�������");
		String str = sc.next();
		if (s.contains(str)) {
			System.out.println(m.get(str));
		} else {
			System.out.println("���޴��ˣ�");
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
