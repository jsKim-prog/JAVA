package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// Set 인터페이스에는 HashSet, LinkedHashSet, TreeSet 등이 있다.
		// Set 은 중복되지 않는 인덱스가 없는 객체를 담아놓은 구슬 주머니임
		
		Set<String> setHashSet = new HashSet<String>();
		setHashSet.add("Java");
		setHashSet.add("Oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("JavaScript");
		setHashSet.add("JDBC"); //중복으로 안들어감
		
		int size = setHashSet.size(); //객체 수를 반환
		System.out.println("set 객체수: "+size);
		
		System.out.println("------- 인덱스가 없어서 for문으로 전체출력 안됨 ------");
		int i=0;
		Iterator<String> iterator = setHashSet.iterator(); //반복자 타임에 set 타입 연결		
		while(iterator.hasNext()) { //hasNext() : 다음번 객체가 있으면 true, 없으면 false
			String element = iterator.next(); //가져온 값을 element에 넣음
			System.out.println(++i +"번 객체 : "+element);
			
		}
		
		setHashSet.remove("CSS");
		System.out.println("------- 인덱스가 없어서 for each문으로 전체출력 ------");
		for(String entity:setHashSet) {
			System.out.println(++i+"번 객체 : "+entity);
		}

	}

}
