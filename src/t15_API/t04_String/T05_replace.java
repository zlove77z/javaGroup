package t15_API.t04_String;

public class T05_replace {
	public static void main(String[] args) {
		
		//0					1					2
		//012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국을 방문하신것을 환영합니다";
		
		System.out.println("msg1 : " +msg1);
		System.out.println("msg2 : " +msg2);
	
	  // replace() : 치환 - 특정문자(열)을 지정한 문자(열)로 (모두)변경처리한다. 단, 대소문자는 구별한다.
		// 'Korea'를 'USA'로 치환
		System.out.println("1.'Korea'를 'USA'로 치환? " + msg1.replace("Korea", "USA"));
		System.out.println("2.'한국'를 '미국'로 치환? " + msg2.replace("한국", "미국"));
		System.out.println();
		
		System.out.println("3.'o' 를 'O'로 변경하시오? " + msg1.replace("o", "O"));
		System.out.println("4.'o' 를 'O'로 변경하시오? " + msg1.replaceAll("o", "O"));// '정규식'사용시
		System.out.println();
		
		String msg3 = " ! H e l l o ! ";
		System.out.println("5.msg3:" +msg3);
		System.out.println("6.msg1+msg3+msg2 : " + msg1+msg3+msg2);
		System.out.println();
		
		//msg3번에 포함된 앞뒤 공백 무시후 결합 : trim() 앞뒤공백무시하는 명령어
		System.out.println("7.msg1+msg3+msg2 : " + msg1+msg3.trim()+msg2);
		System.out.println();
		
		//msg3번에 포함된 모든 공백을 삭제후 결합 : 치환 replace(" " ,"") 명령어
		System.out.println("8.msg1+msg3+msg2 : " + msg1+msg3.replace(" ","")+msg2);
		System.out.println();
		
		//msg3안의 영문자를 모두 소문자로 변경후 결합
		System.out.println("9.msg1+msg3+msg2 : " + msg1+msg3.toLowerCase()+msg2);
		//msg3안의 영문자를 모두 대문자로 변경후 결합
		System.out.println("10.msg1+msg3+msg2 : " + msg1+msg3.toUpperCase()+msg2);
		System.out.println();
		
		//msg3안의 모든 공백을 없애고, 영문자를 모두 대문자로 변경후 결합
		System.out.println("11.msg1+msg3+msg2 : " + msg1+msg3.toUpperCase()+msg2);
		System.out.println("12.msg1+msg3+msg2 : " + msg1+msg3.replace(" ","").toUpperCase()+msg2);
		System.out.println();
		
		//포함유무 :contains()
		//msg3안에 공백을 포함하고 있느냐? 있으면true트루(참) , 없으면false펄스(거짓)
		System.out.println(msg3.contains(" "));
		System.out.println();
		
		// 문자열로 결합... '+' or concat()
		System.out.println(msg1.concat(msg3).concat(msg2));
		
		//지정문자열의 반복 : repeat() - java 10 이후버전에서 처리가능.
		//System.out.println("=".repeat(50));
	}
}
