package ex02;

import java.util.Scanner;

/*
 * 국어 >= 60, 영어 >=60 이상이면 합격
 * 아니면 불합격
 */
public class 보충조건문05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >>");
		
		int jumsu = sc.nextInt();
		
		System.out.println("문자열 입력 >>");
		String s = sc.nextLine();
		System.out.println("s : " + s);
		
		System.out.println("종료");

	}

}
