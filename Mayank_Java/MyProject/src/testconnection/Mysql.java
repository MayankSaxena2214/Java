package testconnection;



public class Mysql {
	
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc");
			System.out.println("Connected");
		}
		catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
}