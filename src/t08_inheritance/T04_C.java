package t08_inheritance;

public class T04_C extends T04_P{
	public T04_C(int su) {
	// 슈퍼는 항상 1번째 첫번쨰 줄에 있어야 한다!
		super(su);
		System.out.println("T04_C클래스");
	}
}
