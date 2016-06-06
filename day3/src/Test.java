import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*InputStream输入流，OutputStraem输出流，输入输出针对的是程序而言
 * 程序-硬盘（输出，硬盘-程序（输入
 * 
 */
public class Test {
	public static void main(String[] args) throws Exception {
		File f = new File("E:/code/day3/test");
		FileInputStream in = new FileInputStream(f);
		FileOutputStream out = new FileOutputStream(f, true);
		int l = (int) f.length();
		byte[] data = new byte[l];// data数组初始化
		in.read(data);
		for (byte b : data) {
			System.out.print(b + " ");
		}
		// f.createNewFile();

		// System.out.println(f.getAbsolutePath());
//		FileInputStream in = new FileInputStream(f);
//		FileOutputStream out = new FileOutputStream(f, true);//向文件中写入一些东西，boolean append如果是追加则true，否则覆盖原文件
//		int fl = (int) f.length();// f.length得到的是long型需强制转化
//		byte[] data = new byte[fl];
//		in.read(data);// 利用read方法给data数组赋值
//		for (byte b : data) {
//			System.out.print(b + " ");
//		}
//		System.out.println();
//		byte[] b = "123".getBytes();//利用getBytes方法将字符串变成字节
//		out.write(b,1,2);
//		for (byte c : data) {
//			System.out.print(c + " ");
//		}
//		// int n = in.read(data);//read只能读取byte类型的数组
//		// while(n > 0){//不管文件多大都可以保证读取完
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
