package ex3;

interface Printable{
	void print();
	void print2();
}

class Perers{
	private String msg;
	public Perers(String msg) { this.msg = msg;}
	
	public Printable getPrinter() {
		
		//익명 클래스
		return new Printable() {
			
			@Override
			public void print() {
				System.out.println(msg);
			}
			
			@Override
			public void print2() {
				System.out.println(msg);
			}
		};	
		
	}	
}

public class L5_AnonymousClass {

	public static void main(String[] args) {		
		
		Perers p1 = new Perers("이 문장을 출력하고 싶어3!");
		Printable prn = p1.getPrinter();
		prn.print();
	}

}
