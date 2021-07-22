package ch7_IO;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IO5_unitOfByteStream4 {

	public static void main(String[] args) {

		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\MyJava\\myproject\\ch7_IO\\file\\test3.txt");
			
			for(int i = 0; i < 10; i++) {
				int n = 10 - i;
				fout.write(n);
			}
			
		} catch(IOException e) {
		}
		
		try {
//			FileOutputStream fout = new FileOutputStream();
			FileReader fr = new FileReader("C:\\MyJava\\myproject\\ch7_IO\\file\\test3.txt");
			
			int c;
			while( ( c = fr.read() ) != -1) {
				System.out.println( (char) c );
			}
			fr.close();
			
			
		} catch(IOException e) {
		}
		
	}

}
