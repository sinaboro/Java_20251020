package ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream06 {

	public static void main(String[] args) {

		String[] name = {"YOON", "CHO", "KIM", "PARK","KIM", "CHO"};
		
		Stream<String> stream = Arrays.stream(name);
		
		
		List<String> list = stream
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println(list);
		
	}

}
