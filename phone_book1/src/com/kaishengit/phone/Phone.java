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
			System.out.println("====�绰��====");
			System.out.println("1.������ϵ��");
			System.out.println("2.�޸���ϵ��");
			System.out.println("3.ɾ����ϵ��");
			System.out.println("4.�鿴ȫ����ϵ��");
			System.out.println("5.�鿴ָ����ϵ��");
			System.out.println("6.�˳�");
			System.out.println("==============");
			System.out.print("������ѡ�");
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
				System.out.println("�˳��ɹ���");
				break;
			} else {
				System.out.println("�������,���������룡");
			}
		}

	}

	private void addUsers() {
		boolean flag = false;
		System.out.print("��������ϵ�˵�������");
		String name = sc.next();
		System.out.print("��������ϵ�˵ĺ��룺");
		String number = sc.next();
		System.out.print("��������ϵ�˵ĵ�ַ��");
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
			System.out.println("��ӳɹ���");
		} else {
			System.out.println("���ʧ�ܣ�");
		}
	}

	private void alterUser() {
		System.out.print("Ҫ�޸ĵ�����:");
		String in = sc.next();
		boolean flag = false;

		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && in.equals(users[i].getNames())) {
				users[i].setNames(getStr("�޸� ������֣�"));
				users[i].setPhone(getStr("�޸� ��ĺ��룺"));
				users[i].setAdress(getStr("�޸� ��ĵ�ַ��"));
				flag = true;
			}

		}
		if (flag) {
			System.out.println("�޸ĳɹ���");
		} else {
			System.out.println("�޸�ʧ�ܣ�");
		}

	}

	private void deleteUser() {
		System.out.print("����ɾ���˵�������");
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
			System.out.println("ɾ���ɹ���");
		} else {
			System.out.println("ɾ��ʧ�ܣ�");
		}
	}

	private void findAll() {
		System.out.println("����" + "\t" + "����" + "\t" + "��ַ");
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null) {
				System.out.println(users[i].getNames() + "\t" + users[i].getPhone()
						+ "\t" + users[i].getAdress());
			}
		}
	}

	private void find() {
		System.out.print("Ҫ���ҵ�����:");
		String in = sc.next();
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && in.equals(users[i].getNames())) {
				System.out.println("����" + "\t" + "����" + "\t" + "��ַ");
				System.out.println(users[i].getNames() + "\t" + users[i].getPhone()
						+ "\t" + users[i].getAdress());
			}
		}
//		for (Entity user : users) {
//			if (user != null && getStr("���ҵ���ϵ�˵�������").equals(user)) {
//				System.out.println("����" + "\t" + "����" + "\t" + "��ַ");
//				System.out.println(user.getNames() + "\t" + user.getPhone()
//						+ "\t" + user.getAdress());
//				break;
//			} else if (!getStr("���ҵ���ϵ�˵�������").equals(user)) {
//				System.out.println("û������ˣ�");
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
			System.out.println("����" + "\t" + "����" + "\t" + "��ַ");
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
