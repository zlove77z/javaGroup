package t11_interface.T01;

public interface Test1 {
//	int max = 1000000; // final static int max = 1000000; 파이널(값을 바꿀수없다-즉상수라한다-) 스태이틱(정적언어 값이 저장된다)
//	public final static int MAX = 1000000; 
	int MAX = 1000000;
	int MIN = 0;

//	public void date();                         //<<이것 또는
//  	public abstract void date();             //<<이것 을
		void data();                              //<< 이렇게 쓴다
		void data1(int su);                         

		default void data2() {
			//실행할 내용을 포함 / 생략 -디폴트-
			System.out.println("이곳은 data2메소드(default)");
		}
		
	static void data3() {
		//실행할 내용을 포함/생략  -스태틱!-
		System.out.println("이곳은 data3메소드(default)");
		}
		
}
