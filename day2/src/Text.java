public class Text {
	/*
	 * �쳣���������쳣(runtimeException�ͷ������쳣 �������쳣���벶����߸��������ܳ����쳣
	 * try��catch��finally�ؼ��֡�try���г����쳣�����Ĵ��벻��ִ�У�ֱ��ִ��
	 * catch���еĴ��룬���try����û���쳣��ִ��catch,����try���Ƿ����쳣
	 * ��ִ��finally����ִ�е�Ψһ�����ǿ����ֹ�������У�System.exit(1 getMessage�õ�����һ���ַ���
	 * printStackTrace����쳣��Ϣ������Ϊ�˻�ȡ�쳣 throw���ֶ������쳣�����Ĵ��벻��ִ�У���return��������ͬ
	 * throws������ʱ�쳣��ʹ�÷��ڷ������ĺ���
	 */
	public static void main(String[] args) {
		// try {
		// int i = new java.util.Scanner(System.in).nextInt();;
		// System.out.println(i+2);//InputMisMatch,���Ͳ�ƥ��
		// } catch (Exception e) {
		// System.out.println("������ϢΪ��");
		// e.printStackTrace();
		// }
		// int i = 2;
		// int j = 0;
		// try {
		// System.out.println(i / j);// �����쳣,�����쳣��ArithmeticException
		// } catch (Exception e) {
		// System.out.println("������ϢΪ��");
		// e.printStackTrace();
		// }
		// try {
		// String str = null;
		// System.out.println(str.equals("object"));//��ָ���쳣��NullPointer
		// } catch (Exception e) {
		// System.out.println("������ϢΪ��");
		// e.printStackTrace();
		// }
		// try {
		// String str = null;
		// System.out.println(str.equals("object"));// ��ָ���쳣��NullPointer
		// } catch (Exception e) {
		// System.out.println("������ϢΪ��" + e.getMessage());
		// }
		int i = 1;//��·�����쳣
		int j = 0;
		try {
			System.out.println(i / j);
		} catch (NullPointerException e) {
			System.out.println("������ָ���쳣");
		} catch (ArithmeticException e) {
			System.out.println("���������쳣");

		} catch (Exception e) {
			System.out.println("����û�в�����쳣");
		}

		try {
			Cc();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void Cc() throws Exception {// �������쳣
		NullPointerException np = new NullPointerException();
		throw np;
	}

}
