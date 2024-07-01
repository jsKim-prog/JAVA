package ch06.car;

public class Car {
	//자동차 객체용 클래스
	
	//필드(멤버변수)
	//고유데이터
	String company ; //제조회사
	String model;    //모델명
	String color;    //색상
	int maxSpeed;    //최고속도	
	//상태
	int speed;       //현재속도
	int rpm;         //현재 엔진회전수
	boolean start;   //시동유무	
	//부품
	Body body;
	Engine engine;
	Tire tire;
	
	//생성자(new) ->Source -> .. Constructor Using Field
	public Car() {
		
	}//기본생성자는 자동으로 생성안됨
	
	public Car(String company, String model, String color, int maxSpeed, boolean start) {
		//super(); //상속에 관련된 메서드
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.start = start;
	}

	@Override //재정의 코드(객체를 문자열로 출력)
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + ", rpm=" + rpm + ", start=" + start + "]";
	}
	
		
	//메서드(동작)
	
	

}
