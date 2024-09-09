package t15_API.t04_String;
/*
 	=> mutable뮤터블(가변) / immutable임뮤터블(불가변)
  String객체 : immutble객체로서 class가 한번 생성되면 그 값을 유지한다. 주로 짦은 문자열처리에 적당하다.
 	Stringbuffer객체 : mutable객체로서 크기를 변경할수 있다. 동기화를 제공. 멀티스레드를 제공및 사용하기 적절하다. 가변길이문자열에 적당.
 	Stringbulder(스트링빌더)객체 :mutable객체로서 크기를 변경할수 있다. 동기화를 불분명.  가변길이문자열에 적당.
 	성능 : StringBuilder > StringBuffer >>> String
 */
//스트링버퍼
public class T10_StringBuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");
		System.out.println("1.str : " +str);
		
		str += "/홍길동2";
		System.out.println("2.str : " +str);
	
	// StringBuffer()객체 : 가변길이클래스 기본크기는 16, 넘칠때는 상황에따라 크기 변경
	// 값의 추가 : append(어펜드)	,특정위치삽입:insert(인서트),특정위치 부터 지정개수만큼 지우기:delete(딜리트),치환:replace(리플릿)
	// 현재 버퍼의 크기? capacity()(카파시티)
		StringBuffer str2 = new StringBuffer();
		System.out.println("3.str2버퍼크기 : " +str2.capacity());
		
		str2.append("atom");
		System.out.println("4.str2 : " +str2);
		System.out.println("5.str2버퍼크기 : " +str2.capacity());
		
		str2.append("0123456789012345");
		System.out.println("6.str2 : " +str2);
		System.out.println("7.str2버퍼크기 : " +str2.capacity());
	
		str2.insert(2,"abcdefg");
		System.out.println("8.str2 : " +str2);
		System.out.println("9.str2버퍼크기 : " +str2.capacity());
	
		str2.delete(5, 20);
		System.out.println("10.str2 : " +str2);
		System.out.println("11.str2버퍼크기 : " +str2.capacity());
	}
}
