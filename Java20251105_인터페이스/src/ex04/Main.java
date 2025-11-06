package ex04;

/*
 * Printer 타입 변수로 두 종류의 프린터를 제어하고,
	"테스트 페이지 출력" 문장을 출력한다.
 */
public class Main {

	public static void main(String[] args) {
		
		Printer p = new LaserPrinter();
		p.print("테스트 페이지 출력");
		
		System.out.println("----------------");
		p = new InkjectPrinter();
		p.print("테스트 페이지 출력");

	}

}
