package ex04;

//"레이저 프린터 출력: " + message 출력
public class LaserPrinter implements Printer{

	@Override
	public void print(String message) {
		System.out.println("레이저 프린터 출력: " + message);
	}
}
