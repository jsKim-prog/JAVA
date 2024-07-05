package ch16.io.read;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExam {

	public static void main(String[] args) throws Exception {
		// c:\Temp\test.txt 파일의 문자를 자바에서 불러온다.
		
		InputStream inputStream = new FileInputStream("c:/Temp/test.txt");
		// InputStream 타입에 inputStream 변수를 연결함
		// FileInputStream 객체를 연결 -> 매개값으로 파일의 위치와 파일명을 보냄
		
		int readByte; //InputStrem은 바이트 값으로 데이터를 처리함
		while(true) {
			readByte=inputStream.read();//1바이트씩 읽어오는 기본 메서드
			//read 메서드는 더이상 읽을 값이 없으면 -1을 리턴한다.
			if(readByte== -1) {
				break; //더이상 읽을 값이 없어서 중지
			}
			System.out.println((char)readByte);
		}//--while()
		inputStream.close(); //파일처리가 끝나면 close()로 닫아야 함

	}

}
