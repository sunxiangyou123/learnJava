package day0701;

public class Test1 {
public static void main(String[] args) {
	Person p = new Person("����","��",22);
	Student s = new Student();
	Employee e = new Employee();
	s.setName("����");
	s.setGender("Ů");
	s.setAge(23);
	s.setSchoolName("ţƤ���ѧ");
	e.setName("����");
	e.setGender("��");
	e.setAge(50);
	e.setSalary(9500);
	//printĬ�ϵ��ö����toString����
	System.out.println(p.toString());
	System.out.println(s);
	System.out.print(e);
}
}
