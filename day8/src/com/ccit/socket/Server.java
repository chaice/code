package com.ccit.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//文件传输
public class Server {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/text");
		FileInputStream fis = new FileInputStream(file);
		byte[] b = new byte[1024];
		int i = fis.read(b);
		ServerSocket server = new ServerSocket(7564);
		Socket s = server.accept();
		OutputStream os = s.getOutputStream();
		while(i > 0) {//判断读取的字节数，如果小于不b[].length的长度就写入first到i的长度
			if (i < 1024) {
				os.write(b, 0, i);
				break;
			}
			os.write(b);
			i = fis.read(b);//while循环的迭代条件
		}

		os.flush();
		os.close();
		server.close();
		fis.close();

	}

}
