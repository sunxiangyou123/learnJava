package day1503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test1 {
	public static void main(String[] args) throws Exception {
		List<String> list = f1();
		f2(list);
		f3(list);
	}

	private static List<String> f1() throws Exception{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("d:/abc"), "GBK"));
		ArrayList<String> a = new ArrayList<>();
		String line = null;
		while((line = in.readLine()) != null){
			String s = line.trim();
			if (s.length() ==0) {
				continue;
			}
			a.add(s);
			
		}
		in.close();
		System.out.println(a);
		return a ;
	}

	private static void f2(List<String> list) {
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1 ,String o2) {
				SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
				try {
					Date a1 = f.parse(o1);
					Date a2 = f.parse(o2);
					return a1.compareTo(a2);
					}catch(Exception e){
						throw new IllegalArgumentException(e);
					}
			}
		});
		System.out.println(list);
	}

	private static void f3(List<String> list) throws Exception{
		PrintWriter out = new PrintWriter(new OutputStreamWriter(
				new FileOutputStream("d:/abcd"),"UTF-8"));
		for (String string : list) {
			out.println(string);
		}
		out.close();
	}
}
