package t03_Constructor;

public class Test3 {
	// 기본생성자
	//Test3() {}

	int atom1 = 30;

	public Test3() {
		System.out.println("atom1 : " + atom1);
	}
	
	public Test3(int atom1) {
		this.atom1 = atom1;
		System.out.println("atom1 : " + atom1);
		System.out.println("atom1 : " + this.atom1);
	
		this.atom1 += atom1;
		System.out.println("atom1 : " + this.atom1);
	}
	
	
//	int atom1 = 30;
	int atom2;
	double atom3;
	
	Test3(double aa3) {
		atom3 = aa3;
		System.out.println("this.atom3 : " + this.atom3);
	}
	
}
