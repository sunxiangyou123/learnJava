package day1202;

public interface Weapon {
	public static final int TYPE_COLD = 0;
	int TYPE_HOT = 1;//接口默认，public static final 可以省略
	int TYPE_NUCLEAR = 2;
	public abstract void kill();
	String getName();//接口默认，public abstract 可以省略
	int getType();
}
