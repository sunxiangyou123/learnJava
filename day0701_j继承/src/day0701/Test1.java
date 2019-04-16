package day0701;

public class Test1 {
public static void main(String[] args) {
	Person p = new Person("张三","男",22);
	Student s = new Student();
	Employee e = new Employee();
	s.setName("李四");
	s.setGender("女");
	s.setAge(23);
	s.setSchoolName("牛皮筋大学");
	e.setName("王五");
	e.setGender("男");
	e.setAge(50);
	e.setSalary(9500);
	//print默认调用对象的toString方法
	System.out.println(p.toString());
	System.out.println(s);
	System.out.print(e);
}
}
