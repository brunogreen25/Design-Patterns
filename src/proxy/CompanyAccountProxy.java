package proxy;

public class CompanyAccountProxy implements Account {
	
	private CompanyAccount companyAccount;
	
	public CompanyAccountProxy(CompanyAccount companyAccount) {
		this.companyAccount = companyAccount;
	}

	@Override
	public String getBalance(SecurityLevel sLvl) {
		if (sLvl == SecurityLevel.EMPLOYEE || sLvl == SecurityLevel.ADMIN) {
			return companyAccount.getBalance(sLvl);
		}
		
		return "ACCESS DENIED";
	}

	@Override
	public String changeBalance(String newBalance, SecurityLevel sLvl) {
		if (sLvl == SecurityLevel.ADMIN) {
			return companyAccount.changeBalance(newBalance, sLvl);
		}
		
		return "ACCESS DENIED";
	}

	
	
}
