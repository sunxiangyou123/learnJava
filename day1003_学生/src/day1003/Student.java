package day1003;

public class Student {
	//��̬��ʼ����
	static {
	    System.out.println(
	    "��̬�� - Student�౻����ʱִ��");
	}
	//��Ա����һ�㶼��private����
	//����ά���޸�
	private int id;
	private String name;
	private String gender;
	private int age;
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public String getGender() {
	    return gender;
	}
	public void setGender(String gender) {
	    this.gender = gender;
	}
	public int getAge() {
	    return age;
	}
	public void setAge(int age) {
	    this.age = age;
	}
	@Override
	public String toString() {
	    return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
