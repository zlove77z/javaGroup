package t11_interface.T01;

public class Seoul implements Test1 {

	@Override
	public void data() {
		System.out.println("이곳은 Seoul클래스의 data메소드 입니다.");
	}

	@Override
	public void data1(int su) {}

}
