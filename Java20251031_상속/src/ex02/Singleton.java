package ex02;

/*
 * 싱글톤 - : 객체 생성을 1개만 생성해서 공유한다.
 */
public class Singleton {
	 
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {   //외부에서 객체 생성불가
		
	}
	
	// 생성된 Singleton 객체를 사용(참조)할 수있는 유일한 통로 역활한다. 
	public static Singleton getInstace() {
		return singleton;
	}
}

class Sample{
	public Sample() {
		
	}
	
	static void func() {
		System.out.println("func()...");
	}
}