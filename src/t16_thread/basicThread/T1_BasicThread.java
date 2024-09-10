package t16_thread.basicThread;

// Single Thread
public class T1_BasicThread {
	public static void main(String[] args) {
		System.out.println("모든 실행클래스는 main스래드 1개를 갖는다.");
		System.out.println("현재 실행중인 스레드명 : " + Thread.currentThread().getName());
	}
}
