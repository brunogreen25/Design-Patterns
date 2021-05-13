package builderSimple;

public class Test {
	public static void main(String[] args) {
		HouseBuilder houseBuilder = new HouseBuilder();
		houseBuilder.setDoorNumber(4).setGarage("Huge").setPool("Golden");
		House house = houseBuilder.getHouse();
		
		System.out.println(house);
	}
}
