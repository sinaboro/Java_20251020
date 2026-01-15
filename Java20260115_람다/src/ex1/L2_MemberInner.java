package ex1;

class Outer1{
	private int num=0;
	
	class Member{
		void add(int n) {num += n;}
		int get() { return num;}
	}
}

public class L2_MemberInner {

	public static void main(String[] args) {
		
		Outer1 o1 = new Outer1();		
		Outer1.Member o1m1 = o1.new Member();
		
		o1m1.add(5);
		int n = o1m1.get();
		System.out.println(n);
		
		
	}

}
