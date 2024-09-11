package t18_Collection.t06_Stack_Queue;

import java.util.Stack;

/*
	스택 : LIFO(리포 : Last In First Out) - 후입선출
*/
public class T01_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기 : " + stack.size());
		System.out.println("1.내용 : " + stack);
		System.out.println();
		
		//삽입(push 푸시)
		stack.push(2);
		stack.push(4);
		stack.push(2);
		stack.push(9);
		stack.push(6);
		System.out.println("2.크기 : " + stack.size());
		System.out.println("2.내용 : " + stack);
		System.out.println();
		
		// 검색(search()서치)
		System.out.println("3.검색(9)" + stack.search(9));
		System.out.println();
		
		// 바로 아래 자료 보기 : peek()피크
		System.out.println("4. : " + stack.peek());
		System.out.println();
		
		//꺼내기(pop팦)
		stack.pop();
		System.out.println(".크기 : " + stack.size());
		System.out.println(".내용 : " + stack);
		System.out.println();
		
		
	}
}
