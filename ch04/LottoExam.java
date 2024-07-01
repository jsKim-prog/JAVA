package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성
		// 몇개가 맞았는지 파악
		
		Scanner input = new Scanner(System.in); //키보드로 입력받는 객체생성
		System.out.println("1~45 중 6개의 정수를 입력하세요.");
		
		System.out.print("첫번째 숫자 : "); //6개의 정수를 myNum으로 입력받음
		int myNum1 = input.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int myNum2 = input.nextInt();
		
		System.out.print("세번째 숫자 : ");
		int myNum3 = input.nextInt();
		
		System.out.print("네번째 숫자 : ");
		int myNum4 = input.nextInt();
		
		System.out.print("다섯번째 숫자 : ");
		int myNum5 = input.nextInt();
		
		System.out.print("여섯번째 숫자 : ");
		int myNum6 = input.nextInt();
		
		int cnum1 = (int)(Math.random()*45) + 1; //1~45중 랜덤숫자 cnum으로 저장
		int cnum2 = (int)(Math.random()*45) + 1;
		int cnum3 = (int)(Math.random()*45) + 1;
		int cnum4 = (int)(Math.random()*45) + 1;
		int cnum5 = (int)(Math.random()*45) + 1;
		int cnum6 = (int)(Math.random()*45) + 1;
		
		int x = 0; //맞은 개수 변수생성
		
		//입력값과 랜덤숫자 비교
		if(myNum1==cnum1 || myNum1==cnum2 || myNum1==cnum3|| myNum1==cnum4|| myNum1==cnum5|| myNum1==cnum6) {
			++x;
		}
		if(myNum2==cnum1 || myNum2==cnum2 || myNum2==cnum3|| myNum2==cnum4|| myNum2==cnum5|| myNum2==cnum6) {
			++x;
		}
		if(myNum3==cnum1 || myNum3==cnum2 || myNum3==cnum3|| myNum3==cnum4|| myNum3==cnum5|| myNum3==cnum6) {
			++x;
		}
		if(myNum4==cnum1 || myNum4==cnum2 || myNum4==cnum3|| myNum4==cnum4|| myNum4==cnum5|| myNum4==cnum6) {
			++x;
		}
		if(myNum5==cnum1 || myNum5==cnum2 || myNum5==cnum3|| myNum5==cnum4|| myNum5==cnum5|| myNum5==cnum6) {
			++x;
		}
		if(myNum6==cnum1 || myNum6==cnum2 || myNum6==cnum3|| myNum6==cnum4|| myNum6==cnum5|| myNum6==cnum6) {
			++x;
		}
		
		//결과출력
		
		System.out.println("===========================");
		System.out.println("이번주의 당첨번호입니다.");
		System.out.println(cnum1+"\t"+cnum2+"\t"+cnum3+"\t"+cnum4+"\t"+cnum5+"\t"+cnum6);
		System.out.println("입력번호");
		System.out.println(myNum1+"\t"+myNum2+"\t"+myNum3+"\t"+myNum4+"\t"+myNum5+"\t"+myNum6);
		
		System.out.println("========== 결과 =============");
		if(x>=1 && x<=6) {
			System.out.println("축하합니다. 번호가 "+x+"개 맞았습니다.");
		} else if(x==0) {
			System.out.println("아쉽게도 낙첨입니다.");
		} else {
			System.out.println("시스템 오류입니다.");
		}
		
		input.close();

	}

}
