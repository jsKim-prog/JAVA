package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 입력받아 남녀파악용
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("주민번호 7번째 숫자 입력 : ");		
		int ssn = input.nextInt();
		String result = new String();
		
		if(ssn>=10 && ssn<0) {
			result = "입력오류";
		} else if(ssn%2==0){
			result = "여성";
		} else {
			result = "남성";
		}
		
		System.out.println("입력숫자 : "+ssn);
		System.out.println("결과 : "+result);
		
		System.out.println("당신은 여성입니까? Yes, No로 입력하세요. ");
		String answer = input.next(); // 문자열 답변 입력받아 answer 변수에 담기
		String result2 = new String(); // 결과용 문자변수 객체생성
		
		if(answer.equalsIgnoreCase("Yes")) {//Yes로 입력받은 경우 참
			result2 = "여성";
		} else if(answer.equalsIgnoreCase("No")){
			result2 = "남성";
		} else { //그 외 모든 문자
			result2 = "알 수 없음";
		}
		
		System.out.println("입력문자 : "+answer);
		System.out.println("당신의 성별은 "+result2+" 입니다.");
		
		input.close();
 
	}

}
