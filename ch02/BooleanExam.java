package ch02;

public class BooleanExam {

	public static void main(String[] args) {
		// 1byte(8bit) 값을 갖는다. 참(true)/거짓(false) 처리용
		// 컴퓨터는 if 문을 이용하여 참과 거짓을 처리하는 데 활용됨
		//"false"는 문자열이고 false는 거짓 값을 표현
		
		boolean stop = false; // stop 변수에 거짓 값을 갖는다.
		boolean start = true; // start 변수에 참 값을 갖는다. 
		
		if(stop) {//if(조건){참처리} else{거짓처리}
			//참값(true)
			System.out.println("정지합니다.");
		}else {
			//거짓값(false)
			System.out.println("달립니다.");
		}
		
		if(start) {
			System.out.println("출발합니다.");  //true
		}
		else {
			System.out.println("중지합니다.");  //false
		}
		

	}

}
