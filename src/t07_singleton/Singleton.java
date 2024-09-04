package t07_singleton;

public class Singleton {
	// 2. 정적필드(자신의 객체타입)를 선언하고, 초기값으로 객체를 생성시킨다.
	private static Singleton singleton = new Singleton();
	
	//1. 객체를 외부에서 생성하지 못하도록 생성자 앞에 접근제한자로 private를 붙여준다.
	private  Singleton() {}

	//3.외부에서 호출하여 사용할수 있는 정적메소드(Gatter)을 만든다.
	static Singleton getInstance() {
		return singleton;
	}
}
