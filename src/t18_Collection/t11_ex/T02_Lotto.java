package t18_Collection.t11_ex;

import java.util.HashSet;
import java.util.TreeSet;

public class T02_Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		int temp;
		
		while(true) {
			temp = (int)(Math.random()*45) +1;
			lotto.add(temp);
			if(lotto.size() == 6) break;
		}
		System.out.println("금주의 로또 번호는?");
		for(int su : lotto ) {
			System.out.print(su + "/");
		}
	
 }
}