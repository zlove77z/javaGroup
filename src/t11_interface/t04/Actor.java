package t11_interface.t04;

public class Actor implements PoliceMan,FireMan,Chef {

	@Override
	public void pizza() {
		System.out.println("피자를 만들수 있습니다.");	
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티 를 만들수 있습니다.");	
	}

	@Override
	public void fire() {
		System.out.println("불을 끌수 있습니다");
	}

	@Override
	public void rescue() {
		System.out.println("인명구조를 할수있습니다");
	}

	@Override
	public void catching() {
		System.out.println("범인을 잡을수 있습니다");
	}

	@Override
	public void search() {
		System.out.println("물건을 찾아줄수 있습니다");	
	}
	
}
