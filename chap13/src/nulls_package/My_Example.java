package nulls_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class My_Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("어디로");
		list.add("가야하죠~");
		list.add("아저씨~");
		list.add("우는 손님은");
		list.add("처음인 가요~");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		
		String skill = list.get(2);
 		System.out.println(skill);
 		
 		for (int i = 0; i < list.size(); i++) {
 			String str = list.get(i);
 			System.out.println(i);			
		}
		
	}

}
