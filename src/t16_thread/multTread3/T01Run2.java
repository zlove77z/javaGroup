package t16_thread.multTread3;

public class T01Run2 {
	public static void main(String[] args) {
		// 자막객체 생성 실행
		Runnable smiThread = new SMIFile2();
		Thread smiTh1 = new Thread(smiThread);
		smiTh1.start();
		
	  // 영상객체 생성 실행
		Runnable screenThread = new ScreanFile2();
		Thread smiTh2 = new Thread(screenThread);
		smiTh2.start();
	}
}

// 영상을 처리하는 클래스
class ScreanFile2 implements Runnable {
	@Override
	public void run() {
		// #1. 영상프레임 1~5컷트
		int[] screenArray = {1,2,3,4,5};
		
		// #3. 영상출력
		for(int i=0; i<screenArray.length; i++) {
			System.out.print("영상프레임 : " + screenArray[i]);
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}
	}
}

// 자막을 처리하는 클래스
class SMIFile2 implements Runnable {
	@Override
	public void run() {
		// #2. 각 프레임에 표시될 자막
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		try { Thread.sleep(10); } catch (InterruptedException e) {}
		
		// #4. 자막출력
		for(int i=0; i<smiArray.length; i++) {
			System.out.println(" - 자막출력 : " + smiArray[i]);
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}
	}
}