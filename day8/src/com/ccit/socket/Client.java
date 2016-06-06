package com.ccit.socket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 7564);
		InputStream is = s.getInputStream();
		File file = new File("d:/data");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file);
		byte[] b = new byte[1024];
		int i = is.read(b);
		while (i > 0) {
			if (i < 1024) {
				fos.write(b, 0, i);
				break;
			} else {
				fos.write(b);
			}
			i = is.read(b);
		}
		fos.flush();
		fos.close();

		s.close();

	}
}
