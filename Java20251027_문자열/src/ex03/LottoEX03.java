package ex03;

import java.util.Arrays;

public class LottoEX03 {

	public static void main(String[] args) {
		
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 래덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[6];		
		int count=1;
		
		for(int i=0; i<lotto.length; i++) {
			
			//1~45까지 랜덤숫자 나옴
			int tmp = (int)(Math.random()*45)+1;
			
			lotto[i] = tmp;
			count++;
			//중복 체크 
			for(int j=0; j < i; j++) {
				if(tmp == lotto[j]) {
                    i--; 				
					break;
				} //end if
			} //end j	 	
		} //end  i
		
		System.out.println(Arrays.toString(lotto));
		System.out.println("반복횟수 : " + count);

	} //end main

} //end 
