package ex01;

import java.util.Random;

public class 조작랜덤 {

	public static void main(String[] args) {
		
		Random rand = new Random(1);
		
		System.out.println(rand.nextInt(18)+1);

	}

}
