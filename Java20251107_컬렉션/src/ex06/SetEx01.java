package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("kor");
		set.add("eng");
		set.add("eng");
		set.add("math");
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(new Person("홍길동"));
		set.add(new Person("홍길동"));
		set.add(new Person("박길동"));
		
		System.out.println(set);
		
		for(Object obj : set)
			System.out.println(obj);
		System.out.println("---------------");
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	@Override
	public String toString() {	
		return name;
	}
	
	// equals() 재정의: 이름이 같으면 같은 객체로 판단
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 같은 객체면 true
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    // hashCode() 재정의: name을 기준으로 해시값 생성
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}








