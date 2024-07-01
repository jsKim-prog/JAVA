package ch04;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문은 횟수가 정해진 반복문이다.
		// for(초기값 ; 조건식 ; 증감식){실행문1; 실행문2;}실행블럭
		
		for(int i=1; i<=10 ; i++) {//초기값 ; 조건식 ; 증감식
			//실행문
			System.out.println("1~10까지 출력 : "+i);
		}
		
		System.out.println("-----------------------------");
		
		for(int i2=0; i2<=10 ; i2+=2) { //홀수 출력하려면 초기값을 1로 수정
			System.out.println("1~10까지 짝수 출력 : "+i2);
		}
		
		System.out.println("-----------------------------");
		int sum =0; //총합의 누적 계산용
		for(int j=1; j<=100 ; j++) {
			sum+=j; //sum=sum+j
		}
		System.out.println("1~100까지 합 : "+sum);

	}

}
