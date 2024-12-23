package ch09.interfaceExam;

public class Television implements RemoteControl{
	//리모컨 인터페이스를 사용하는 구현체(*상속의 자식개념)
	//*The type Television must implement the inherited abstract method RemoteControl.setVolume(int)
	
	//필드
	private int volume; //숫자로된 볼륨값
	//기본생성자 : Television television = new Television();
	
	//메서드

	@Override //재정의(위에서 만든 메서드를 동작시킨다.)-*추상메서드 필수구현
	public void turnOn() {
		// 전원을 켠다.
		System.out.println("TV의 전원을 켭니다.");		
	}

	@Override
	public void turnOff() {
		// 전원을 끈다.
		System.out.println("TV의 전원을 끕니다.");	
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨조절
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}//--if()
		System.out.println("현재 TV의 볼륨 : "+volume);
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) { 
			System.out.println("TV를 무음 처리 합니다.");
		}else {
			System.out.println("TV의 무음 처리 해제");
		}
	}
	

}
