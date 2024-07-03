package ch12.threadname;

public class ThreadNameExam { //방법2:클래스 상속받아 스레드 처리

	public static void main(String[] args) {
		// 스레드의 이름을 정하면 버그 수정에 좋다.
		
		Thread mainThread = Thread.currentThread();
		//사용중인 스레드 객체 얻기
		
		System.out.println("mainThread.getName():"+mainThread.getName());
		//메인스레드의 객체를 가져와 이름을 출력하는 메서드 실행
		
		ThreadA thA = new ThreadA(); //스레드 A를 객체로 만듦
		System.out.println("new ThreadA().getName():" + thA.getName());
		thA.start();
		
		ThreadB thB = new ThreadB(); //스레드 A를 객체로 만듦
		System.out.println("new ThreadB().getName():" + thB.getName());
		thB.start();

	}

}
