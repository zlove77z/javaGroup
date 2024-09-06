package t12_nested.t01;

//중첩클래스 : 인스턴스 멤버 클래스
public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다");
	}
	public void modTest1() {
		int su = 150;
		if(su < 0 ) {
			//int su = 200; 로컬변수는 지역변수랑 상관없어 중복이 가능하나 로컬변수는 2개가 안됨!
			System.out.println("su : " +su);
		}
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.");
	}

	public class Aa{
		// int su = 200; (O)
		int suA = 200;
		
		public Aa() {
			System.out.println("이곳은 Test1클래스안의 중첩클래스 Aa의 기본 생성자 입니다!");
		}
		public void modTest1A() {
			System.out.println("이곳은 Test1클래스안의 중첩클래스의 modTest1A()메소드 입니다!");
		}
	}

	public class Bb{
		
	}
	
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.!!");
	}
}
