package strategy;

//Context
public class Human {
	private String name;
	private String surname;
	private String id;
	private Transport transport;
	
	public Human(String name, String surname, String id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	public void startDriving() {
		if (transport == null) {
			System.out.println(this.name + " has no transport. The driving is not possible.");
		} else {
			System.out.println(this.name + " gets in the vehicle.");
			transport.drive(this);
			System.out.println(this.name + " exits the vehicle.");
		}
		System.out.println();
		System.out.println();
	}
	
	

}
