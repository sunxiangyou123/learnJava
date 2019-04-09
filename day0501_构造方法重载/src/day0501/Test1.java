package day0501;

public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student();		
		Student s2 = new Student(6,"张三");		
		Student s3 = new Student(6,"张三","男");		
		Student s4 = new Student(6,"张三","男",23);	
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

	}

}
