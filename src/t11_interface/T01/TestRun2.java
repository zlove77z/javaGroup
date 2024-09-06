package t11_interface.T01;

public class TestRun2 {
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
		System.out.println("===========================");
	
		Test1[] test1 = {new Seoul(), new Busan()};
		for(int i=0; i<test1.length; i++) {
			test1[i].data();
			test1[i].data1(600);
			test1[i].data1(60000);
			test1[i].data1(-600);
		}
		
		
	}
}
