package com.ccit.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//�ļ�����
public class Server {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/text");
		FileInputStream fis = new FileInputStream(file);
		byte[] b = new byte[1024];
		int i = fis.read(b);
		ServerSocket server = new ServerSocket(7564);
		Socket s = server.accept();
		OutputStream os = s.getOutputStream();
		while(i > 0) {//�ж϶�ȡ���ֽ��������С�ڲ�b[].length�ĳ��Ⱦ�д��first��i�ĳ���
			if (i < 1024) {
				os.write(b, 0, i);
				break;
			}
			os.write(b);
			i = fis.read(b);//whileѭ���ĵ�������
		}

		os.flush();
		os.close();
		server.close();
		fis.close();

	}

}
