package com.ccit.phone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import java.util.Scanner;
import java.util.Set;

public class Phone {
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Entity> m = new HashMap<String, Entity>();
	private File file = new File("e:/data");

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
			if (getStr("�����Ѵ��ڣ��Ƿ񸲸ǣ�Y/N").equals("Y")) {
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
		System.out.print("������Ҫ�޸ĵ�������");
		String name = sc.next();
		Set<String> s = m.keySet();
		if (s.contains(name)) {
			m.remove(name);
			Entity en = new Entity(getStr("������������"), getStr("��������룺"));
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
		System.out.print("������Ҫɾ����������");
		String name = sc.next();
		Set<String> s = m.keySet();
		if (s.contains(name)) {
			m.remove(name);
			flag = true;
		}
		if (flag) {
			System.out.println("ɾ���ɹ���");
		} else {
			System.out.println("ɾ��ʧ�ܣ�");
		}

	}

	private void findUser() {
		System.out.println("������Ҫ���ҵ�������");
		String name = sc.next();
		Set<String> s = m.keySet();
		if(s.contains(name)){
			System.out.println(m.get(name));
		}

	}

	private void findAll() {
	  for (String str : m.keySet()) {
		System.out.println(m.get(str));
	}
	}

	private void writer() {
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@SuppressWarnings("unchecked")
	private void read(){
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			m = (HashMap<String, Entity>)ois.readObject();
			 for (String str : m.keySet()) {
					System.out.println(m.get(str));
				}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getStr(String in) {
		System.out.print(in);
		return sc.next();
	}

}
