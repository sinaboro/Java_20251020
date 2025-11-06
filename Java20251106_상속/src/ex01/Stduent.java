package ex01;

public class Stduent extends Person{
	
	private String shool;
	
	Stduent() {}
	
	Stduent(String name, int age,  String shool){
		super(name, age);
		this.shool = shool;
	}
	
	void stduentInfo() {
		System.out.printf("학교 : %s\n",shool);
	}
}
