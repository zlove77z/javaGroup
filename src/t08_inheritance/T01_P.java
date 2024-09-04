package t08_inheritance;

//부모클래스   [모든 클레스의 가장 꼭대기(끝은)object[오브젝트]이다!]
public class T01_P extends T01_J {
	int money = 1000;
	
	void mod1(String temp) {
		System.out.println(temp);
	}
//절대값 메소드 (사망연산자 조건 . 참.거짓일떄는 :콜론 
	int absmod(int su) {
		int res = (su > 0) ? su : su * (-1) ;
		return res;
	}
	
}
