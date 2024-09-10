package t16_thread.multiThread1;

public class T01Run {
	public static void main(String[] args) {
		System.out.println("현재 클래스명 : T01Run");
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
		System.out.println();
		
		Thread th1 = new T01();
		th1.start();
		
		try { Thread.sleep(2000);} catch (InterruptedException e) {	}
	
		System.out.println("--------------------------------------------------");
		System.out.println("현재 클래스명 : T01Run");
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
		System.out.println("--------------------------------------------------");
		//		th1.start();   스레드는 독자적인 1번만 실행할수 있으므로 여러번 하는것은 소용 없다 다시 다른이름으로 생성하여 실행하여야한다
		//		th1.start();
	}
}

class T01 extends Thread {
	@Override
	public void run() {
		System.out.println("1.현재 클래스명 : T01");
		System.out.println("1.현재 실행중인 스레드명? " + Thread.currentThread().getName());
		
		//for(long i=0; i<10000000000L; i++) {}
		for(int i=1; i<=5; i++) {
			System.out.println("i = " +i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
		
		System.out.println("2.현재 클래스명 : T01");
		System.out.println("2.현재 실행중인 스레드명? " + Thread.currentThread().getName());
		System.out.println("2." + Thread.currentThread().getName() + "스레드가 종료됩니다.");
		
	}
}