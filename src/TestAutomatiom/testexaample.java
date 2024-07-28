package TestAutomatiom;

public class testexaample {

	public int square(int n) {
		return n*n;
		
	}
	
	public int sum(int a, int b) {
	
		return a+b;
	
	}

	public Boolean isvalid(String password) {
		
		if (password.length()>=5 && password.length ()<=10) {
			return true;
		}else
			return false;
	}
	
	Boolean notnullString(String password) {
		if (password != null) {
			return true;
		
		}else
			return false;
		}
	}
	


