package ch16.io.read;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExam2 {

	public static void main(String[] args) throws Exception {
		// c:\Temp\test.txt 파일의 문자를 자바에서 불러온다.
		
		InputStream inputStream = new FileInputStream("c:/Temp/test.txt");
		// InputStream 타입에 inputStream 변수를 연결함
		// FileInputStream 객체를 연결 -> 매개값으로 파일의 위치와 파일명을 보냄
		
		int readByteNo; //InputStrem은 바이트 값으로 데이터를 처리함
		byte[] readBytes = new byte[4]; //바이트 값으로 읽은자료를 배열 3칸에 저장
		String data = "";
		while(true) {
			readByteNo=inputStream.read(readBytes);//1바이트씩 읽어오는 기본 메서드
			//read 메서드는 더이상 읽을 값이 없으면 -1을 리턴한다.
			if(readByteNo== -1) {
				break; //더이상 읽을 값이 없어서 중지
			}
			data = new String(readBytes, 0,readByteNo);
			System.out.println(data);
		}//--while()
		inputStream.close(); //파일처리가 끝나면 close()로 닫아야 함

	}

}
