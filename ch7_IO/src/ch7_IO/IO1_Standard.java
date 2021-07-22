package ch7_IO;

import java.io.IOException;

/*

 1. 스트림
	- 입출력 장치가 너무 다향해서 표준화해놓은 가상통로
	- 모든 입출력 기능에 대해 stream 표준화된 클래스를 제공
	- 기본 단위 1바이트 ( 문자 2바이트가 필요, 문자 출력에 제공되는 클래스를 제공)

	
 2. 스트림 종류
 	1) 입력이냐 출력이냐			Input, Output / read, write
 	2) 바이트 단위냐? 문자(2바이트) 단위냐?
 	3) 독립적인 클래스냐? 보조적인 클래스냐?
 	
	스트림							입/출				바이트/문자			기반/보조
	---------------------------------------------------------------------------------
	FileReader						입력				문자					기반
	FileOutputStream				출력				바이트				기반
	BufferedReader					입력				문자					보조
	
	
 3. 입출력 예외
 	. FileNotFoundException
	. IOException
	. ClassNotFoundException
	
	
 4. 표준 입출력
 	class System {
 	. static PrintStream	out;
 	. static InputStream	in;
 	. static OutputStream	err;





*/


public class IO1_Standard {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러개를 입력하세요>> ");
		
		int i;
		try {
			
			while((i=System.in.read()) != -1) {			// != -1 ; 값이 있다면
				System.out.print(i + ":");
				System.out.print((char) i + ":\n");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		알파벳 여러개를 입력하세요>> 
		// abcdefg
		97:a:
		98:b:
		99:c:
		100:d:
		101:e:
		102:f:
		103:g:
		13:		//carriege return
		:
		10:		// 아스키 코드 찾아보기
		:

		 */
		

	}

}
