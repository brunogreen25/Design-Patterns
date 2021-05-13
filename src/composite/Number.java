package composite;

public class Number extends Component {
	
	private String number;
	
	public Number(String number) {
		this.number = number;
	}
	
	@Override
	public String getNumber() {
		return this.number;
	}
	
	@Override
	public void setNumber(String number) {
		this.number = number;
	}
}
