package ch08.extended.car;

public class SportsCar extends Car{//자식

	@Override
	public void speedup() {
		speed+=5;
	} 
	
	//@Override -->재정의용인지 검토
	//Cannot override the final method from Car
	public void stop1() {
		
	}
	

}
