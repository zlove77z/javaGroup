package t15_API.t05_wrapper;

public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100, intSu2 = 200;
		System.out.println("1.intSu1 + 100 : " +(intSu1+100));
		
		//정수형 Boxing처리(Integer) - 기본타입(int)이 참조타입(객체)로 변환
		Integer objSu1 = new Integer(intSu1);
		System.out.println("2.objSu1 + 100 : " + (objSu1 + 100));
		
		// 자동박싱
		Integer objSu2;
		objSu2 = intSu1;
		System.out.println("3.objSu2 + 100 : " + (objSu2 + 100));
		
		// UnBoxing처리
		String strIntSu1 = "100";
		System.out.println("4.strIntSu1 + 100 " +(strIntSu1 + 100));
		System.out.println("5.strIntSu1 + 100 " +(Integer.parseInt(strIntSu1) + 100));
	
		//double <--> Double
		double dblSu = 3.14;
		// Double objDblSu = dblSu; // 'O'
		Double objDblSu = new Double(dblSu);
		System.out.println("6.objDblSu + 100.5 : " + (objDblSu+ 100.5));
		
		//boxing
		int su3 = 100;
		//Integer objSu3 = su3; 자동박싱// 'O'
		Integer objSu3 = Integer.valueOf(su3);
	
		//UnBoxing 객체로 처리한것은 벨류업으로 해야한다!
		int su4 = Integer.valueOf(objSu3);
		System.out.println("7.su4 + 100 "+ (su4 + 100));
	}
}
