package ch13.genericmethod;

public class Box<T> /* extends Object */{
	private T t;
	
	public T get() {
		return t;
	}//getter
	
	public void set(T t) {
		this.t=t;
	}//setter

}
