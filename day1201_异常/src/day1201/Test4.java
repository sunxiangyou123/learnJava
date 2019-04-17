package day1201;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("用户名：");
		String n = new Scanner(System.in).nextLine();
		System.out.println("密码：");
		String p = new Scanner(System.in).nextLine();
		try {
			loginin(n,p);
		} catch (UsernameNotFoundException e) {
			System.err.println("用户名错误");
		}catch (WrongPasswordException e) {
			System.err.println("密码错误");
		}
	}

	private static void loginin(String n, String p) throws UsernameNotFoundException, WrongPasswordException {
		if (!n.equals("abc")) {
			throw new UsernameNotFoundException();
		}
		if (!p.equals("123")) {
			throw new WrongPasswordException();
		}
		
	}
}
