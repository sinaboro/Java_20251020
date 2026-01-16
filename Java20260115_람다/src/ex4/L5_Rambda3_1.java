package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//문자열 넘겨주면 문자열 길이를 계산해서 반환....

public class L5_Rambda3_1 {

	public static void main(String[] args) {		
		
		Function<String, Integer> s1 = s -> s.length();
					
		int len = s1.apply("이 문장 길이는 얼마일까?");
		
		System.out.println(len);
		
		List<String> list = new ArrayList<String>();
		System.out.println("-------------------------");
		list.add("java");
		list.add("Spring");
		list.add("react");
		list.add("vue3");
		
		list.forEach( t -> System.out.println(t));
		
		System.out.println("-------------------------");
		list.forEach(l -> System.out.println(l) );
		
		System.out.println("--------------------------");
		
		list.forEach( new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		System.out.println("--------------------------");
		
		
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		list.forEach(con);

	}

}



















