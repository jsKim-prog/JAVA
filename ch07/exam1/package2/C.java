package ch07.exam1.package2;

import ch07.exam1.package1.A;
import ch07.exam1.package1.B;

public class C {
	A a; //default는 다른 패키지는 안됨
	B b; //public은 처리하면 접근가능
	
	A a1 = new A(true);
	//A a2 = new A(3); //default 생성자
	//The constructor A(int) is not visible
	//A a3 = new A("문자열"); //private 생성자
	//The constructor A(int) is not visible
	

}
