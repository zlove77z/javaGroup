package t10_abstract;

public class Dog extends Animal {
	public String talk;
	
	public Dog(String talk) {
		this.talk = talk;
	}
	
	void cry() {
		
	}

	@Override
	public void sound() {
		System.out.println("강아지 울음소리는 "+talk+"~~");
	}
	
	public void work() {
		//sound();
		move();
	}
}
