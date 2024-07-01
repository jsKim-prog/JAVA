package ch08.extended.abstractexam.overriding;

public abstract class Animal { //팀장이 만든 추상클래스
	//필드
	public String kind;
	
	//기본생성자
	
	//메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();//Abstract methods do not specify a body
	// 추상메서드 {실행코드 없이} ;로 끝남!!

}
