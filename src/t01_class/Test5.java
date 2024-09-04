package t01_class;

public class Test5 {
	public static void main(String[] args) {
		int su1 = 100, su2=0, su3;
		
		for(int i=0; i<5; i++) {
		 // su2 = 200 *i;
			System.out.println(su1 + su2);
		}
		
		su3 = su1 + su2;
		
		System.out.println(su3+200);
		System.out.println("su3+ " +su3+200);
	}
}
