package java_study.co.kr.jungbu;

import java.util.ArrayList;
import java.util.List;

public class L16StreamAPIEx2 {

	// 쇼핑몰에서 판매하는 상품 자료 type = Variable Object(VO), Data Transfer Object (DTO)
	// key:value로 되어있는 가장 인기 있는 자료구조! JavaScriptObjectNotation : 자바스크립트 객체 명세서(객체 설명서) -> 리터러 표기법으로 만들어짐 -> 
	class Product{
		// class의 전역에 선언된 변수 : 전역변수, 객체의 필드로 생성됨
		String name;
		int price = 0;
		int category;  // 0: 식품, 1: 의류, 2: 가구, 3: 문구류, 4: 침구류 (약속)
		int quantity = 10;  // 수량
		// 생성자로 필드를 초기화 : 생성자는 new 연산자로 호출하면 객체를 반환하는 타입의 함수다.
		public Product( String name, int price, int category) {
			// 필드 접근자 this
			this.name = name;
			this.price = price;
			this.category = category;
		}
		public Product( String name, int price, int category, int quantity) {
			this.name = name;
			this.price = price;
			this.category = category;
			this.quantity = quantity;
		}
		public int sum(int a, int b) {return a+b;}  // 함수는 반환하는 data의 type을 명시한다.
	}
	
	class ProductDTO{
		//class의 전역에 선언된 변수 : 전역변수, 객체의 필드로 생성됨(속성)
		String name=null;
		int price=0;
		int category; //0:식품,1:의류,2:가구,3:문구류,4:침구류 (약속)
		int quantity=10; //수량
		//생성자로 필드를 초기화 : 생성자는 new 연산자로 호출하면 객체를 반환하는데 이름이 반환하는 타입인 함수다.
		public ProductDTO( String name,int price, int category) {
			//필드 접근자! this
			this.name=name;
			this.price=price;
			this.category=category;
		}
		public ProductDTO( String name,int price, int category, int quantity) {
			//필드 접근자! this
			this.name=name;
			this.price=price;
			this.category=category;
			this.quantity=quantity;
		}		
	}

	//enum Cate{식품,의류,가구,문구,침구} //각 필드가 고유값을 갖는 상수기 때문에 수를 사용하는 다른 상수와 섞어 쓰지 않는다.(단점 자바 내부에서만 사용가능)
		interface Cate{ //db에 저장하는 분류가 보통 수로 되어 있기 때문에 수로 된 상수를 사용
			public static int 식품=0;
			public static int 의류=1;
			public static int 가구=2;
			public static int 문구=3;
			public static int 침구=4;
		}
		
		
		@Override
		public String toString() {
			return "ProductDTO:{name:" + name + ", price:" + price + ", category:" + category + ", quantity:" + quantity
					+ "}";
		}
		
	public static void main(String[] args) {
		L16StreamAPIEx2 ex2=new L16StreamAPIEx2();
		List<ProductDTO> products=new ArrayList<ProductDTO>();
		products.add(ex2.new ProductDTO("허쉬 초콜릿", 1000, Cate.식품));
		products.add(ex2.new ProductDTO("허쉬 초콜릿 우유", 1200, Cate.식품, 5));
		products.add(ex2.new ProductDTO("바나나 단지 우유", 1500, Cate.식품, 3));
		products.add(ex2.new ProductDTO("돼지바", 900, Cate.식품, 15));
		products.add(ex2.new ProductDTO("하겐다즈 바닐라", 5000, Cate.식품,11));
		products.add(ex2.new ProductDTO("소세지 도시락", 3500, Cate.식품,3));
		products.add(ex2.new ProductDTO("도시락 컵라면", 800, Cate.식품,50));
		
		products.add(ex2.new ProductDTO("hp 연필", 500, Cate.문구,200));
		products.add(ex2.new ProductDTO("지우개", 500, Cate.문구,50));
		products.add(ex2.new ProductDTO("볼펜", 1000, Cate.문구,100));
		products.add(ex2.new ProductDTO("화이트 지우개", 2500, Cate.문구,3));
		
		products.add(ex2.new ProductDTO("흰색 셔츠", 10000, Cate.의류,0));
		products.add(ex2.new ProductDTO("나이키 반팔 티", 25000, Cate.의류,5));
		products.add(ex2.new ProductDTO("나이키 신발", 110000, Cate.의류,2));
		products.add(ex2.new ProductDTO("아디다스 신발", 95000, Cate.의류,2));
		
		products.add(ex2.new ProductDTO("여름용 이불", 25000, Cate.침구,1));
		products.add(ex2.new ProductDTO("솜 베게", 2000, Cate.침구,10));
		products.add(ex2.new ProductDTO("대나무 베게", 2000, Cate.침구,0));
		products.add(ex2.new ProductDTO("침대 커버 퀸", 15000, Cate.침구,3));
		
		products.add(ex2.new ProductDTO("행거", 60000, Cate.가구,1));
		products.add(ex2.new ProductDTO("책상", 45000, Cate.가구,1));
		products.add(ex2.new ProductDTO("듀오백의자", 145000, Cate.가구,3));
		
		System.out.println(products.toString());

	}

}
