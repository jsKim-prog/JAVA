package ch13.nongeneric;

public class BoxExam {

	public static void main(String[] args) {
		//Object 타입은 최상위 클래스로 모든 타입으로 자동타입, 강제타입 변환이 된다.
		//자동타입변환 후에 사용하려면 강제타입으로 변환하여 활용한다.
		//예외 : System.out.println(int|String|double) 은 자동으로 강제 타입변환코드가 들어있다.
		
		// 강제타입변환 테스트		
		Box box = new Box(); //기본생성자로 객체생성
		box.setObject("문자열");//자동타입변환으로 String 처리됨
		System.out.println((String)box.getObject()); //*println도 자동타입변환을 알아서 한다!
		String name = (String) box.getObject(); //강제타입변환
		
		Box boxI = new Box();
		boxI.setObject(1234); //Object 타입에 정수 대입
		Integer value = (Integer) boxI.getObject(); //강제타입변환
		
		Box boxA = new Box();
		boxA.setObject(new AppleDTO()); //자동타입변환
		//Box boxA = new AppleDTO(); //다형성(위의 것도)
		AppleDTO appleDTO = (AppleDTO) box.getObject(); //강제타입변환
		

	}

}
