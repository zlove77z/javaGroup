package t15_API.t06_Math;

public class Test1 {
	public static void main(String[] args) {
		int su1 = 100;
		int su2 = -100;
		
		
		// 절대값 : Math.abs()
		System.out.println("su1 : " + su1 + ",su2 : "+su2 );
		System.out.println("Math.abs(su1) : " + Math.abs(su2) +", Math.abs(su2) : " + Math.abs(su2));
	
		double d1 = 1234.5678;
		double d2 = 1234.5678;
		
		//반올림 : Math.round() - 무조건 정수형반올림(소수첫쨰자리에서 반올림후 정수로 표시)
		System.out.println("d1 : " + d1 + " , d2 :" + d2);
		System.out.println("Math.random(d1):"+Math.round(d1)+ ", Math.round(d2):" +Math.round(d2));
		
		//소수 첫쨰자리에서 반올림 : 1234.567 + 0.5 =(int) 1235.067= 1235
		//소수 둘쨰자리에서 반올림 : 1234.567 + 0.05 = 1234.617 * 10 =(int)123456.17 = 123456 /10=1234.6
		System.out.println("소수 둘쨰반올림 : " + Math.round(d1*10) / 10.0);
		// 소수 셌째자리에서 반올림 : 1234.567 + 0.005 = 1234.5725
		System.out.println("소수 셋쨰반올림 : " + Math.round(d1*100) / 100.0);
		System.out.println();
		// 정수는 d 양수는f
		//String.format("%.nf",실수);
		System.out.println(String.format("%.0f", d1));
		System.out.println(String.format("%.1f", d1));
		System.out.println(String.format("%.2f", d1));
		System.out.println(String.format("%.3f", d1));
		System.out.println();
		
		// 소수부 무조건 올림 : Math.ceil()
		System.out.println("1.ceil() : " + Math.ceil(d1));
		double d3 = 123.45;
		System.out.println("2.ceil() : " + Math.ceil(d1));
		// 소수이하 둘쨰자리에서 무조건 올림
		System.out.println("3.ceil() * 10 / 10 : " + Math.ceil(d1 * 10) / 10);
		System.out.println();
	
		//소수부 무조건 내림 : floor()플롤
		System.out.println("1.floor() : " + Math.floor(d1));
		System.out.println("2.floor() : " + Math.floor(d1));
		// 소수이하 둘쨰자리에서 무조건 올림
		System.out.println("3.floor() * 10 / 10 : " + Math.floor(d1 * 10) / 10);
		System.out.println();
		
		//최대값(max(맥스)),최소값(min(미니멈))
		double d4 = 345.678;
		System.out.println("max() : " + Math.max(d3, d4));
		System.out.println("min() : " + Math.min(d3, d4));
		System.out.println();
		
		//난수 :Math.random() : 0~1미만의 실수형 난수,(int)(Math.random()*(끝+1-시작)구간확인 + 시작
		//난수 :Math.random() : 0~1미만의 실수형 난수,(int)(Math.random()*(끝) + 시작
		System.out.println("0~1미만의 실수형 난수 : " + Math.random());
		System.out.println("0~100미만의 실수형 난수 : " + ((int)(Math.random()*(100+1-1))+1));
		System.out.println("5~10미만의 정수형 난수 : " + ((int)(Math.random()*(10+1-5))+5));
	}
}
