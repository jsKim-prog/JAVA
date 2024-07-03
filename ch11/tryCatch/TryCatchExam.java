package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchExam {

	public static void main(String[] args) {
		// 예외처리문의 기본은 try - catch - finally
		// try -> 예외발생가능 코드
		// catch -> 예외처리 코그
		// finally -> 항상 실행되는 코드
		// 예외처리는 대부분 이클립스가 빨간 밑줄로 알려주지만
		// 실행후 발생하는 런타임예외는 경험으로 처리를 해야한다.
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class clazz = Class.forName(scanner.next());
			System.out.println("클래스가 존재합니다.");
			//예외가 발생할 수 있는 확률이 있는 코드
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace(); //예외로그 출력
		} finally {
			System.out.println("프로그램이 종료됩니다.");
		}

	}

}
