package ch08.extended.vehicle;

public class Taxi extends Vehicle{
	String model; //카카오택시, t택시, 수원택시

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}//탈것의 자식객체
	
	public void meter() {
		System.out.println("요금을 측정합니다.");
	}

	
}
