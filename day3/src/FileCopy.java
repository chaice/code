import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//�ļ��ĸ���
public class FileCopy {
	public static void main(String[] args) throws Exception {
		File from = new File("f:/����.doc");
		File to = new File("test");
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to,true);
		byte[] buffer = new byte[1024*64];
		int length = in.read(buffer);
		while(length > 0){
			out.write(buffer);
			length = in.read(buffer);
		}
		out.close();
		in.close();
	}

}
