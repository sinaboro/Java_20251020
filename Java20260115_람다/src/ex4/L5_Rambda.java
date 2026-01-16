package ex4;

import java.util.function.Consumer;

@FunctionalInterface
interface Printable{
	void print();
}

class Perers{
	private String msg;
	public Perers(String msg) { this.msg = msg;}
	
	public Printable getPrinter() {
		
		//람다
		return () -> System.out.println(msg);
	}	
}

public class L5_Rambda {

	public static void main(String[] args) {		
		
		Perers p = new Perers("메시지 출력요구!");
		Printable p1 = p.getPrinter();
		p1.print();
		
		Consumer<String> msg  =  t -> System.out.println(t);
		
		msg.accept("메시지 출력 요망!!!");
	}

}
