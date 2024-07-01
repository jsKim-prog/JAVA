package ch08.extended.tire;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주행 테스트
		// 결론 Tire tire = new Tire();
		//     Tire tire = new HankookTire();
		//     Tire tire = new KumhoTire();  -> 다형성
		
		Car car = new Car(); // 서비스 객체
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 30; i++) {
			// 30번 주행
			int problemLocation = car.run();
			// 0이면 정상 1~4는 고장(위치정보)

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 타이어가 펑크!!!");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.OEM타이어");
				System.out.print(">>>");
				int select1 = scanner.nextInt();

				if (select1 == 1) {
					car.fl = new HankookTire(90, "앞왼");
					System.out.println("한국타이어 교체성공!!");
				} else if (select1 == 2) {
					car.fl = new KumhoTire(90, "앞왼");
					System.out.println("금호타이어 교체성공!!");
				} else {
					car.fl = new Tire(90, "앞왼");
					System.out.println("OEM타이어 교체성공!!");
				} // --if()
				System.out.println("======================");
				break;
			case 2:
				System.out.println("앞오른쪽 타이어가 펑크!!!");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.OEM타이어");
				System.out.print(">>>");
				int select2 = scanner.nextInt();

				if (select2 == 1) {
					car.fr = new HankookTire(90, "앞오");
					System.out.println("한국타이어 교체성공!!");
				} else if (select2 == 2) {
					car.fr = new KumhoTire(90, "앞오");
					System.out.println("금호타이어 교체성공!!");
				} else {
					car.fr = new Tire(90, "앞오");
					System.out.println("OEM타이어 교체성공!!");
				} // --if()
				System.out.println("======================");
				break;

			case 3:
				System.out.println("뒤왼쪽 타이어가 펑크!!!");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.OEM타이어");
				System.out.print(">>>");
				int select3 = scanner.nextInt();

				if (select3 == 1) {
					car.bl = new HankookTire(90, "뒤왼");
					System.out.println("한국타이어 교체성공!!");
				} else if (select3 == 2) {
					car.bl = new KumhoTire(90, "뒤왼");
					System.out.println("금호타이어 교체성공!!");
				} else {
					car.bl = new Tire(90, "뒤왼");
					System.out.println("OEM타이어 교체성공!!");
				} // --if()
				System.out.println("======================");
				break;
			case 4:
				System.out.println("뒤오른쪽 타이어가 펑크!!!");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.OEM타이어");
				System.out.print(">>>");
				int select4 = scanner.nextInt();

				if (select4 == 1) {
					car.br = new HankookTire(90, "뒤오");
					System.out.println("한국타이어 교체성공!!");
				} else if (select4 == 2) {
					car.br = new KumhoTire(90, "뒤오");
					System.out.println("금호타이어 교체성공!!");
				} else {
					car.br = new Tire(90, "뒤오");
					System.out.println("OEM타이어 교체성공!!");
				} // --if()
				System.out.println("======================");
				break;
			}// --switch()
			
			System.out.println("======== 정상주행 =======");
		} // --for()
	}// --main()

}// --class()
