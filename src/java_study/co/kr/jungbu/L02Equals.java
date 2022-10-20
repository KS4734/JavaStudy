package java_study.co.kr.jungbu;

import java.util.Objects;

class PersonTest {
	String name;
	int age;
	public PersonTest(String name, int age) {
		this.name = name;  // 필드 접근자
		this.age = age;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  // 동일한 객체인지
			return true;
		if (obj == null)  // 객체 != null
			return false;
		if (getClass() != obj.getClass())  // 타입이 같은지
			return false;
		PersonTest other = (PersonTest) obj;
		return age == other.age && Objects.equals(name, other.name);  // 필드가 같은지
	}
}

public class L02Equals {
	public static void main(String[] args) {
		PersonTest 김창동 = new PersonTest("김창동", 26);
		PersonTest 김창동2 = new PersonTest("김창동", 26);
		System.out.println(김창동 == 김창동2);
		System.out.println(김창동.equals(김창동2));
	}

}
