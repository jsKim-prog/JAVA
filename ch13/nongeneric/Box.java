package ch13.nongeneric;

public class Box /* extends Object */{
	//필드
	private Object object; //최상위 객체를 필드로 사용(JRE Library 모두 불러옴)

	//기본생성자
	
	//메서드
	public Object getObject() { //getter
		return object;
	}

	public void setObject(Object object) { //setter
		this.object = object;
	}
	

}
