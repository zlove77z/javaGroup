package t11_interface.t03;
/*
	각 배우의 열할을 출력하시오?
	배역 : 경찰관(범인잡는역,물건찾기)소방관(불끄기,인명구조),요리사(피자,스파게티)
*/
public interface Action {
	
	// 경찰관(범인잡기,물건찾기)
	void catching();
	void search();
	
	// 소방관(불끄기,인명구조)
	void fire();
	void rescue();
	
	//요리사(피자,스파게티)
	void pizza();
	void pasta();

	default void person(String actor) {
		System.out.println(actor + "의 역할");
	}
}
