package ch04;

public class WhilePrintExam {

	public static void main(String[] args) {
		// while문은 ()안의 값이 true일 때 무한반복한다.
		// while(true) -> 반복 -> while(false) -> 종료
		// 대부분 최대값이 없는 반복문일 때 활용 -> 메뉴용으로 활용(관리자에 의한 종료)
		
		int i = 1;
		while(i<=10) { //1~10까지는 true -> 11false(while문 종료)
			//반복 실행문
			
			System.out.println(i);
			i++;
			
		} //while문 종료
		
		System.out.println("프로그램이 정상 종료 되었습니다.");

	}

}
