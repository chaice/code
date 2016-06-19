import java.io.File;
import java.io.IOException;

import org.junit.Test;

/*创建文件必须捕获或者告诉外界可能会出现异常
 * 
 */

public class Text2 {
	public static void main(String[] args) throws IOException {
		System.out.println(fb(3));
		System.out.println(db(3));
		System.out.println("汉诺塔：" + hn(6));
		String i = "text";
		File f = new File(i);
		f.createNewFile();// 创建文件，会产生非运行异常
		System.out.println(f.isFile());// 检测是否是文件
		System.out.println(f.exists());// 检测文件是否存在
		System.out.println("Path:" + f.getPath());// 获取文件的路径
		System.out.println(f.getName());// 获取文件的名字
		System.out.println("AbsolutePath:" + f.getAbsolutePath());// 文件的绝对路径
		System.out.println("length:" + f.length());
		System.out.println(f.delete());// 删除文件

	}

	// 递归算法
	static int fb(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return fb(n - 1) + fb(n - 2);
	}

	static int hn(int n) {
		if (n == 1) {
			return 1;
		}
		return hn(n - 1) * 2 + 1;
	}

	static int db(int n) {
		if (n == 1) {
			return 1;
		}
		return db(n - 1) * 2;
	}

	static void deleteFile(File f) {
		if (f.isFile() || f.listFiles().length == 0) {
			f.delete();
		} else {
			File[] fs = f.listFiles();//数组！！！
			for (File file : fs) {
				deleteFile(file);
			}
			f.delete();
		}
	}
	@Test
	public void add(){
		System.out.println(1+1);
	}

}
