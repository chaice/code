import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		String[] passwords = new String[names.length];

		while (true) {
			System.out.println("==欢迎登陆管理系统==");
			System.out.println("1.注册");
			System.out.println("2.登陆");
			System.out.println("3.退出");
			System.out.println("===================");
			System.out.print("请选择：");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("选择了注册！");
				System.out.print("用户名：");
				String name = sc.next();
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && name.equals(names[i])) {
						System.out.println("用户名重复，请重新输入！");
						break;
					}
					if (names[i] == null) {
						System.out.println("用户名可以使用");
						System.out.print("请输入登陆密码：");
						String pw = sc.next();
						names[i] = name;
						passwords[i] = pw;
						System.out.println("注册成功！");
						break;

					}
				}

			} else if (num == 2) {
				System.out.println("选择了登陆！");
				System.out.println("请输入用户名：");
				String inName = sc.next();
				System.out.println("请输入登陆密码：");
				String inPasswords = sc.next();
				for (int i = 0; i < names.length; i++) {
					if (inName.equals(names[i])
							&& inPasswords.equals(passwords[i])) {
						System.out.println("登陆成功！");
						break;
						
					} if(names[i] == null) {//已经有的全部比较过了！！！
						System.out.println("【登陆信息错误！！！】");
						break;
						
					}
				}
			}else if(num == 3){
				System.out.println("退出成功！");
				break;
			}else{
				System.out.println("选择错误！");
			}
		}
		

	}
}
