import java.io.File;
import java.io.IOException;

import org.junit.Test;

/*�����ļ����벶����߸��������ܻ�����쳣
 * 
 */

public class Text2 {
	public static void main(String[] args) throws IOException {
		System.out.println(fb(3));
		System.out.println(db(3));
		System.out.println("��ŵ����" + hn(6));
		String i = "text";
		File f = new File(i);
		f.createNewFile();// �����ļ���������������쳣
		System.out.println(f.isFile());// ����Ƿ����ļ�
		System.out.println(f.exists());// ����ļ��Ƿ����
		System.out.println("Path:" + f.getPath());// ��ȡ�ļ���·��
		System.out.println(f.getName());// ��ȡ�ļ�������
		System.out.println("AbsolutePath:" + f.getAbsolutePath());// �ļ��ľ���·��
		System.out.println("length:" + f.length());
		System.out.println(f.delete());// ɾ���ļ�

	}

	// �ݹ��㷨
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
			File[] fs = f.listFiles();//���飡����
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
