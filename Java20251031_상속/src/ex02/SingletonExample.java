package ex02;

public class SingletonExample {
	
	public static void main(String[] args) {
				
				
		
		Singleton obj1 =  Singleton.getInstace();
		Singleton obj2 = Singleton.getInstace();
		
		if(obj1.equals(obj2)) {
			System.out.println("같은 Singleton 객체");
		}else {
			System.out.println("다른 Singleton 객체");
		}
		
		Sample sam1 = new Sample();
		Sample sam2 = new Sample();

		if(sam1.equals(sam2)) {
			System.out.println("같은 Sample 객체");
		}else {
			System.out.println("다른 Sample 객체");
		}
		
	}
}
