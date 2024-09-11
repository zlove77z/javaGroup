package t18_Collection.t06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
	Queue : FIFO피포방식(First In First Out) - 선입선출 방식
	예외처리 포함!
*/
public class T02_Queue2 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();

		
		System.out.println("1.크기 : " + queue.size());
		System.out.println("1.내용 : " + queue);
		System.out.println();
		
		//삽입 : offer()오퍼
		queue.offer(30);
		queue.offer(33);
		queue.offer(23);
		queue.offer(16);
		queue.offer(26);
		System.out.println("2.크기 : " + queue.size());
		System.out.println("2.내용 : " + queue);
		System.out.println();
		
		// 바로 아래자료 쳐다보기
		System.out.println("3.자로아래자료 " + queue.peek());
		System.out.println();
		
		//꺼내기 : remove()
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println(".크기 : " + queue.size());
		System.out.println(".내용 : " + queue);
		System.out.println();
	}
}
