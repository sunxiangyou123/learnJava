package day1502;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Collections.addAll(a,"2019-4-1", 
				"2019-4-11",
				"2019-4-21",
				"2019-4-14",
				"2019-4-13",
				"2019-4-23",
				"2019-4-12",
				"2019-4-22",
				"2019-4-30",
				"2019-4-3"
				);
		Collections.sort(a,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2 ) {
				SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
				try {
				Date a1 = a.parse(o1);
				Date a2 = a.parse(o2);
				return a1.compareTo(a2);
				}catch(Exception e){
					throw new IllegalArgumentException(e);
				}
			}
		});
		System.out.println(a);
	}
}
