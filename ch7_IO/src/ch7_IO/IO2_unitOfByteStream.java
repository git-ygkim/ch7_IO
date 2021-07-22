package ch7_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	바이트 단위 스트림
		1. InputStream
				|
				FileInputStream		: 파일에서 바이트 단위로 읽어온다
				ByteArrayInputStream
								
				. int read() : 읽은 바이트 수를 int타입으로 반환, -1
				. void close() : 대상 리소스를 닫는다.  
				
		2. OutputStream
				|
				FileOutputStream	: 파일에 바이트 단위로 출력한다.
				
		
		
 */		


public class IO2_unitOfByteStream {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\MyJava\\myproject\\ch7_IO\\file\\test.txt");
			InputStreamReader in = new InputStreamReader(fin, "UTF-8");
			
			int c;
			while( ( c = in.read() ) != -1 ) {
				System.out.print( (char) c );
			}
			in.close();
			fin.close();
					
		} catch(IOException e) {
			System.out.println();
			
		}
		
		
	}

}
