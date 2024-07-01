package ch06.ScoresCard;

public class Student { // 학생용 객체를 담당
	// 필드(값을 담는 변수들) -> 멤버변수
	String name; // 학생명
	int num; // 학번
	String sex; // 성별
	int grade; // 학년
	int classroom; // 반
	Score score; //점수객체 

	// 생성자 -> new Student(????매개값을 무얼로?) (객체생성시 활용)
	// 생성자 생략시 기본 생성자가 자동으로 만들어짐 Student st = new Student();

	// 메서드 -> 동작(CRUD)
	// C->학생등록
	// R -> 학생리스트 출력
	// U ->학생정보 수정
	// D->학생삭제

}
