package ch08.extended.calcualtor;

public class Computer extends Calculator{

	@Override //재정의 함
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()재정의 결과");
		return super.areaCircle(r);
		//return Math.PI*r*r;
	} //자식클래스(최신형 컴퓨터)
	

}
