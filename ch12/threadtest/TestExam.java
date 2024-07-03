package ch12.threadtest;

public class TestExam {

	public static void main(String[] args) {
		// main 스레드
		Runnable tk = new Task(); //다형성
		//Runnable 타입의 tk 변수에 Task() 객체를 연결
		//스래드에서 실행할 코드를 객체로 받음
		
		Thread th = new Thread(tk);
		//Thread 타입의 th 변수의 스레드 객체를 tk를 활용하여 생성
		//스레드가 만들어짐
				
		th.start(); //스래드 시작
		//만든 스레드를 시작
		
		System.out.println("---------익명의 구현체-----------");
		Thread anonymousTH = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명의 구현체로 스레드 생성됨");
				
			}
		});
		
		anonymousTH.start();

	}

}
