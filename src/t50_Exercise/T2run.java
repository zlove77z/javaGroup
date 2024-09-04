package t50_Exercise;

import java.util.Scanner;

public class T2run {

	
	/* 성명(name)/나이(age)/지역(address)/성별(sex)
	 * 나이는 20세이상 90세 미만인 사람만이 가입할수 있고,
	 * 주소 입력시 '외국인'은 0으로 입력한다
	 * 성별은'남자가
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String name, address;
		int age, sex;
		
		System.out.print("성명을 입력하세요?");
		name = sc.next();
		System.out.print("나이를 입력하세요?");
		age = sc.nextInt();
		System.out.print("주소를 입력하세요 ?(외국인은0)");
		address = sc.next();
		System.out.print("성별을 입력하세요?남성은1로, 여자는4로 입력하시오");
		sex = sc.nextInt();

		T2VO vo = new T2VO();
		vo.setName(name);
		while(true) {
			boolean ageCheck = vo.setAge(age);
			if(ageCheck) break ;
				
				System.out.print("나이를 입력하세요?");
				age = sc.nextInt();	
		}
		vo.setAddress(address);
		vo.setGender(sex);
		
		T2Service service = new T2Service();
		//service.t2Print(name,age,address,sex);
		service.t2Print(vo);
		System.out.println("작업끝");
		
		sc.close();
	}	
}
