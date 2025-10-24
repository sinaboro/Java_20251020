package ex01;

public class If조건문07 {

	public static void main(String[] args) {
		
	    int score = 75;
	    String grade=null;
	    
	    if(score>=90) {
	    	System.out.println("점수가 100-90입니다.");
	    	grade = "A";
	    }else if(score>=80) {
	    	System.out.println("점수가 80-89입니다.");
	    	grade="B";
	    }else if(score>=70) {
	    	System.out.println("점수가 70-79입니다.");
	    	grade="c";
	    }
	    System.out.println("등급은 "+grade+"입니다.");	
	    
		System.out.println("------프로그램 종료--------");

	}

}
