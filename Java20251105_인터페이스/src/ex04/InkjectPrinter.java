package ex04;

//"잉크젯 프린터 출력: " + message 출력
public class InkjectPrinter implements Printer{

	public InkjectPrinter() {
	
	}
	
	@Override
	public void print(String message) {
		System.out.println("잉크젯 프린터 출력: " + message);
	}

}
