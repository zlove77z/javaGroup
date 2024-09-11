package t18_Collection.t04_Set;

import java.util.HashSet;
import java.util.Set;

/*
	Set계열 : 집합자료구조 - HashSet(헤시셋) /TreeSet(트리셋)
	인덱스 정보가 없다. 비순서 자료구조(순서가 없다),중복을 허용하지 않는다.(같은자료가 절떄로 있을수가 없다)
*/
public class T01_HashSet_01 {
	public static void main(String[] args) {
//		HashSet<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<>();
//		Set<String> hash = new HashSet<>(); <<이렇게 사용할꺼면 인폴트 걸어야한다 컨트롤 알트 알파벳O
		
		System.out.println("1.크기 : " + hash.size());
		System.out.println("1.내용 : " + hash);
		System.out.println();
	
		//자료의 추가(add)
		hash.add("홍길동");
		hash.add("김말숙");
		hash.add("이기자");
		hash.add("소나무");
		hash.add("강감찬");
		System.out.println("2.크기 : " + hash.size());
		System.out.println("2.내용 : " + hash);
		System.out.println();
	
		hash.add("홍길동");
		System.out.println("3.크기 : " + hash.size());
		System.out.println("3.내용 : " + hash);
		System.out.println();
		
		hash.add(new String("홍길동"));
		System.out.println("4.크기 : " + hash.size());
		System.out.println("4.내용 : " + hash);
		System.out.println();
	
		//제거(remove리무버)
		hash.remove("홍길동");
		System.out.println("5.크기 : " + hash.size());
		System.out.println("5.내용 : " + hash);
		System.out.println();
		
		//추가(add에드)
		hash.add("오하늘");
		System.out.println("6.크기 : " + hash.size());
		System.out.println("6.내용 : " + hash);
		System.out.println();
		
		
		//전체삭제(clear)
		hash.clear();
		System.out.println("7.크기 : " + hash.size());
		System.out.println("7.내용 : " + hash);
		System.out.println();
		
		//비어있는지의 유무? isEmpty()(이즈엠프티)
		System.out.println("8.비어있는가? " + hash.isEmpty());
		
		//찾고자하는 값의 포함유쿠? contains()(컨테인스)
		System.out.println("9.'김말숙'씨의 포함유무? " + hash.contains("김말숙"));
	}
}
