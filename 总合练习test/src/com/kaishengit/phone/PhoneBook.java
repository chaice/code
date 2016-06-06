package com.kaishengit.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.kaishengit.entity.Contact;

public class PhoneBook {
	private Scanner sc = new Scanner(System.in);
	private Contact[] users = new Contact[50];

	public void start() {
		read();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=====�绰��=====");
			System.out.println(" 1.������ϵ��");
			System.out.println(" 2.�޸���ϵ��");
			System.out.println(" 3.ɾ����ϵ��");
			System.out.println(" 4.�鿴������ϵ��");
			System.out.println(" 5.��ѯָ����ϵ��");
			System.out.println(" 6.�˳�");
			System.out.println("==============");
			System.out.print("��ѡ��");
			String input = sc.next();
			if (input.equals("1")) {
				// ������ϵ��
				addUser();
			} else if (input.equals("2")) {
				// �޸���ϵ��
				updateUser();
			} else if (input.equals("3")) {
				// ɾ����ϵ��
				deleteUser();
			} else if (input.equals("4")) {
				// �鿴����
				showAll();
			} else if (input.equals("5")) {
				// ������ϵ��
				find();
			} else if (input.equals("6")) {
				save();
				System.out.println("���˳��ɹ�����");
				break;
			} else {
				System.out.println("��ѡ���������ѡ����");
			}
		}

		sc.close();

	}

	// ������ϵ��
	private void addUser() {
		// System.out.print("������������");
		// String name = sc.next();
		// System.out.print("��������룺");
		// String phone = sc.next();
		// System.out.print("�������Ա�");
		// String sex = sc.next();
		// System.out.print("���������գ�");
		// String bir = sc.next();

		// Contact con = new Contact();
		// con.setName(name);
		// con.setPhone(phone);
		// con.setSex(sex);
		// con.setBirthday(bir);

		Contact con = new Contact(getStr("������������"), getStr("��������룺"), getStr("�������Ա�"), getStr("���������գ�"));

		boolean flag = false;
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				users[i] = con;
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("����ӳɹ�����");
		} else {
			System.out.println("�����ʧ�ܣ���");
		}
	}

	// �޸���ϵ��
	private void updateUser() {
		String name = getStr("������Ҫ�޸ĵ�������");

		boolean flag = false;
		for (Contact con : users) {
			if (con != null && name.equals(con.getName())) {
				// con.setName(getStr("�޸�����Ϊ��"));
				con.setPhone(getStr("�޸ĵ绰Ϊ��"));
				con.setSex(getStr("�޸��Ա�Ϊ��"));
				con.setBirthday(getStr("�޸�����Ϊ��"));
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("���޸ĳɹ�����");
		} else {
			System.out.println("���޸�ʧ�ܣ���");
		}

	}

	// ɾ����ϵ��
	private void deleteUser() {
		String name = getStr("������Ҫɾ����������");

		boolean flag = false;
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && name.equals(users[i].getName())) {
				users[i] = null;
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("��ɾ���ɹ�����");
		} else {
			System.out.println("��ɾ��ʧ�ܣ���");
		}
	}

	// �鿴����
	private void showAll() {
		System.out.println("���� \t�绰 \t\t�Ա�\t����");
		for (Contact con : users) {
			if (con != null) {
				show(con);
			}
		}
	}

	// ������ϵ��
	private void find() {

		String str = getStr("����������");
		System.out.println("���� \t�绰 \t\t�Ա�\t����");

		for (Contact con : users) {
			if (con != null && (con.getName().contains(str) || con.getPhone().contains(str))) {
				show(con);
			}
		}

	}

	private String getStr(String msg) {
		System.out.print(msg);
		return sc.next();
	}

	private void show(Contact con) {

		System.out.print(con.getName());
		System.out.print("\t");
		System.out.print(con.getPhone());
		System.out.print("\t");
		System.out.print(con.getSex());
		System.out.print("\t");
		System.out.print(con.getBirthday());
		System.out.println();

	}

	final String FGF = ",";
	
	File file = new File("D:/phonebook.data");

	private void save() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (Contact con : users) {
				if (con != null) {
					String str = con.getName() + FGF + con.getPhone() + FGF + con.getSex() + FGF + con.getBirthday();
					bw.write(str);
					bw.newLine();
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void read() {
		
		
		try {
			file.createNewFile();
			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			String str = br.readLine();
			while (str != null) {
				String[] strs = str.split(FGF);
				if (strs.length == 4) {
					Contact con = new Contact(strs[0], strs[1], strs[2], strs[3]);
					for (int i = 0; i < users.length; i++) {
						if (users[i] == null) {
							users[i] = con;
							break;
						}
					}
				}
				
				str = br.readLine();
			}

			br.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
