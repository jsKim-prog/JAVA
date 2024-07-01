package ch03;

import java.util.Scanner;

public class ConditionalExam {

	public static void main(String[] args) {
		// 3항 연산자는 if를 간단히 처리하기 위해 활용된다.
		// (조건식) ? 참 : 거짓 ;
		
		int score = 85 ;
		char grade = (score > 90) ? 'A' : 'B' ;
		
		System.out.println(score+"\t점은\n"+grade+"\t등급입니다.");
		
		System.out.println("========================");
		
		int inScore = 0 ;
				
		System.out.print("점수를 입력하세요. : ");
		Scanner input = new Scanner(System.in) ;
		inScore = input.nextInt();
		
		char outGrade = (inScore >= 90) ? 'A' : (inScore >= 80) ? 'B' : (inScore >= 70) ? 'C' : (inScore >= 60) ? 'D' : 'F' ;
		System.out.println(inScore+" 점은\n"+outGrade+" 등급입니다.");
		
		input.close();

	}

}
