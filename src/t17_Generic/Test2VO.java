package t17_Generic;

// 브이오vo 디티오dto 기본공식 : 프라이빗으로 만들고 읽을수있게 겟터셋터로 만들고 잘넘어다니는지 마지막으로 투스트링을 만들어라!
public class Test2VO {
	private String name;
	private int age;
	private boolean gender;
	private int su;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	
	@Override
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", su=" + su + "]";
	}
}
