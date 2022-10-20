package java_study.co.kr.jungbu;

class ObjectA{
	String a = "ObjectA.a 입니다.";
}
class ObjectB extends ObjectA{
	String b = "ObjectB.b 입니다.";
}
class ObjectC extends ObjectB{
	String c = "ObjectC.c 입니다.";
}
// 상속받은 타입을 자식이라 하고 상속을 한 타입을 부모라 한다.
// 자식은 부모의 필드를 물려 받는다.
public class L05ExtendsAndType {
	public static void main(String[] args) {
		// 상속은 타입의 다향성을 만드다.
		ObjectC c = new ObjectC();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		
		ObjectB b = (ObjectC)c;  // ObjectB가 참조할 수 있는 필드만 접근 가능
		System.out.println(b.a);
		System.out.println(b.b);	
//		System.out.println(b.c);
		
		ObjectA a = c;
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
		
		Object o = c;
//		System.out.println(o.a);
//		System.out.println(o.b);
//		System.out.println(o.c);
		
		// c가 참조하느 ㄴ객체가 줄어드는 것일까요?? : 객체는 그대로고 부모의 타입만큼만 참조
		
		ObjectC o_c = (ObjectC)o;  // 캐스팅 형변환
		String s_o = (String)o;  // 객체와 상관없는 타입으로 캐스팅 변환하면 오류(심각한)가 발생! 
	}

}
