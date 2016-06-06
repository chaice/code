package com.java.CC.dog;

/*正则表达式常用元字符：
 * \w 匹配任意的一个字母、数字、汉字、下划线
 * \d 匹配任意的数字
 * . 匹配出换行符以外的任何字符
 * \s 匹配任意的空白符
 * 正则表达式常用限定符：
 * * 重复零次或多次
 * + 重复一次或多次
 * ? 重复零次或一次
 * {n} 重复n次
 * {n,} 重复n次或更多次
 * {n,m} 重复n到m次
 * 正则表达式常用反义词
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		//
		// String str = " a,b,c,d,e,f";
		// System.out.println(str.contains("a"));// 验证str内是否包含字母a
		// System.out.println("str为：" + str);
		// System.out.println("str为：" + str.trim());// trim去掉字符串前面的空格
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
		String email = "outdu@qq.com";// 验证邮箱是否合法
		String regex = "[a-zA-z]\\w*@\\w+(\\.\\w+)+";

		System.out.println(email.matches(regex));
		boolean b = email.matches(regex);

		if (b == false) {
			System.out.println("邮箱不合法!");
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
		StringBuffer sb = new StringBuffer();// StringBuffer的使用
		long start1 = System.currentTimeMillis();
		System.out.println("start1Time:" + start1);
		for (int i = 1; i < 2222; i++) {
			sb.append(i + "i");
		}
		System.out.println(sb.toString());// sb.toString 获取StringBuffer内的值
		long end1 = System.currentTimeMillis();
		System.out.println("end1Time:" + end1);

		// StringBuffer sb = new StringBuffer();
		// System.out.println(sb.append("123"));
		// String str = "张三,178,18";
		// int l = str.length();
		// System.out.println(l);
		// System.out.println(str.equals("erfasusdu"));//比较字符串str.equalsIgnoreCase()不区分大小写
		// String[] infor = str.split(",");//把字符串拆分成数组
		// for(int i = 0;i<infor.length;i++){
		// System.out.print(infor[i]+" ");
		// }
		// System.out.println();
		// System.out.println("姓名："+infor[0]);
		// System.out.println("身高："+infor[1]);
		// System.out.println("年龄："+infor[2]);
//		int score = new java.util.Scanner(System.in).nextInt();
//		do {
//			System.out.println("进行编程考试！");
//			System.out.print("考试得分：");
//			
//			System.out.println("");
//
//		} while (score < 60);
//
//		System.out.println("考试成绩合格，通过！");
	}
}
