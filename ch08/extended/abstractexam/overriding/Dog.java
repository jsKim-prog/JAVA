package ch08.extended.abstractexam.overriding;

public class Dog extends Animal{
	//The type Dog must implement the inherited abstract method Animal.sound()

	@Override
	public void sound() {
		System.out.println("멍멍!!");
		
	}
	
	
	

}
