package t12_nested.t01;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("Test1클래스의 su필드 : " +t1.su);
		t1.modTest1();
		System.out.println();
		
		Aa aa = new Aa();
		System.out.println();
		
	 t12_nested.t01.Test1.Aa t1a = t1.new Aa();
	 System.out.println("중첩클래스 안의 suA필드 : " + t1a.suA);
	 t1a.modTest1A();
	}
}
