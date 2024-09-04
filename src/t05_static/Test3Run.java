package t05_static;

public class Test3Run {
	public static void main(String[] args) {
//	Test3 t3 =	new Test3();
//	System.out.println("nation : " + t3.nation);
//	System.out.println("jumin : " + t3.jumin);
// 스태틱 파이널은 일반 사용자가 값을 바꾸지 못함	
	System.out.println("nation : " + Test3.NATTON);
	System.out.println("jumin : " + Test3.JUMIN);
	
	
	}
}
