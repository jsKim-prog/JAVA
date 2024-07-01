package ch08.extended.people;

public class MBCSchoolExam {

	public static void main(String[] args) {
		// 상속관계의 객체를 가져와 출력
		// 생성자를 활용해 본다. -> 객체 생성시 초기값을 줌.
		
		// 부모객체를 사용해 보자.
		People people = new People("부모", "엄마주민번호");
		System.out.println(people.name+","+people.ssn);
		
		Student student = new Student("자식", "자식주민번호", 1234);
		System.out.println(student.name+","+student.ssn+","+student.studentNo);
		
		Teacher teacher = new Teacher("선생님", "선생님주민번호", 39);
		System.out.println(teacher.name+","+teacher.ssn+","+teacher.employeeNo);
		
		//다형성
		People multi = new Student("김지선", "학생주번", 1);
		People multi2 = new Teacher("김기원", "김기원주번", 2);
		System.out.println(multi.name);
		System.out.println(multi.ssn);

	}

}
