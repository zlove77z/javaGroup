package t16_thread.Properties;

// 일반적인 경우 : JVM은 메인스레드가 끝나도 데몬스레드가 실행중이면 끝날떄까지 기다려준다.
// 데몬스레드를 메인스레드에 종속시켜 작업하게되면 메인스레드가 끝나면 데몬스레드는 작업량이 남았어도 강제종료한다.
// 일반스레드의 setDaemon(셋데몬)은 false(펄스), setDaemin(셋데몬)을 true(트루)로 하면 메인스레드에 데몬스레드는 종속적이게 된다.
public class Test4 {
	public static void main(String[] args) {
		Thread myTherad = new MyThread2();
		myTherad.setDaemon(true);
		myTherad.setName("myThread2");
		myTherad.start();
		
		//메인스레드를 3초간 지연처리후 종료시켜보자.
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		System.out.println("main스레드 종료");
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬스레드" : "일반스레드"));
		for(int i=0; i<=6; i++) {
			System.out.println(getName() + " : " + i);
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}