package ch08.extended.vehicle;

public class Driver {
	//운전자 서비스 클래스
	
	public void drive(Vehicle vehicle) {
		//Vehicle vehicle = new Vehicle(); ->매개변수로 받으며 생략이 되어 있다.
		vehicle.name="탈것";
		vehicle.run();
		Bus bus = (Bus) vehicle; //(Bus)강제타입변환
		bus.name = "시내버스";
		bus.type="전기형";
		bus.busCard();
		
		Taxi taxi = (Taxi)vehicle; //(Taxi)강제타입변환
		taxi.model="카카오택시";
		taxi.meter();
	}

}
