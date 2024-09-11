package t18_Collection.t03_ArrauList;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		//ArrayList<String> arrayList = new  ArrayList<String>();
		ArrayList<String> arrayList = new  ArrayList<>();
		//List<String> arrayList = new  ArrayList<>();
		
		System.out.println("1.arrayList크기 : " + arrayList.size()); // 크기는 길이라고 보면된다!
		System.out.println("1.arrayList크기 : " + arrayList.toString()); //toString 은 내용을본다
		System.out.println("1.arrayList크기 : " + arrayList); //toString 은 너무나 많이 사용하여서 생략해도 가능하다!
		System.out.println();
		
		// 자료삽입
		arrayList.add("홍길동");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		arrayList.add("오하늘");
		arrayList.add("고인돌");
		arrayList.add("소나무");
		System.out.println("2.arrayList크기 : " + arrayList.size()); // 크기는 길이라고 보면된다!
		System.out.println("2.arrayList크기 : " + arrayList.toString()); //toString 은 내용을본다
		System.out.println();
	
		
		arrayList.add("홍길동3");
		arrayList.add("김말숙3");
		arrayList.add("이기자3");
		arrayList.add("오하늘3");
		arrayList.add("고인돌3");
		arrayList.add("소나무3");
		System.out.println("3.arrayList크기 : " + arrayList.size()); // 크기는 길이라고 보면된다!
		System.out.println("3.arrayList크기 : " + arrayList.toString()); //toString 은 내용을본다
		System.out.println();
		
		// 자료 검색(get)겟터
		System.out.println("4.arrayList.get(1)" + arrayList.get(1));
		System.out.println("4.arrayList.get(5)" + arrayList.get(5));
		System.out.println("4.arrayList.get(마지막위치)" + arrayList.get(arrayList.size()-1));
		System.out.println();
		
		//자료 수정(set)셋터
		arrayList.set(1, "강감찬");
		System.out.println("4.arrayList크기 : " + arrayList.size()); // 크기는 길이라고 보면된다!
		System.out.println("4.arrayList크기 : " + arrayList.toString()); //toString 은 내용을본다
		System.out.println();
		
		//자료 삭제(remove)리무브
		arrayList.remove(1);
		arrayList.remove(3);
		arrayList.remove(5);
		System.out.println("5.arrayList크기 : " + arrayList.size()); // 크기는 길이라고 보면된다!
		System.out.println("5.arrayList크기 : " + arrayList); //toString 은 내용을본다
		System.out.println();
	
		//자료 삽입(add(인덱스,요소))
		arrayList.add(1, "그린");
		System.out.println("6.arrayList크기 : " + arrayList.size()); // 크기는 길이라고 보면된다!
		System.out.println("6.arrayList크기 : " + arrayList); //toString 은 내용을본다
		System.out.println();
	
		// 모든 자료 삭제
		arrayList.clear();
		System.out.println("7.arrayList크기 : " + arrayList.size()); // 크기는 길이라고 보면된다!
		System.out.println("7.arrayList크기 : " + arrayList); //toString 은 내용을본다
		System.out.println();
	}
}
