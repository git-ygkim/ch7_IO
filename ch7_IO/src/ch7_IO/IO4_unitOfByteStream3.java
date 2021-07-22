package ch7_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IO4_unitOfByteStream3 {
	public static void main(String[] args) {
		try {
			
			FileOutputStream fout = new FileOutputStream("C:\\MyJava\\myproject\\ch7_IO\\file\\test2.txt");
			
			fout.write(72);
			fout.write(65);
			fout.write(80);
			fout.write(80);
			fout.write(89);
			fout.write(32);
			fout.write(74);
			fout.write(65);
			fout.write(86);
			fout.write(65);
			fout.write(33);
			
			System.out.println("정상적으로 파일이 생성되었습니다.");
			fout.close();

			FileOutputStream foss = new FileOutputStream("C:\\MyJava\\myproject\\ch7_IO\\file\\test2.txt", false);
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			foss.write(bs);
			foss.write(13);
			foss.write(10);
			
			foss.close();
			
			
		} catch (IOException e) {
			
		}
	}

}
