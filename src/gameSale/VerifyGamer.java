package gameSale;

public class VerifyGamer {
	public static Boolean Verify(User user, Customer customer) {
		if(user.getNationalIdentity() == customer.getNationalIdentity()) {
			return true;
		}
		
		return false;
	}

}
