package java_study.co.kr.jungbu;


// 프로그래밍과 객체와 타입 제사용과 유지 보수

// 객체지향 문법을 사용하지 않고 자동차를 구현
// 계획 : 기능 구현 (앞으로 뒤로 움직이다. 멈춘다. 와이퍼가 유리창을 닦는다.  ...  동작 -> method), 재원을 정의(바퀴, 타이어, 와이퍼, 브레이크 페달, 엑셀페달, 헨들, ... 필드)
// 필드 (field), 프로퍼티 (property), 속성 (attribute)
// 재원이 있고 동작하는 것을 객체라 하고 이런 객체의 설계도를 타입이라 한다.

// 엔진에 기능을 추가 : 소리

// 코더의 생각 
// 객체지향 문법은 설계시 시간이 너무 오래걸려서 구현시 단점 -> 재사용을 목적으로 프로그래밍 하는 것은 멍청하다 -> 플렛폼의 변화가 많아서 막코딩으로 빠르게 구현하는것이 더 좋다. -> 대부분 혼자서 
// 프로그래머는 어떤 코드던 재사용을 전재로 작업 -> 습관을 가지면 모든 코드가 객체지향 문법으로 설계가 된다.

// 단점 -> 배우기 어렵다(스프링) 고급 개발자를 사용 (기업 돈을 많이 사용)

class 엔진 {
	int 휘발류;
	int bpm;  // ???
	
	소리 부르릉 = new 소리();
	class 소리 {
		String s = "부부붕웅부우우웅붕";
	}
}

class BmwS3 extends 엔진{
	public String name = "bmw 3시리즈";
	public 엔진 en = new 엔진() ;
	
	class 바퀴 {}
	class 타이어 {}
	class 브레이크페달 {
		int press;  // 필드는 기본값이 있다. 기본형은 0, 참조형은 null
	}
	class 핸들 {
		int turn;  // -왼쪽 +오른쪽
	}
	class 엑셀 {
		int press;
	}
	class 엔진 {
		int 휘발류;
		int bpm;  // ???
		
		소리 부르릉 = new 소리();
		class 소리 {
			String s = "부릉부릉";
		}
	}
	
	public void move() {}
	public void turn() {}
	public void stop() {}
}

class BmwS5{
	public String name = "bmw 5시리즈";
	
	class 바퀴 {int 반지름 = 20;}
	class 타이어 {}
	class 브레이크페달 {
		int press;  // 필드는 기본값이 있다. 기본형은 0, 참조형은 null
	}
	class 핸들 {
		int turn;  // -왼쪽 +오른쪽
	}
	class 엑셀 {
		int press;
	}
	class 엔진 {
		int 휘발류;
		int bpm;  // ???
		int a;
		
		소리 부르릉 = new 소리();
		class 소리 {
			String s = "부릉부릉";
		}
	}
	
	public void move() {}
	public void turn() {}
	public void stop() {}
}

class BmwS7{
	public String name = "bmw 7시리즈";
	
	class 바퀴 {int 반지름 = 20;}
	class 타이어 {}
	class 브레이크페달 {
		int press;  // 필드는 기본값이 있다. 기본형은 0, 참조형은 null
	}
	class 핸들 {
		int turn;  // -왼쪽 +오른쪽
	}
	class 엑셀 {
		int press;
	}
	class 엔진 {
		int 휘발류;
		int bpm;  // ???
		int a;
		int b;
		
		소리 부르릉 = new 소리();
		class 소리 {
			String s = "부릉부릉";
		}
	}
	
	public void move() {}
	public void turn() {}
	public void stop() {}
}


public class L04Extends {

	public static void main(String[] args) {

	}

}
