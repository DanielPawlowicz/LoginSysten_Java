import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Bro", "Pizza");
		logininfo.put("Dan", "Hello");
		logininfo.put("Michael", "qwerty");
		
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
	
}
