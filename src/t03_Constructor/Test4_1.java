package t03_Constructor;

public class Test4_1 {
	String model;
	String color = "블랙";
	int speed;
	
	public Test4_1(String model) {
//		this.model = model;
//		this.color = "흰색";
//		this.speed = 250;
		this(model, "흰색",250);
	}		
		public Test4_1(String model, String color) {
//			this.model = model;
//			this.color = "은색";
//			this.speed = 250;	
			this(model, color, 270);
	}
		public Test4_1(String model, String color, int speed) {
			this.model = model;
			this.color = color;
			this.speed = speed;			
			//생성자 중 가장 많이 쓰는애만 살려두고 호출해서 사용가능하다!
		}
}
