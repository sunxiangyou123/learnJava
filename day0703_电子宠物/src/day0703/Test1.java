package day0703;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	System.out.println("������Ҫ�����ĳ��");
	System.out.println("1.è");
	System.out.println("2.��");
	System.out.println("3.��");
	System.out.print("ѡ�񡪡�>");
	int c = new Scanner(System.in).nextInt();
	System.out.println("������������ְɣ�");
	String n = new Scanner(System.in).nextLine();
	Cat cat = null;
	Dog dog = null;
	Pig pig = null;
	if (c == 1) {
		cat = new Cat(n);
		cat.setSound("��~");
		f(cat);
	}
	else if (c == 2) {
		dog = new Dog(n);
		dog.setSound("��~");
		f(dog);
	}
	else if (c == 3) {
		pig = new Pig(n);
		pig.setSound("��~");
		f(pig);
	}
	else {
		System.out.println("��Ϸ����");
	}
}

private static void f(Pet pet) {
	outer:
		while(true) {
			System.out.println("\n-----------------------");
			System.out.println("��"+pet.getName()+"һ����ɣ�");
			System.out.println("1.ιʳ");
			System.out.println("2.��ˣ");
			System.out.println("3.Van��");
			System.out.println("4.�˳�");
			System.out.print("ѡ�񡪡�>");
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
