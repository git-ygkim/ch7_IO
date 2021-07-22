package ch7_IO;

import java.io.FileReader;
import java.io.IOException;

public class IO6_unitOfCharStream1 {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			
			in = new FileReader("C:\\Windows\\system.ini");
			
			int c;
			while((c=in.read())!=-1) {
				System.out.println((char)c);
			}
			in.close();
			
		} catch (IOException e) {
			System.out.println("데이터 읽기에 실패하셨습니다");
		}
	}

}
