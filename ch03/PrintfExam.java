package ch03;

import java.util.Scanner;

public class PrintfExam {

	public static void main(String[] args) {
		// System.out.printf()는 포맷팅용 출력을 진행함
		// 대부분 규격을 맞출 때 활용한다.
		
		Scanner input = new Scanner(System.in); //키보드로 입력받을 객체생성
		System.out.println("=================");
		System.out.print("이름 : ");
		String name = input.next(); //문자열 입력용
		
		System.out.print("나이 : ");
		int age = input.nextInt(); //정수입력용
		
		System.out.print("평균 : ");
		double avg = input.nextDouble(); // 실수 입력용
			
		System.out.printf("현재 당신의 이름은 %s\n당신의 나이는 %d\n평균은 %5.2f\n입니다.", name,age,avg);
		
		input.close();

	}

}
