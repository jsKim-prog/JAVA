package ch12.shareThread;

public class Calculator {
	//공유계산기
	
	private int memory;

	public int getMemory() { //값을 출력
		return memory;
	}

	public synchronized void setMemory(int memory) { //값 입력용
		//synchronized : 임계영역 설정으로 누가 쓰고 있으면 대기!!!
		this.memory = memory;
		try {
			Thread.sleep(2000);//2초간 딜레이
		} catch (InterruptedException e) {
			System.out.println("2초간 딜레이 중 예외발생");
			//e.printStackTrace();
		} //--try()
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		//2초 뒤 메모리 필드값 출력
	}
	

}
