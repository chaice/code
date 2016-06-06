public class Text {
	/*
	 * 异常包括运行异常(runtimeException和非运行异常 非运行异常必须捕获或者告诉外界可能出现异常
	 * try、catch、finally关键字。try块中出现异常，其后的代码不再执行，直接执行
	 * catch块中的代码，如果try块中没有异常则不执行catch,无论try中是否有异常
	 * 都执行finally（不执行的唯一情况，强制终止程序运行，System.exit(1 getMessage得到的是一个字符串
	 * printStackTrace输出异常信息，都是为了获取异常 throw是手动声明异常，其后的代码不会执行，与return的作用相同
	 * throws非运行时异常才使用放在方法（的后面
	 */
	public static void main(String[] args) {
		// try {
		// int i = new java.util.Scanner(System.in).nextInt();;
		// System.out.println(i+2);//InputMisMatch,类型不匹配
		// } catch (Exception e) {
		// System.out.println("错误信息为：");
		// e.printStackTrace();
		// }
		// int i = 2;
		// int j = 0;
		// try {
		// System.out.println(i / j);// 除零异常,算术异常，ArithmeticException
		// } catch (Exception e) {
		// System.out.println("错误信息为：");
		// e.printStackTrace();
		// }
		// try {
		// String str = null;
		// System.out.println(str.equals("object"));//空指针异常，NullPointer
		// } catch (Exception e) {
		// System.out.println("错误信息为：");
		// e.printStackTrace();
		// }
		// try {
		// String str = null;
		// System.out.println(str.equals("object"));// 空指针异常，NullPointer
		// } catch (Exception e) {
		// System.out.println("错误信息为：" + e.getMessage());
		// }
		int i = 1;//多路捕获异常
		int j = 0;
		try {
			System.out.println(i / j);
		} catch (NullPointerException e) {
			System.out.println("发生空指针异常");
		} catch (ArithmeticException e) {
			System.out.println("发生算术异常");

		} catch (Exception e) {
			System.out.println("上面没有捕获的异常");
		}

		try {
			Cc();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void Cc() throws Exception {// 非运行异常
		NullPointerException np = new NullPointerException();
		throw np;
	}

}
