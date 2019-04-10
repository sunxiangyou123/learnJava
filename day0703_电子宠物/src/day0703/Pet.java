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
			System.out.println(name+"�ٳԾ�Ҫ������");
			return;
		}
		System.out.println("ι"+name+"�Զ���");
		int f = 5+ new Random().nextInt(6);
		full +=f;
		System.out.println(name+"�����ã���ʳ��������"+f);
		System.out.println(name+"��ʳ�ȣ�"+full);
		System.out.println(name+"����ֵ��"+happy);
	}
	public void play() {
		if (full == 0) {
			System.out.println(name+"������˰�");
		}
		caidan();
		
	}
	public void caidan() {
		System.out.println("��ѡ����ߣ�");
		System.out.println("1.��߳�");
		System.out.println("2.ë��");
		System.out.println("3.����");
		System.out.println("4.ûǮ����������");
		System.out.println("ѡ�񡪡�>");
		int c = new Scanner(System.in).nextInt();
		outer:
		switch (c) {
		case 1:
			System.out.println("��"+name+"����߳�");
			playx();
			break;
		case 2 :
			System.out.println("��"+name+"����ë��");
			playx();
			break;
		case 3 :
			System.out.println("��"+name+"��������");
			playx();
			break;
		case 4 :
			System.out.println(name+"���񲻿���");
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
		System.out.println(name+"�ܿ��ģ�����ֵ��"+a+"��ʳ�ȼ�"+b);
		System.out.println(name+"��ʳ�ȣ�"+full);
		System.out.println(name+"����ֵ��"+happy);
	}
	public void punish() {
		//��ͬ�Ĵ���͸ĳɵ��÷���
		System.out.println("��СƤ�޴�"+name+"��PP��"+name+"�޽е���"+cry());
	}
	public String cry() {
		//��������룬��������������д�÷���
		return null;
	}
	public String getName() {
		return name;
	}
}
