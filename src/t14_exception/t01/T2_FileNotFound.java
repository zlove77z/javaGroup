package t14_exception.t01;

public class T2_FileNotFound {
	public static void main(String[] args) {
		// java.lang.Object
		
	try {
		Class.forName("java.lang.Object2");
		System.out.println("찾는 파일이 존재합니다");
	//} catch (ClassNotFoundException e) {
	} catch(ClassNotFoundException e) {
		//System.out.println("찾는 파일이 없습니다");
		//e.printStackTrace();
	  //System.out.println(e.getMessage());
		System.out.println("파일검색실패 : " +e.getMessage());
	} finally {
		System.out.println("작업끝...");
	}
		
	}
}
