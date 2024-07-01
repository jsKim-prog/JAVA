package ch04;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// if문은 조건에 맞는 참, 거짓을 판단하여 실행흐름을 변경한다.
		// if(조건식){실행코드;} -> 실행코드로 쌓여있는 중괄호를 블럭이라고 한다.
		
		Scanner input = new Scanner(System.in); // 키보드로 입력받는 객체 생성
		System.out.print("귀하의 평균을 입력하세요. : ");
		
		double avg = input.nextDouble(); // 키보드로 실수를 입력받아 avg 변수에 넣음
		char grade = 'F' ; // 학점에 대한 초기값과 변수 선언
		
		if(avg > 100) {
			System.out.println("입력값이 오류입니다.");
		}
		if(avg >= 90 ) { //avg가 90점 이상이면 a등급으로 출력			
			grade = 'A'; //A학점 삽입
		} else if(avg < 90 && avg >= 80) { // avg가 90점 미만이면 b등급으로 출력
			grade = 'B'; // B학점 삽입
		} else if(avg < 80 && avg >= 70) { // avg가 80점 미만이면 c등급으로 출력
			grade = 'C'; // C학점 삽입
		} else if(avg < 70 && avg >= 60) { // avg가 70점 미만이면 d등급으로 출력
			grade = 'D'; // D학점 삽입
		} else {
			grade ='F'; //나머지 F학점
					}
		
		
		System.out.println("입력된 점수는 : "+avg); 
		System.out.println("현재등급 : "+grade); 
		
		input.close();

	}

}
