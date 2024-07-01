package ch08.extended.people;

public class Student extends People{
	//Implicit super constructor People() is undefined for default constructor. Must define an explicit constructor
	//필드
	public int studentNo;
	
	//생성자
	public Student(String name,String ssn, int stuentNo) {
		super(name,ssn); 
		//this.name = name;
		//this.ssn=ssn;
		this.studentNo=stuentNo;
	}//커스텀생성자 Student student = new Student("김", "주민번호", 2406)
	
	//메서드

}
