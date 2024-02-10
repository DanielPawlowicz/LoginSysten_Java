
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDandPasswords IdaP = new IDandPasswords();
		
		LoginPage loginpage = new LoginPage(IdaP.getLoginInfo());
		
	}

}
