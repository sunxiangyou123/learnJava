package day0703;

import java.util.Random;
import java.util.Scanner;

public class Pet {
	String name;
	int full;
	int happy;
	public Pet(String name) {
		this(name, 50,50);
	}
	public Pet(String name,int full, int happy) {
		this.name = name ;
		this.full = full;
		this.happy = happy;
	}
	public void feed() {
		if (full >= 100) {
			System.out.println(name+"再吃就要撑死了");
			return;
		}
		System.out.println("喂"+name+"吃东西");
		int f = 5+ new Random().nextInt(6);
		full +=f;
		System.out.println(name+"大快朵颐，饱食度增加了"+f);
		System.out.println(name+"饱食度："+full);
		System.out.println(name+"开心值："+happy);
	}
	public void play() {
		if (full == 0) {
			System.out.println(name+"快饿死了啊");
		}
		caidan();
		
	}
	public void caidan() {
		System.out.println("请选择玩具：");
		System.out.println("1.玩具车");
		System.out.println("2.毛球");
		System.out.println("3.箱子");
		System.out.println("4.没钱，还是算了");
		System.out.println("选择——>");
		int c = new Scanner(System.in).nextInt();
		outer:
		switch (c) {
		case 1:
			System.out.println("和"+name+"玩玩具车");
			playx();
			break;
		case 2 :
			System.out.println("和"+name+"玩玩毛球");
			playx();
			break;
		case 3 :
			System.out.println("和"+name+"玩玩箱子");
			playx();
			break;
		case 4 :
			System.out.println(name+"好像不开心");
			playx();
			break;
		default:
			break;
		}
		
		
	}
	public void playx() {
		int a = 5+new Random().nextInt(11);
		int b =3+ new Random().nextInt(6);
		happy += a ;
		full -= b;
		System.out.println(name+"很开心，欢乐值加"+a+"饱食度减"+b);
		System.out.println(name+"饱食度："+full);
		System.out.println(name+"开心值："+happy);
	}
	public void punish() {
		//不同的代码就改成调用方法
		System.out.println("用小皮鞭打"+name+"的PP，"+name+"哭叫到："+cry());
	}
	public String cry() {
		//无意义代码，必须在子类中重写该方法
		return null;
	}
	public String getName() {
		return name;
	}
}
