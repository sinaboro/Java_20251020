package ex02;

import java.util.Scanner;

/*
 * 국어 >= 60, 영어 >=60 이상이면 합격
 * 아니면 불합격
 */
public class 보충조건문06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >>");
		
		int ju = sc.nextInt();
		
		if(ju>=90)
			System.out.println("A학점");
		else if(ju>=80) 
			System.out.println("B");
		else if(ju>=70) 
			System.out.println("C");
		else if(ju>=60) 
			System.out.println("D");
		else 
			System.out.println("F");
		
		
		System.out.println("종료");

	}

}
