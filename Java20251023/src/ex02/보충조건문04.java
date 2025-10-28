package ex02;


/*
 * 국어 >= 60, 영어 >=60 이상이면 합격
 * 아니면 불합격
 */
public class 보충조건문04 {

	public static void main(String[] args) {
		
		int kor=90;
		int eng=59;
		
		if(kor>=60) {
			if(eng>=60)
				System.out.println("합격");
			else 
				System.out.println("불합격");
		}
		else
			System.out.println("불합격");
		
		System.out.println("종료");

	}

}
