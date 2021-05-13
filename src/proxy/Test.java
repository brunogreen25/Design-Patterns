package proxy;

public class Test {
	
	public static void main(String[] args) {
		//testWithoutProxy();
		testWithProxy();
	}
	
	public static void testWithProxy() {
		Account companyAccount = new CompanyAccountProxy(new CompanyAccount());
		
		Client user = new Client(SecurityLevel.USER, companyAccount);
		System.out.println("User can see the balance " + user.tryToDisplayTheBalance());
		System.out.println("User has changed the balance: " + user.tryToChangeTheBalance("100f"));
		System.out.println();
		
		Client employee = new Client(SecurityLevel.EMPLOYEE, companyAccount);
		System.out.println("Employee can see the balance " + employee.tryToDisplayTheBalance());
		System.out.println("Employee has changed the balance: " + employee.tryToChangeTheBalance("50f"));
		System.out.println();
		
		Client admin = new Client(SecurityLevel.ADMIN, companyAccount);
		System.out.println("Admin can see the balance " + admin.tryToDisplayTheBalance());
		System.out.println("Admin has changed the balance: " + admin.tryToChangeTheBalance("0f"));
		System.out.println();
	}
	
	public static void testWithoutProxy() {
		Account companyAccount = new CompanyAccount();
		
		Client user = new Client(SecurityLevel.USER, companyAccount);
		System.out.println("User can see the balance " + user.tryToDisplayTheBalance());
		System.out.println("User has changed the balance: " + user.tryToChangeTheBalance("100f"));
		System.out.println();
		
		Client employee = new Client(SecurityLevel.EMPLOYEE, companyAccount);
		System.out.println("Employee can see the balance " + employee.tryToDisplayTheBalance());
		System.out.println("Employee has changed the balance: " + employee.tryToChangeTheBalance("50f"));
		System.out.println();
		
		Client admin = new Client(SecurityLevel.ADMIN, companyAccount);
		System.out.println("Admin can see the balance " + admin.tryToDisplayTheBalance());
		System.out.println("Admin has changed the balance: " + admin.tryToChangeTheBalance("0f"));
		System.out.println();
	}

}
