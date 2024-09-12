package t19_database.t01_Connection;

public class Test2Run {
	public static void main(String[] args) {
	Test2DAO dao =	new Test2DAO();
		
		

		Test2Service service = new Test2Service();
		
		service.getDBProcessMethod();
		
		dao.dbClose();
		
		System.out.println("작업끝.....");
	}
}
