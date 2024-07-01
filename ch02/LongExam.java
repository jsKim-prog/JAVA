package ch02;

public class LongExam {

	public static void main(String[] args) {
		// long타입은 int 타입의 2배인 64 bit 값을 갖는다.
		// 대부분 금융, 은행, 증권 등 돈에 관련된 변수 타입으로 사용된다.
		//초기값 입력시 int와 차이를 주기위해 숫자 뒤에 l 또는 L을 붙인다.
		
		long var1 = 10; //int 범위에서는 L 생략 가능
		long var2 = 20L;
		long var3 = 22222222222L; //int 범위 초과시 L은 필수
		//The literal 22222222222 of type int is out of range

	}

}
