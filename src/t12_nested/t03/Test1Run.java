package t12_nested.t03;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("Test1클래스안의 su : " +t1.su);
		t1.modClass();
		System.out.println();
		
		t1.modClass();
	}
}
