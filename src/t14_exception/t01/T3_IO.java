package t14_exception.t01;

import java.io.IOException;
import java.io.InputStreamReader;

public class T3_IO {
	public static void main(String[] args) {
		
		try {
		InputStreamReader is = new InputStreamReader(System.in);
			
			while(true) {
				System.out.println("업로드할 파일명을 입력하세요");
				char ch = (char) is.read();
				if( ch == '0') break;
				int intCh = ch;
				System.out.println(ch + "파일을 정상적으로 읽어들였습니다. intCh = " +intCh);
			}
			} catch (IOException e) {
				System.out.println("파일을 읽을수 없습니다.");
				e.printStackTrace();
			}
			System.out.println("작업종료!");
	}
}

