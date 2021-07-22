package ch7_IO;

import java.io.FileWriter;
import java.io.IOException;

public class IO7_unitOfCharStream {

	public static void main(String[] args) {

		try {
			FileWriter fout = new FileWriter("C:\\MyJava\\myproject\\ch7_IO\\file\\test4.txt");
			
			fout.write("자~ 오늘이 마지막 수업입니다");
			fout.write('A');
			
			char [] buff = {'b', 'c', 'd', 'e', 'f', 'g'};
			fout.write(buff);
			fout.write(buff, 1, 2);
			
			fout.close();
			System.out.println("데이터 쓰기에 성공하였습니다. ");
			
		} catch (IOException e) {
			
		}
		
	}

}
