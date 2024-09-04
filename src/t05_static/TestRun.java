package t05_static;

//import t04_method.Test5;
//import t04_method.Test6;
import t04_method.*;


// 컨트롤 쉽프트 알파벳o는 인폴트 단축키!
//import t04_method.Test6;
//퍼블릭 프로텍티트 디폴트 프라이드 순으로 접근할수있는 관대한순
// 겝터(메소드) 와 셉터(메소드) 만 프라이빗 필드에 접근할수있다
// 겝터.셉터는 유효성검사(정확한값을 입력시 내값을 보여준다)를 할수있다
// 자바는 읽어오는것은 겟이라 부르고 저장하는것은 셋이라한다.
// 겟터는 정보를 읽어오고 저장이랑 수정은 셋터를 통해서 한다.
// 논리형 타입만 겟터(gat라고 쓰지 않고 is라고 쓴다)
public class TestRun {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.mod();
		
//		new t04_method.Test6();
		new Test6();
		new Test5(5);
		new t04_method.Test4();
	}
}
