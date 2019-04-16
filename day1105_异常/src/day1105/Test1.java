package day1105;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while(true) {
			try {
				f();
				break;}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("请输入两个整数");
				}catch (ArithmeticException e) {
					System.out.println("不能除以0");
				}catch (Exception e) {
					System.out.println("出错，请重试");
				}finally {
					System.out.println("\n--------------------");
				}
			}
		}
	

	private static void f() {
		System.out.println("请输入逗号隔开的两个整数：");
		String s = new Scanner(System.in).nextLine();
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		System.out.println(n1 / n2);
	}
}
