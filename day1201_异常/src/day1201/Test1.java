package day1201;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		System.out.println("输入你的生日(yyyy-MM-d)：");
		String s =new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d");
		Date d = sdf.parse(s);
		long t = System.currentTimeMillis() - d.getTime();
		t = t / 1000 / 60 / 60;
		System.out.println("您已生存了"+ t +"天" );
	}
}
