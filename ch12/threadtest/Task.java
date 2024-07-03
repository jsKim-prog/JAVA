package ch12.threadtest;

public class Task implements Runnable{//implements Runnable 멀티스레드용
	//방법1 : 멀티스레드 구축은 Runnable 인터페이스를 사용하여 구현체로 만든다.
	
	@Override //Runnable interface 에서 제공한 추상메서드를 재정의
	public void run() {
		// 스레드로 만든 코드를 개발자가 작성
		System.out.println("implements Runnable 인터페이스 run() 추상메서드 실행됨");
		
	} 
	

}
