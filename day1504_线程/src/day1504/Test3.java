package day1504;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("按回车捅醒t1");
				new Scanner(System.in).nextLine();
				t1.interrupt();;
			}
		};
		t2.start();
	}
	static class T1 extends Thread{
		@Override
		public void run() {
			SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
			while (true) {
				String s = f.format(new Date());
				System.out.println(s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("谁TMD捅醒老子？？？");
					break;
				}
			}
		}
	}
}
