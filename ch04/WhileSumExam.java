package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1~100까지의 합을 구하시오. -> 5050
		
		int i = 1; //반복용 상자
		int sum = 0; //합을 구하는 상자
		
		while(i<=100) { // 1~100까지 반복
			sum+=i; // i값이 1~100까지 나오니까 sum에 누적
			//System.out.println(i+"+"+(sum-i)+"="+sum); //과정출력용
			i++; //1~100까지 i값 증가
		} //while문 종료
		
		System.out.println("1~100까지의 합은 : "+sum);

	}

}
