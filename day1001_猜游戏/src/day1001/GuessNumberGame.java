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
		System.out.println("�Ѿ�������һ��100���ڵ�����");
		System.out.println("���Ų�һ��");
		
	}

	@Override
	public String biJiao(String r , String c) {
		int r1 = Integer.parseInt(r);
		int c1 = Integer.parseInt(c);
		if (r1 < c1) {
			return "��";
		}else if (r1 > c1) {
			return "С";
		}else {
			return "��";
		}
		
	}

	@Override
	public boolean caiDui(String result) {
		return result.equals("��");
	}

}
