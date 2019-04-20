package day1405;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test2 {
	public static void main(String[] args) throws Exception {
		f("D:/abc/f6","GBK");
		f("D:/abc/f7","UTF-8");
	}

	private static void f(String path, String charset) throws Exception{
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), charset);
		int count = 0;
		for (int i = '\u4e00'; i < '\u9f65'; i++) {
			out.write(i);
			count++;
			if (count == 30) {
				out.write('\n');
				count = 0;
			}
		}
		out.close();
	}
}
