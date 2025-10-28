package ex02;

import java.util.Scanner;

/*
 * 국어 >= 60, 영어 >=60 이상이면 합격
 * 아니면 불합격
 */
public class 보충조건문08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >>");
		
		int ju = sc.nextInt();
		
		switch(ju/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}		
		
		System.out.println("종료");

	}

}
