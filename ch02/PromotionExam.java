package ch02;

import java.util.Scanner; //다른 패키지에 있는 코드를 가져옴.

public class PromotionExam {

	public static void main(String[] args) {
		// 자동타입 변환(Promotion)은 작은 크기의 타입을 큰 크기 타입으로 자동 변환
		// byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
		// 예를들어 국, 영, 수, 사, 과 과목은 byte -> 총점 int -> 평균 double
		
		byte kor = 0;
		byte eng = 0;
		byte math = 0;
		byte sol = 0;
		byte sci = 0;
		
		//키보드로 점수를 입력받는 곳
		System.out.println("점수를 입력하세요. ");
		Scanner input = new Scanner(System.in); //키보드로 입력받는 객체 생성 - 암기할 것
		System.out.print("국어점수 : ");
		kor = input.nextByte(); //스캐너 객체에서 키보드로 입력받은 값을 Byte로 처리
		System.out.print("영어점수 : ");
		eng = input.nextByte();
		System.out.print("수학점수 : ");
		math = input.nextByte();
		System.out.print("사회점수 : ");
		sol = input.nextByte();
		System.out.print("과학점수 : ");
		sci = input.nextByte();
		
		System.out.println("  ");
			
		System.out.println("   현재 점수표 ");
		System.out.println("--------------");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("사회 : "+sol);
		System.out.println("과학 : "+sci);
		
		//byte total = 0; 연산 시 기본타입은 int(자동타입변환)
		int total = kor+eng+math+sol+sci;
		System.out.println("----총점------");
		System.out.println("총점 : "+total);
		
		double avg = 0.0;
		avg = total/5;
		System.out.println("----평균------");
		System.out.println("평균 : "+avg);
		
		if(avg>=60) {
			//참
			System.out.println("----합격을 축하드립니다.-----");
			System.out.println("현재점수 :"+avg+"점");
			System.out.println("합격점수 : 60점 이상");
		}
		else {
			//거짓
			System.out.println("----불합격하셨습니다.-----");
			System.out.println("현재점수 :"+avg+"점");
			System.out.println("합격점수 : 60점 이상");
		}
		
		input.close();

	}

}
