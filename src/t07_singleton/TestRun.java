package t07_singleton;

public class TestRun {
	public static void main(String[] args) {
		//new Singleton();
		//Singleton.singleton;
		
		Singleton mbc = Singleton.getInstance();
		Singleton kbs = Singleton.getInstance();
		Singleton sbs = Singleton.getInstance();
	
		if(mbc == kbs) System.out.println("mbc와 kbs는 서로 같은객체를 가리키고 있습니다.");
		else System.out.println("mbc와 kbs는 서로 다른 객체를 가리키고 있습니다.");
		
		if(kbs == sbs) System.out.println("kbs와 sbs는 서로 같은객체를 가리키고 있습니다.");
		else System.out.println("kbs와 sbs는 서로 다른 객체를 가리키고 있습니다.");

		if(sbs == mbc) System.out.println("sbs와 mbc는 서로 같은객체를 가리키고 있습니다.");
		else System.out.println("sbs와 mbc는 서로 다른 객체를 가리키고 있습니다.");
	}
}
