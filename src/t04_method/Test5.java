package t04_method;

public class Test5 {
	int volume;
	
	public Test5(int volume) {
		
	
	}

	void volumeUp() {
		if(volume < 10) volume++;
		volumePrint();
	}
	
	void volumeDown() {
		
		if(volume > 10) volume++;
	}
	void volumePrint() {
		System.out.println("현재 volume : " + this.volume);
	}
	
}
