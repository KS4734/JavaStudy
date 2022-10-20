package java_study.co.kr.jungbu;
import java.lang.*;
import java.util.Scanner;  // 개발의 유용한 클래스의 집합
import java.util.ArrayList;  // HashMap .. 컬렉션 프레임워크 (유용한 자료구조)

public class InnerClass {
	// Class 생성 : Java -> class로 컴파일 (javac)
	// 패키지 생성 : 클래스에 고유이름을 제공, 비슷한 성격의 클래스의 모음
	// public class : java 문서와 동일한 이름의 class, 다른 패키지에서 Import 해서 사용가능한 class
	// main 메소드 (앱) : jrc를 호출해서 작성한 순서대로 코드를 샐행 -> 순차적 언어
	
	public static void main(String[]args) {
		System.out.println("안녕");
		java.lang.String s = "dd";  // 기본 ?? 참조 ?? (O)
		java.lang.Integer i = 13;  // ??랩퍼 클래스
		
		int i2 = 44;
		int i3 = 44;
		int i4 = 44;
		int i5 = 44;
		// 기본형데이터 타입의 특징 ?? -> 면접 단골 질문
		// 1. 리터럴하게 선언 (문자그대로) : 대부분 수와 관련되어 있기 때문 
		// 2. 스택메모리에 생성됨 : 자주 사용하기 때문 (i2 ~ 5 까지 같은 44를 참조)
		
		// 참조형데이터 타입의 특징
		Object o = new Object();
		// 1. new 연산자로 생성자를 호출하면 참조형 데이터(객체) 생성 (생성자 class와 동일한 이름을 갖는 존재)
		// 2. 객체가 힙 메모리에 생성이 되고 가비지 컬렉션에 의해 정리 -> 포인터가 필요없어짐 -> 인스턴스 객체
		
	}
}
