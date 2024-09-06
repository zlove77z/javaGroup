package t11_interface.t03;

public class PoliceMan implements Action {

	@Override
	public void catching() {
		System.out.println();
		}

	@Override
	public void search() {
		System.out.println();
	}

	@Override
	public void fire() {
		System.out.println("화제진압을 합니다!");
	}

	@Override
	public void rescue() {
		System.out.println("인명구조 활동을 합니다");
	}

	@Override
	public void pizza() {}

	@Override
	public void pasta() {}

	
}
