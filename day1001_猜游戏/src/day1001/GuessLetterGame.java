package day1001;

import java.util.Random;

public class GuessLetterGame extends GuessGame{

	@Override
	public String suiJi() {
		StringBuilder s = new StringBuilder(
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		);
		for (int i = 0; i < 5; i++) {
			int j = i + new Random().nextInt(s.length() - i);
			s.setCharAt(i, s.charAt(j));
		}
		s.delete(5,s.length());
		System.out.println(s);
		return s.toString();
	}

	@Override
	public void tiShi() {
		System.out.println("已经产生了5个不重复的大写字母");
		System.out.println("猜猜这5个字母");
		
	}

	@Override
	public String biJiao(String r , String c) {
		int a = 0 , b = 0;
		for(int i = 0 ; i < 5;i++) {
			for (int j = 0; j < 5; j++) {
				if (r.charAt(i) == c.charAt(j)) {
					if (i == j) {
						a++;
					} else {
						b++;
					}
					break;
				}
			}
		}
		return a+"A"+b+"B";
	}

	@Override
	public boolean caiDui(String result) {
		
		return result.equals("5A0B");
	}

}
