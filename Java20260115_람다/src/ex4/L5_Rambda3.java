package ex4;

//문자열 넘겨주면 문자열 길이를 계산해서 반환....
//1. 클래스 구현체 만들기
//2. 익명함수 변경
//3. 람다 변경

@FunctionalInterface
interface StringLength {
	int getLength(String s);
}

class AAA implements StringLength{

	@Override
	public int getLength(String s) {
		return s.length();
	}
}

public class L5_Rambda3 {

	public static void main(String[] args) {		
		
		//StringLength s = new AAA();
		
		/*
		StringLength s = new StringLength() {
			
			@Override
			public int getLength(String s) {
				return s.length();
			}
		};
		*/
		
		StringLength s1 = s -> s.length();
			
		int len = s1.getLength("이 문장 길이는 얼마일까?");
		
		System.out.println(len);
		
	}

}
