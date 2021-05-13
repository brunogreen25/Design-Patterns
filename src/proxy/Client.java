package proxy;

public class Client {
	private SecurityLevel securityLvl;
	private Account account;
	
	public Client(SecurityLevel securityLvl, Account account) {
		this.securityLvl = securityLvl;
		this.account = account;
	}
	
	public String tryToDisplayTheBalance() {
		return account.getBalance(this.securityLvl);
	}
	
	public String tryToChangeTheBalance(String newBalance) {
		return account.changeBalance(newBalance, this.securityLvl);
	}
}
