package ch08.extended.abstractexam;

public class PhoneExam {

	public static void main(String[] args) {
		//Phone phone = new Phone("kim") ; 
		//Cannot instantiate the type Phone
		//Phone 클래스에 abstract가 되어 있어 객체로 사용할 수 없다.
		//사용하려면 구현클래스(조원) 상속받아 활용해야 한다.
		
		SmartPhone smartPhone = new SmartPhone("Kim");
		smartPhone.turnOn(); //부모
		System.out.println(smartPhone.owner); //부모
		smartPhone.internetSearch(); //자식
		smartPhone.turnOff(); //부모

	}

}
