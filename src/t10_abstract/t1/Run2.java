package t10_abstract.t1;

public class Run2 {
	public static void main(String[] args) {
		Phone samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung();
		samsungPhone.powerOff();
		System.out.println();
		
		Phone lgPhone = new Lg("김말숙");
		lgPhone.powerOn();
		lgPhone.sound();
		lgPhone.function();
		lgPhone.functionLg();
		lgPhone.powerOff();
		System.out.println();
	}
}
