import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*InputStream��������OutputStraem����������������Ե��ǳ������
 * ����-Ӳ�̣������Ӳ��-��������
 * 
 */
public class Test {
	public static void main(String[] args) throws Exception {
		File f = new File("E:/code/day3/test");
		FileInputStream in = new FileInputStream(f);
		FileOutputStream out = new FileOutputStream(f, true);
		int l = (int) f.length();
		byte[] data = new byte[l];// data�����ʼ��
		in.read(data);
		for (byte b : data) {
			System.out.print(b + " ");
		}
		// f.createNewFile();

		// System.out.println(f.getAbsolutePath());
//		FileInputStream in = new FileInputStream(f);
//		FileOutputStream out = new FileOutputStream(f, true);//���ļ���д��һЩ������boolean append�����׷����true�����򸲸�ԭ�ļ�
//		int fl = (int) f.length();// f.length�õ�����long����ǿ��ת��
//		byte[] data = new byte[fl];
//		in.read(data);// ����read������data���鸳ֵ
//		for (byte b : data) {
//			System.out.print(b + " ");
//		}
//		System.out.println();
//		byte[] b = "123".getBytes();//����getBytes�������ַ�������ֽ�
//		out.write(b,1,2);
//		for (byte c : data) {
//			System.out.print(c + " ");
//		}
//		// int n = in.read(data);//readֻ�ܶ�ȡbyte���͵�����
//		// while(n > 0){//�����ļ���󶼿��Ա�֤��ȡ��
//		// for (byte b : data) {
//		// System.out.println(b);
//		// }
//		// in.read(data);
//		// }
//		// String str = new String(data);
//		// System.out.println(str);
		// byte[] b = "123".getBytes();
		// out.write(b);
		// int length = in.read(data);
		// while(length > 0){
		// for (byte b : data) {
		// System.out.println(b);
		// }
		// length = in.read(data);
		// }

		out.close();
		in.close();
	}
}
