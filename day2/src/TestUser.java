import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		String[] passwords = new String[names.length];

		while (true) {
			System.out.println("==��ӭ��½����ϵͳ==");
			System.out.println("1.ע��");
			System.out.println("2.��½");
			System.out.println("3.�˳�");
			System.out.println("===================");
			System.out.print("��ѡ��");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("ѡ����ע�ᣡ");
				System.out.print("�û�����");
				String name = sc.next();
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && name.equals(names[i])) {
						System.out.println("�û����ظ������������룡");
						break;
					}
					if (names[i] == null) {
						System.out.println("�û�������ʹ��");
						System.out.print("�������½���룺");
						String pw = sc.next();
						names[i] = name;
						passwords[i] = pw;
						System.out.println("ע��ɹ���");
						break;

					}
				}

			} else if (num == 2) {
				System.out.println("ѡ���˵�½��");
				System.out.println("�������û�����");
				String inName = sc.next();
				System.out.println("�������½���룺");
				String inPasswords = sc.next();
				for (int i = 0; i < names.length; i++) {
					if (inName.equals(names[i])
							&& inPasswords.equals(passwords[i])) {
						System.out.println("��½�ɹ���");
						break;
						
					} if(names[i] == null) {//�Ѿ��е�ȫ���ȽϹ��ˣ�����
						System.out.println("����½��Ϣ���󣡣�����");
						break;
						
					}
				}
			}else if(num == 3){
				System.out.println("�˳��ɹ���");
				break;
			}else{
				System.out.println("ѡ�����");
			}
		}
		

	}
}
