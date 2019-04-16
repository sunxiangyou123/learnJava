package day1001;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		String r = suiJi();
		tiShi();
		while(true) {
			System.out.println("猜：");
			String c = new Scanner(System.in).nextLine();
			String result = biJiao(r , c);
			System.out.println(result);
			if (caiDui(result)) {
				break;
			}
		}
		
	}

	public abstract String suiJi();

	public abstract void tiShi();

	public abstract String biJiao(String r , String c);
	

	public abstract boolean caiDui(String result);
}
