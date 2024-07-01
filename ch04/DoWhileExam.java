package ch04;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// 업앤다운 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성한다.(1~50)
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 랜덤숫자를 판단하여 up/down을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤숫자가 일치하면 프로그램 종료와 함께 당첨 사실을 알린다.
		// 3번 안에 성공시 상품 증정용 코드 추가 
		
		int answer = (int)(Math.random()*50)+1; //컴퓨터가 랜덤 숫자를 생성한다.(1~50)
		
		Scanner input = new Scanner(System.in); // 키보드로 입력받는 객체 생성
		int question = 0; //사용자가 입력하는 숫자 보관용
		int count = 0; //사용자가 숫자 입력한 횟수 카운트용
		
		System.out.println("==============================");
		System.out.println("Up&Down 게임에 오신 것을 환영합니다.");
		System.out.println("3번 안에 숫자를 맞히시면 상금을 드립니다.");
		System.out.println("상품제공은 관리자에게 문의하세요.");
		System.out.println("==============================");
		do {
			System.out.println("1부터 50사이의 숫자를 입력하세요.");
			question = input.nextInt(); // 사용자가 숫자를 키보드로 입력한다.
			count++; //사용자가 입력한 횟수를 더한다.
			
			if(question>answer) { //사람이 쓴 숫자가 크니 답은 아래쪽에 있다.
				System.out.println("Down");
			}else if(question<answer) { //사람이 쓴 숫자가 작으니 답은 위쪽에 있다.
				System.out.println("Up");
			} //if문 종료
			
		} while(question!=answer) ; //do~while문 종료
		//랜덤 숫자와 사용자가 입력한 숫자가 같지 않으면 do문으로 올라감
		//랜덤 숫자와 사용자가 입력한 숫자가 같으면 내려옴		
		//System.out.println("검토용 : "+count);
		
		System.out.println("정답입니다. : "+answer);
		System.out.println(count+"번만에 맞히셨습다.");
		if(count<=3) { // 사용자가 숫자를 입력한 횟수에 따른 보상 판별 			
			System.out.println("고객상담실에서 상금을 수령해 가세요.");
		} else {
			System.out.println("상금을 놓치셨네요. 수고하셨습니다.");
		} //count if문 종료
		
		input.close();

	} 

}
