package ex02;

import java.util.Scanner;

/*
 * 입력한 정수가 짝수인지 홀수인지 구별
 */
public class 보충조건문07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >>");
		
		int ju = sc.nextInt();
		
		if(ju % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
			
		
		
		System.out.println("종료");

	}

}
