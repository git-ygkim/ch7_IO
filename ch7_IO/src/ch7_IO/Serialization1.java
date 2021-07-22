package ch7_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
		직렬화
			. 객체가 생성된 후 객체의 변수 값은 생명처럼 지속적으로 변경된다.
			. 생성된 순간 그대로 저장하거나 네트워크를 통해 어느 시점의 데이터를 전송하는 것 이것을 직렬화 라고 한다. 
			
			. 객체의 내용은 연속 스트림으로 만드는 것을 말한다. 
			. 직렬화에서 할 일은 인스턴스 변수 값을 스트림으로 만드는 것이다. 
		
		
		역직렬화

 */

class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	
	public String toString() {
		return name + "," + job;
	}
}


public class Serialization1 {

	public static void main(String[] args) throws ClassNotFoundException {

		Person Ahn = new Person("안재용", "대표이사");
		Person Kim = new Person("김철수", "상무이사");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\MyJava\\myproject\\ch7_IO\\file\\serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(Ahn);
			oos.writeObject(Kim);
			
		} catch (IOException e) {
			System.out.println("파일 생성에 실패하였습니다.");
			
		}

		try {
			FileInputStream fis = new FileInputStream("C:\\MyJava\\myproject\\ch7_IO\\file\\serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			

			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println("p1의 이름: " + p1.name);
			System.out.println("p1의 직업: " + p1.job);
			System.out.println("*****************");
			
			System.out.println("p1의 이름: " + p2.name);
			System.out.println("p1의 직업: " + p2.job);
			
		} catch (IOException e) {
			System.out.println("파일 생성에 실패하였습니다.");
			
		}
	}

}
