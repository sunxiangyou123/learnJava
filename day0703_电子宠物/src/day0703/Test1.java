package day0703;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	System.out.println("输入想要领养的宠物：");
	System.out.println("1.猫");
	System.out.println("2.狗");
	System.out.println("3.猪");
	System.out.print("选择——>");
	int c = new Scanner(System.in).nextInt();
	System.out.println("给宠物起个名字吧！");
	String n = new Scanner(System.in).nextLine();
	Cat cat = null;
	Dog dog = null;
	Pig pig = null;
	if (c == 1) {
		cat = new Cat(n);
		cat.setSound("喵~");
		f(cat);
	}
	else if (c == 2) {
		dog = new Dog(n);
		dog.setSound("汪~");
		f(dog);
	}
	else if (c == 3) {
		pig = new Pig(n);
		pig.setSound("哼~");
		f(pig);
	}
	else {
		System.out.println("游戏结束");
	}
}

private static void f(Pet pet) {
	outer:
		while(true) {
			System.out.println("\n-----------------------");
			System.out.println("和"+pet.getName()+"一起玩吧！");
			System.out.println("1.喂食");
			System.out.println("2.玩耍");
			System.out.println("3.Van♂");
			System.out.println("4.退出");
			System.out.print("选择——>");
			int c = new Scanner(System.in).nextInt();

			switch(c) {
			case 1 : 
				pet.feed();
				break;
			case 2 : 
				pet.play();
				break;
			case 3 : 
				pet.punish();
				break;
			default: 

				break outer;
			}
		}


}
}
