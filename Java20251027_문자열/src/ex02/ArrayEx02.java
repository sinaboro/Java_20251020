package ex02;

/*
 * 정수 배열 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 */
public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] numArr = {90,80,70,60,50};
		
		//numArr = new int[]{90,80,70,60,50}; X
				
		int sum=0;
		
		//sum = numArr[0]+numArr[1]+numArr[2]+numArr[3]+numArr[4];
		
		for(int i=0; i<5; i++)
			sum += numArr[i];
		
		/*
		 * sum = sum + numArr[0]
		 * sum = sum + numArr[1]
		 * sum = sum + numArr[2]
		 * sum = sum + numArr[3]
		 * sum = sum + numArr[4]
		 */
		
		
		System.out.println("총합 : " + sum);

	}

}
