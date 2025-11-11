package ex01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {

	public static void main(String[] args) {
		//int  -> Interger
		
		ArrayList<Integer> list = new ArrayList();
		
		list.add(50);  // new Integer(5)   5 --> new Integer(5) ->wapper
		list.add(new Integer(40));
		list.add(20);
		list.add(new Integer(0));
		list.add(10);
		list.add(new Integer(30));
		
		System.out.println(list);
		System.out.println(list.subList(1, 4));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		
		int num = list.get(2);
		
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("kor");
		list3.add("eng");
		list3.add("math");
		
		String  str = list3.get(2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
