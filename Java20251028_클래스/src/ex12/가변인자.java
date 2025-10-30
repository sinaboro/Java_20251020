package ex12;

public class 가변인자 {

	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
//		System.out.println(concatenate(",", "100", "200", "300"));
		System.out.println(concatenate(",", 5, 10, 20));
		
		A a = new A();
		A a1 = new A(10);
	}
	
//	static String concatenate(String delim,  String... args) {
	static String concatenate(String delim,  int... args) {
		
//		System.out.println(delim + " | " + str + " | " + args);
		System.out.println(delim + " |  " + args);
		
		/*
		for(String s : args)
			System.out.println(s);
		*/
		for(int s : args)
			System.out.println(s);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		return null;
	}
}

class A{
	A() {}
	
	A(int i){
		
	}
}
