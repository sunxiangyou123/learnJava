package day1001;

import java.util.Random;

public class GuessNumberGame extends GuessGame {

	@Override
	public String suiJi() {
		int a = new Random().nextInt(100) + 1;
		return String.valueOf(a);
	}

	@Override
	public void tiShi() {
		System.out.println("已经生成了一个100以内的整数");
		System.out.println("试着猜一下");
		
	}

	@Override
	public String biJiao(String r , String c) {
		int r1 = Integer.parseInt(r);
		int c1 = Integer.parseInt(c);
		if (r1 < c1) {
			return "大";
		}else if (r1 > c1) {
			return "小";
		}else {
			return "对";
		}
		
	}

	@Override
	public boolean caiDui(String result) {
		return result.equals("对");
	}

}
