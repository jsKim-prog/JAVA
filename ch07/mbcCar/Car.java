package ch07.mbcCar;

import ch06.car.Engine;
import ch07.hankook.SnowTire;
import ch07.kumho.EchoTire;
//import ch07.kumho.Tire; The import ch07.kumho.Tire collides with another import statement
import ch07.nexen.*; //넥센에서 만든 클래스는 모두 가져온다.


public class Car {
	//필드
	ch07.hankook.Tire hTire = new ch07.hankook.Tire(); //한국타이어 패키지에서 가져옴. import ch07.hankook.Tire;
	ch07.kumho.Tire kTire = new ch07.kumho.Tire(); //금호타이어 패키지에서 가져옴.(import와 같음->직관적 표현)
	SnowTire Stire = new SnowTire();
	EchoTire eTire = new EchoTire();
	
	BigWidthTire bTire = new BigWidthTire();
	SportsTire sTire = new SportsTire();
	
	Engine hengine = new Engine();
	
	//생성자
	
	//메서드
}
