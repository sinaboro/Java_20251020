package ex01;

public class Main {

	public static void main(String[] args) {
		
		/*1. 상위클래스는 하위클래스를 참조 가능
		  2. 접근 영역은 상위클래스 영역으로 한정
		  3. 하위클래스 영역있는 메소드를  접근하려면 그 메소드가 상위클래스 메소드를  오버라이딩하면 가능		  
		  4. 하위클래스는 상위클래스 참조 불가.
		  5. 하위클래스가 상위클래스를 기본적으로 참조 불가능하지만,
		     상위클래스가 하위클래스를 참조하고 있는 경우, 그 참조변수를 강제 형변환하면 그 때는 가능
		*/
		
		AClass a1 = new AClass();
		a1.fA();                 // FA...
		System.out.println(a1.toString());  // AClass
		System.out.println("----------------");
		
		//1. 해당
		AClass a2 = new BClass();
		a2.fA(); // 2. 해당, FB()메소드 접근 불가
		System.out.println(a2.toString()); //3. 해당
		
		System.out.println("----------------");
		// BClass b1 = new AClass(); //4. 해당
		BClass b1 = new BClass(); //fA(), fB(), toString()->BClass꺼 
		b1.fA();
		b1.fB();
		System.out.println(b1.toString());
		
		System.out.println("----------------");
		BClass b2 =  (BClass)a2;  //5. 해당, b2참조변수는 b1참조변수와 참조하는 범위가 같다.
		b2.fA();
		b2.fB();
		System.out.println(b2.toString());
		
		a2 = new CClass();
		System.out.println(a2.toString());
	}

}








