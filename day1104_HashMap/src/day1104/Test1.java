package day1104;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(99527, "�Ʋ���");
		map.put(99528, "������");
		map.put(99529, "ף֦ɽ");
		map.put(99530, "����");
		map.put(99531, "Сǿ");
		map.put(99532, "ʯ���");
		map.put(99533, "����");
		map.put(99533, "�绨");//��ֵ�滻��ֵ
		map.put(99534, null);
		map.put(null, "---");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(9527));
		System.out.println(map.get(9999));
		System.out.println(map.remove(9531));
		System.out.println(map);

	}
}
