package abstractFactory;

//ova klasa moze bit i abstract (te da je greet() abstract metoda), jer klijent ionako nece instancirat Dog
//ako klijent moze vidit Dog, moze ovo ne bit apstraktna klasa i ovdje ce se morat overrideat greet(), pa makar prazna metoda
public abstract class Dog implements Animal {

	@Override
	public void updateOnLife() {
		System.out.println("I am a dog!");
	}
}
