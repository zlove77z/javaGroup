package t03_Constructor;

public class Test2 {
// 기본 생성자
	Test2() {}
	
	Test2(int su1) {}
	
	Test2(int su1, int su2) {}
	
	Test2(int su1, double su2) {}
	
	Test2(double su1, int su2) {}
	
	// 생성자가 1나의 클레스에 여러게가 올수있다 하지만 생성자의 이름은 클레스명과 똑같아 
	// 하지만 생성자를 구분해야 하기 떄문에 생성자 안에 있는 맥의변수의 ( 타입 , 갯수 , 순서 ) 가 달라야한다!
	// 생성자 오버로딩은 하나의 클래스 안에 여러개의 생성자를 만드는 기술이다!
}
