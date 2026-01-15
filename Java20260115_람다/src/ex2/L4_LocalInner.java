package ex2;

interface Printable{
	void print();
}

class Perers{
	private String msg;
	public Perers(String msg) { this.msg = msg;}
	
	public Printable getPrinter() {
		
		class Printer implements Printable{
			
			public void print() {
				System.out.println(msg);
			}
		}	
		
		return new Printer();
	}	
}

public class L4_LocalInner {

	public static void main(String[] args) {		
		
		Perers p1 = new Perers("이 문장을 출력하고 싶어2!");
		Printable prn = p1.getPrinter();
		prn.print();
	}

}
