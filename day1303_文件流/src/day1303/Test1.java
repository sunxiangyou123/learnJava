package day1303;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("d:/abc/f2");
		out.write(97);//00 00 00 61--->61
		out.write(98);
		out.write(99);
		out.write(365);//00 00 01 64-->64
		byte[] a = {101,102,103,104,105,106,107,108,109,110};
		out.write(a,0,10);
		out.write(a,3,4);
		out.close();//释放系统资源
	}
}
