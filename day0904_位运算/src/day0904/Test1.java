package day0904;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入整数：");
		int n = new Scanner(System.in).nextInt();
		n = n<<24>>>24;
		System.out.println(n);
		System.out.println("输入整数：");
		n = new Scanner(System.in).nextInt();
		n = n & 0x000000ff;
		System.out.println(n);
	}

}
