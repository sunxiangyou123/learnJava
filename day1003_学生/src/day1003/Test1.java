package day1003;
public class Test1 {
	static {
	    System.out.println("Test1 - ¾²Ì¬¿é");
	}
	public static void main(String[] args) {
		System.out.println("main");
	    Student s = new Student();
	    Student s2 = new Student();
	    Student s3 = new Student();
	    Student s4 = new Student();
	    //s.id = 9527;
	    s.setId(9527);
	    s.setName("ÌÆ²®»¢");
	    s.setGender("ÄÐ");
	    s.setAge(19);
	    System.out.println(s.getId());
	    System.out.println(s.getName());
	    System.out.println(s.getGender());
	    System.out.println(s.getAge());
	}
}
