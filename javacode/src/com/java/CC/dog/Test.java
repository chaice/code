package com.java.CC.dog;

/*������ʽ����Ԫ�ַ���
 * \w ƥ�������һ����ĸ�����֡����֡��»���
 * \d ƥ�����������
 * . ƥ������з�������κ��ַ�
 * \s ƥ������Ŀհ׷�
 * ������ʽ�����޶�����
 * * �ظ���λ���
 * + �ظ�һ�λ���
 * ? �ظ���λ�һ��
 * {n} �ظ�n��
 * {n,} �ظ�n�λ�����
 * {n,m} �ظ�n��m��
 * ������ʽ���÷����
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		//
		// String str = " a,b,c,d,e,f";
		// System.out.println(str.contains("a"));// ��֤str���Ƿ������ĸa
		// System.out.println("strΪ��" + str);
		// System.out.println("strΪ��" + str.trim());// trimȥ���ַ���ǰ��Ŀո�
		// int index = str.indexOf("d");
		// System.out.println(index);
		// int endIndex = str.lastIndexOf("d");
		// System.out.println(endIndex);
		// System.out.println(str.substring(1, endIndex));
		// System.out.println(str.substring(1, index));
		// System.out.println(str.toUpperCase());
		//
		// String str1 = str.replace(",", "\n");
		// System.out.println(str1);
		String email = "outdu@qq.com";// ��֤�����Ƿ�Ϸ�
		String regex = "[a-zA-z]\\w*@\\w+(\\.\\w+)+";

		System.out.println(email.matches(regex));
		boolean b = email.matches(regex);

		if (b == false) {
			System.out.println("���䲻�Ϸ�!");
		}
		long start = System.currentTimeMillis();
		System.out.println("startTime:" + start);
		String str = " ";
		for (int i = 1; i < 2222; i++) {
			str += (i + "i");
		}
		System.out.println(str);
		long end = System.currentTimeMillis();
		System.out.println("endTime:" + end);
		StringBuffer sb = new StringBuffer();// StringBuffer��ʹ��
		long start1 = System.currentTimeMillis();
		System.out.println("start1Time:" + start1);
		for (int i = 1; i < 2222; i++) {
			sb.append(i + "i");
		}
		System.out.println(sb.toString());// sb.toString ��ȡStringBuffer�ڵ�ֵ
		long end1 = System.currentTimeMillis();
		System.out.println("end1Time:" + end1);

		// StringBuffer sb = new StringBuffer();
		// System.out.println(sb.append("123"));
		// String str = "����,178,18";
		// int l = str.length();
		// System.out.println(l);
		// System.out.println(str.equals("erfasusdu"));//�Ƚ��ַ���str.equalsIgnoreCase()�����ִ�Сд
		// String[] infor = str.split(",");//���ַ�����ֳ�����
		// for(int i = 0;i<infor.length;i++){
		// System.out.print(infor[i]+" ");
		// }
		// System.out.println();
		// System.out.println("������"+infor[0]);
		// System.out.println("��ߣ�"+infor[1]);
		// System.out.println("���䣺"+infor[2]);
//		int score = new java.util.Scanner(System.in).nextInt();
//		do {
//			System.out.println("���б�̿��ԣ�");
//			System.out.print("���Ե÷֣�");
//			
//			System.out.println("");
//
//		} while (score < 60);
//
//		System.out.println("���Գɼ��ϸ�ͨ����");
	}
}
