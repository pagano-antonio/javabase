package example.patternproxytre;

public class IdentityManager {
	 
    //Oggetto DAO che si connettera' ad un Identity Manager
    public static boolean checkUser(String username, String password) {
        return (username.equals(password)) ? true : false;
    }
 
}