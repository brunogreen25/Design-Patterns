package proxy;

public class CompanyAccount implements Account {
	
	private Float balance = 1000f;

	@Override
	public String getBalance(SecurityLevel sLvl) {
		return this.balance.toString();
	}

	@Override
	public String changeBalance(String newBalance, SecurityLevel sLvl) {
		String oldBalance = this.balance.toString();
		this.balance = Float.valueOf(newBalance);
		return oldBalance + " => " + this.balance;
	}
}
