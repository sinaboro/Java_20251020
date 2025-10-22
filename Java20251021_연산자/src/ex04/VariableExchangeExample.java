package ex04;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		//before
		System.out.println("num1 : " + num1  + ", num2 : " + num2);
		
		
		//Exchange 두 수 변경
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		//파이썬, num1, num2 = num2, num1;
		
		System.out.println("num1 : " + num1  + ", num2 : " + num2);
		
		//byte -128 ~ 127
		byte var1 = -128;		
		
		var1 -= 1;  //var1 = var1 - 1
		
		//int n = 10;		
		//n +=  1  ==   n = n +1		
		//System.out.println(n);
		
		
		System.out.println(var1);
		
		
	}
}
