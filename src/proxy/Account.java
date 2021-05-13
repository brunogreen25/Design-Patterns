package proxy;

public interface Account {
	public String getBalance(SecurityLevel sLvl);
	public String changeBalance(String newBalance, SecurityLevel sLvl);
}
