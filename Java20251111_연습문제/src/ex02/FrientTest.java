package ex02;

public class FrientTest {

	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("홍길동", "010", "hong@goolge.com" ),
				new Friend("고길동", "111", "test@goolge.com" ),
				new Friend("박길동", "222", "free@goolge.com" ),
				new Friend("이길동", "444", "lee@goolge.com" ),
				new Friend("강길동", "555", "kang@goolge.com" ),
		};
		
		for(Friend f : friends)
			System.out.println(f.getInfo());
	}

}
