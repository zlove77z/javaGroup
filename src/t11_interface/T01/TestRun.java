package t11_interface.T01;

public class TestRun {
	public static void main(String[] args) {
		//인터페이스는 생성할수 없다 // new Test1();
		Seoul seoul = new Seoul();
		seoul.data();
		seoul.data2();
		
		Test1.data3();
		Busan busan = new Busan();
		busan.data();
		busan.data1(500);
		busan.data1(5000000);
		busan.data1(-500);
		
		
		
	}
}
