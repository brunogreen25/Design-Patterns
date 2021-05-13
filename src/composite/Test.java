package composite;

//only for 1-digit int numbers entry
//evaluates from right to left 
public class Test {
	public static void main(String[] args) {
		Component exp1 = new Composite("3+2*2+3");	//13
		System.out.println(exp1.getNumber());
		
		Component exp2 = new Composite("3+2/1+1");	//4
		System.out.println(exp2.getNumber());
		
		Component exp3 = new Composite("3+4/2-1");	//7
		System.out.println(exp3.getNumber());
		
		Component exp4 = new Composite("3-1");	//2
		System.out.println(exp4.getNumber());
	}
}
