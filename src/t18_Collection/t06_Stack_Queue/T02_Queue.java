package t18_Collection.t06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
	Queue : FIFO피포방식(First In First Out) - 선입선출 방식
	예외처리 미포함!
*/ 
public class T02_Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();

		
		System.out.println("1.크기 : " + queue.size());
		System.out.println("1.내용 : " + queue);
		System.out.println();
		
		//삽입 : add()
		queue.add(30);
		queue.add(33);
		queue.add(23);
		queue.add(16);
		queue.add(26);
		System.out.println("2.크기 : " + queue.size());
		System.out.println("2.내용 : " + queue);
		System.out.println();
		
		// 바로 아래자료 쳐다보기
		System.out.println("3.바로아래자료 " + queue.element());
		System.out.println();
		
		//꺼내기 : remove()
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println(".크기 : " + queue.size());
		System.out.println(".내용 : " + queue);
		System.out.println();
		
//		System.out.println("3.바로아래자료 : " + queue.element());
		System.out.println("3.바로아래자료 : " + queue.peek());
	}
}
