package t14_exception.t01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T1_ClassNotFound {
	public static void main(String[] args) {
		// java.lang.Object
		//파일 낫파운더리 입센션
	try {
		FileInputStream fis = new FileInputStream("test.txt");
	} catch (FileNotFoundException e) {
		//e.printStackTrace();
		System.out.println("test.txt파일이 없습니다. " + e.getMessage());
		}
		System.out.println("작업끝.");
	
		
	}
}
