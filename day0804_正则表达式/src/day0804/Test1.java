package day0804;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
	    System.out.println("\n-----------------");
	    f1();
	    System.out.println("\n-----------------");
	    f2();
	}

	private static void f1() {
	    System.out.println("���֤�ţ�");
	    String s = new Scanner(System.in).nextLine();
	    /*
	     * 123456789012345
	     * 123456789012345678
	     * 12345678901234567x
	     * 12345678901234567X
	     * |
	     * \d{15}|
	     * \d{15}|\d{17}
	     * \d{15}|\d{17}[\dxX]   ������ʽ�﷨
	     * "\\d{15}|\\d{17}[\\dxX]"
	     */
	    String regex = "\\d{15}|\\d{17}[\\dxX]";
	    //�ж��ַ���s�ܷ�ƥ��ָ����������ʽ
	    if (s.matches(regex)) {
	        System.out.println("��ʽ��ȷ");
	    }else {
	        System.out.println("��ʽ����");
	    }
	}

	private static void f2() {
	    System.out.println("�̶��绰��");
	    String s = new Scanner(System.in).nextLine();
	    /*
	     * 1234567
	     * 12345678
	     * 010-1234567
	     * 0101-12345678
	     * (010)1234567
	     * (0101)12345678
	     * (���ű��ʽ)?\d{7,8}
	     * (|)?\d{7,8}
	     * (\d{3,4}-|)?\d{7,8}
	     * (\d{3,4}-|())?\d{7,8}
	     * (\d{3,4}-|\(\d{3,4}\))?\d{7,8}
	     */
	    String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
	    //�ж��ַ���s�ܷ�ƥ��ָ����������ʽ
	    if (s.matches(regex)) {
	        System.out.println("��ʽ��ȷ");
	    }else {
	        System.out.println("��ʽ����");
	    }
	}
	}
