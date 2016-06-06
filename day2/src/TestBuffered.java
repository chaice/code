public class TestBuffered {
	public static void main(String[] args) throws Exception {
		int[] it = { 22, 33, 12, 11, 1, 44 };
		int temp;
//		for (int i = 0; i < it.length-1 ; i++) {//冒泡排序
//			for (int j = 0; j < it.length - 1-i; j++) {
//				if (it[j] > it[j + 1]) {
//					temp = it[j];
//					it[j] = it[j + 1];
//					it[j + 1] = temp;
//				}
//			}
//		}
		for (int i = 0; i < it.length ; i++) {
			System.out.println(it[i]);
		}
		// File file = new File("test");
		// FileReader fr = new FileReader(file);//利用BufferedReader读取文件
		// BufferedReader br = new BufferedReader(fr);
		// String str = br.readLine();
		// while (str != null) {
		// System.out.println(str);
		// str = br.readLine();
		// }
		// br.close();
		// fr.close();
		// FileWriter fw = new FileWriter(file,true);//利用BufferedWriter向文件中输入内容
		// BufferedWriter bw = new BufferedWriter(fw);
		// bw.write("abcdef");
		// bw.newLine();
		// bw.flush();
		// bw.close();

	}

}
