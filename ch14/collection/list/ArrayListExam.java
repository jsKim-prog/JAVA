package ch14.collection.list;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 Arraylist, Vector, Linkedlist 세 가지를 주로 사용한다.
		// list 컬렉션은 배열대신 활용도가 높다.(길이가 자유롭다.)
		// list<String> 는 강한 타입체크로 String 만 들어감
		// List<String> list = new ArrayList<String>(); -> 10개가 기본값
		
		List<String> listS = new ArrayList<String>(); //다형성
		listS.add("Java"); //0번 인덱스
		listS.add("Oracle"); //1번 데이터베이스 
		listS.add("JDBC"); //2번 java+DB연동 
		listS.add("HTML, CSS, JS"); //3번 프론트
		listS.add("jsp"); //4번 java+DB+front
		listS.add("Tomcat"); //서버 프로그래밍(servlet)
		listS.add("리눅스"); //배포 서버
		listS.add(5,"servlet"); //jsp+java
		listS.add("AWS"); //가상배포서버
		
		int size = listS.size();
		System.out.println("총 객체수 : "+size);
		System.out.println("-------------------------------");
		
		String skill = listS.get(2); //2번 인덱스 값을 가져와 skill 변수에 넣음
		System.out.println("두 번째 인덱스값 : "+skill);
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("jsp");
		
		System.out.println("------------전체출력-------------");
		for(int i = 0;i<listS.size();i++) {
			System.out.println(i+"번째 값:"+listS.get(i));
		}
		
		
		System.out.println("----for each로 전체출력(index -X)----");
		for(String str:listS) { 
			System.out.println(str);
		}
		
		
		

	}

}
