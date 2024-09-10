package t16_thread.multTread3;

public class T04Run {
	public static void main(String[] args) {
		// 자막을 출력하는 스레드를 '익명이너클래스'로 구현한다.
		Thread smiTh1 = new Thread(new Runnable() {
			@Override
			public void run() {
			  // #2. 각 프레임에 표시될 자막
				String[] smiArray = {"하나","둘","셋","넷","다섯"};
				try { Thread.sleep(10); } catch (InterruptedException e) {}
				
				// #4. 자막출력
				for(int i=0; i<smiArray.length; i++) {
					System.out.print(" - 자막출력 : " + smiArray[i]);
					try { Thread.sleep(500); } catch (InterruptedException e) {}
				}
			}
		});
		
		// 영상을 출력하는 스레드를 익명이너클래스로 구현한다.
		Thread screenTh1 = new Thread(new Runnable() {
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
		});
		
		// 자막을 읽어주는 배우 스레드를 익명이너클래스로 구현한다.
		Thread actorTh1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// #1. 배우
				String[] actorArray = {"홍길동", "김두환", "이범수", "이기자", "안예은"};
				try { Thread.sleep(20); } catch (InterruptedException e) {}
				
				// #3. 나레이션 배우출력
				for(int i=0; i<actorArray.length; i++) {
					System.out.println(" -  배우명 : " + actorArray[i]);
					try { Thread.sleep(500); } catch (InterruptedException e) {}
				}
			}
		});
		
		
		
		
		// 앞에서 생성시켜놓은 익명이너클래스를 실행한다.
		smiTh1.start();
		screenTh1.start();
		actorTh1.start();
	}
}
