package day0701;

public class Student extends Person{
	String schoolName;
	//super����Ҫ����������У���this����ͬʱ���֣�thisҲҪ�����У�
	public Student() {
		//super();//Ĭ���������ã����Ǽ̳�
	}
	public Student(String name , String gender,int age,String schoolName) {
		super(name,gender,age);//�ֶ����ø�����вι��죬���ٴ����ظ���
		this.schoolName = schoolName;
	}
	@Override
	//ִ�������toString��������ִ�и����
	public String toString() {
		//super.toStirng();
		//һ������д����ʱ�����ø����һ���˷������룬�Լ��ٴ����ظ���
		return super.toString() + "," + schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
