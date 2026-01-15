package ex4;

import java.util.function.BiPredicate;

/*
 *  어떤 시스템에서
	사용자가 입력한 아이디와 비밀번호가
	이미 등록된 정보와 일치하는지 검사하려고 한다.
	이 검사를 BiPredicate<String, String> 로 구현하시오.
	String savedId = "admin";
	String savedPw = "1234";
 */


public class L5_Rambda7 {

	public static void main(String[] args) {		
		
		BiPredicate<String, String> f = (id, pass) ->  id.equals("admin") && pass.equals("1234") ? true : false;
		
		boolean flag = f.test("admin2", "1234");
		
	    if(flag == true) {
	    	System.out.println("로그인 성공");
	    }else {
	    	System.out.println("로그인 실패");	    	
	    }
		
	}

}
