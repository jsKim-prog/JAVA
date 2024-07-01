package ch06.television;

//인스턴스용 : new를 이용해 객체를 생성(객체마다 다른 값을 적용)
//정적용 : new 없이 사용하는 객체(객체마다 값을 공유한다.)
public class Television {
	// 필드
	int field1; // 인스턴스용
	static int field2; // 정적용

	// 생성자

	// 메서드
	void method1() { // 인스턴스용
		field1 = 10;
		field2 = 20;
	}

	static void method2() { // 정적용
		//field1 = 10; 
		//Cannot make a static reference to the non-static field field1
		field2 = 20;
	}
	
	static void method3() {
		Television television = new Television();
		television.field1=10;
		television.method1();
		field2 = 20;
		method2();
		//field1 = 10; Cannot make a static reference to the non-static field field1
		//method1(); Cannot make a static reference to the non-static method method1() from the type Television
	}

}
