package abstractFactory;

//ova klasa moze bit i abstract (te da je greet() abstract metoda), jer klijent ionako nece instancirat Cat
//ako klijent moze vidit Cat, moze ovo ne bit apstraktna klasa i ovdje ce se morat overrideat greet(), pa makar prazna metoda
public abstract class Cat implements Animal {
	
	//Sve macke koji ovo overridaju; klijent nece moc vidit metode macke "greet()"

	@Override
	public void updateOnLife() {
		System.out.println("I am a cat!");
	}
}
