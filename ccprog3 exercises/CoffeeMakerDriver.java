public class CoffeeMakerDriver {
	public static void main (String[] args) {
		CoffeeMaker maker = new CoffeeMaker(300, 20);
		
		maker.displayStatus();
		maker.brew();
		maker.turnOn();
		maker.brew();
		maker.displayStatus();
		maker.brew();
		maker.addWater(300);
		maker.addBeans(15);
		maker.brew();
	}
}