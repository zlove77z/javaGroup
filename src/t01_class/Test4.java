package t01_class;

public class Test4 {
	public static void main(String[] args) {
		Test1 t11 = new Test1();
		Test1 t12 = new Test1();
		
		if(t11 == t12) {
			System.out.println("t11 객체와 t12객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t11 객체와 t12객체는 다른 객체입니다.");
		}
		Test1 t13;
		t13 = t11;
		if(t11 == t13) {
			System.out.println("t11 객체와 t13객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t11 객체와 t13객체는 다른 객체입니다.");
		}
		t13 = t11;
		if(t12 == t13) {
			System.out.println("t12 객체와 t13객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t12 객체와 t13객체는 다른 객체입니다.");
		}
//		Test1 t14 = "mbc";       이것처럼 널 말고는 초기값을 줄수없당
		Test1 t14 = null;
		if(t13 == t14) {
			System.out.println("t13 객체와 t14객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t14 객체와 t14객체는 다른 객체입니다.");
		}
		if(t14 == null) {
			System.out.println("t14 객체의 초기값은 null 입니다.");
		}
		else {
			System.out.println("t14 객체의 초기값은 null이 아입니다.");
	  }
		/*
		if(t14.equals(null))
		if(t14.equals(null)) {
			System.out.println("t14 객체의 초기값은 null 입니다.");
		}
		else {
			System.out.println("t14 객체의 초기값은 null이 아입니다.");
		}
		*/
	}
}
