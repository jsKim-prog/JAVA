package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현클래스를 이용해 본다.

		RemoteControl.changeBattery(); //*static은 new 없이 불러옴
		System.out.println("리모컨 인터페이스를 사용합니다.");
		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		RemoteControl rc = null; // 인터페이스를 변수에 연결(*초기화!)
		
		while (condition) {
			System.out.println("-----------------------");
			System.out.println("1. TV | 2. 오디오 | 3. 스마트TV | 4. 종료");
			System.out.println("-----------------------");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1: // **다형성
				rc = new Television(); // RemoteControl rc = new Television(); *->new를 해서 아래 default 메서드 사용가능
				rc.turnOn(); 
				
				rc.turnOff();
				rc.setMute(true); //음소거 on
				rc.setMute(false); //음소거 off
				break;
			case 2: // **다형성
				rc = new Audio(); // RemoteControl rc = new Audio();
				rc.turnOn();
				rc.turnOff();
				break;
			case 3: 
				rc = new SmartTelevision(); // RemoteControl rc = new SmartTelevision();
				rc.turnOn();
				Searchable se = new SmartTelevision(); //두번째 인터페이스 연동
				System.out.println("인터넷검색을 시작합니다.");
				System.out.print(">>>");
				String sc = scanner.next();
				se.search(sc);
				rc.turnOff();
			case 4:
				condition=false;
				break;
			default:
				System.out.println("1~2값만 넣어주세요.");
			}// --switch()
		//	rc.turnOn(); 
		//	rc.turnOff();  *뺄수 있지만 종료시도 실행됨
		} // --while()
		scanner.close();
	}// --main()

}
