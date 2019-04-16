package day0701;

public class Student extends Person{
	String schoolName;
	//super代码要求必须是首行，与this不可同时出现（this也要求首行）
	public Student() {
		//super();//默认隐含调用，不是继承
	}
	public Student(String name , String gender,int age,String schoolName) {
		super(name,gender,age);//手动调用父类的有参构造，减少代码重复。
		this.schoolName = schoolName;
	}
	@Override
	//执行子类的toString方法，不执行父类的
	public String toString() {
		//super.toStirng();
		//一般在重写方法时，调用父类的一个人方法代码，以减少代码重复。
		return super.toString() + "," + schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
