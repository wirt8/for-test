package copy.models;

public class DataManagement {
	public static boolean checkUser(String username, String password) {
		if(username.equals("tqthang") && password.equals("1111")) {
			return true;
		}
		return false;
	}
}
