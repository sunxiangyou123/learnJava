package day1201;

import java.text.SimpleDateFormat;

public class Date extends java.util.Date{
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = f.format(this);
		return s;
	}
}
