package ex02;

public class 입력O출력O{

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "안창현";
		s1.age = 29;
		s1.address = "강동구 천호동";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		s1.add(5, 2);
		//System.out.println("두 수 합 : " + num);
		
		System.out.println("---------------------");
		
		Student s2 = new Student();
		s2.name = "선아영";
		s2.age = 28;
		s2.address = "강동구 암사동";
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.address);
		s2.study();
		
		int num = s2.add(10, 29);
		System.out.println("두 수 합 : " + num);
	}

}

class Test{
	
}

class Student{
	String name;
	int age;
	String address;
	
	void study() {
		System.out.println(name + " Java 공부 중 입니다.");
	}
	
	//함수명:add, 반환타입(리턴값):int, 매개변수(입력값): 정수2개(int형)
    
	int add(int n1, int n2) {
    	int sum = n1+n2;    	
    	return sum;   //return n1+n2
    
    }
}
