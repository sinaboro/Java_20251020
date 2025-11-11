package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		//int  -> Interger
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(50);  // new Integer(5)   5 --> new Integer(5) ->wapper
		list.add(new Integer(40));
		list.add(20);
		list.add(new Integer(0));
		list.add(10);
		list.add(new Integer(30));
		
		System.out.println(list);
		System.out.println(list.subList(1, 4));
		
		List<Integer> list2 = new LinkedList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.get(3));  //단건 조회
		System.out.println(list.get(2));
		
		
		System.out.println(list);
		list.remove(2);  //삭제
		
		System.out.println(list);
		
		
		int num = list.get(2);
		
		
		List<String> list3 = new LinkedList<String>();
		list3.add("kor");
		list3.add("eng");
		list3.add("math");
		
		String  str = list3.get(2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
