public class CoffeeMaker {
	private int waterMililiters;
	private int beansGrams;
	private boolean isPoweredOn;
	
	public CoffeeMaker () {
		waterMililiters = 0;
		beansGrams	= 0;
		isPoweredOn = false;
	}
	
	public CoffeeMaker (int water, int beans) {
		this();
		if (water > 0)
			waterMililiters = water;
			
		if (beans > 0)
			beansGrams = beans;
	}
	
	public void turnOn () {
		isPoweredOn = true;
	}
	
	public void turnOff () {
		isPoweredOn = false;
	}
	
	public void addWater (int amount) {
		if (amount > 0)
			waterMililiters += amount;
			
		else
			System.out.println("Ensure amount is positive");
	}
	
	public void addBeans (int amount) {
		if (amount > 0)
			beansGrams += amount;
	}
	
	public void brew () {
		if (waterMililiters >= 240 && beansGrams >= 15 && isPoweredOn)
		{
			waterMililiters -= 240;
			beansGrams -= 15;
			System.out.println("Brewing a delicious cup of coffee!");
		}
		
		else if (!isPoweredOn)
			System.out.println("Cannot brew. Machine is off.");
			
		else
			System.out.println("Not enough resources to brew.");
	}
	
	public boolean getPower () {
		return isPoweredOn;
	}
	
	public int getWater () {
		return waterMililiters;
	}
	
	public int getBeans () {
		return beansGrams;
	}
	
	public void displayStatus () {
		System.out.print("Status: ");
		if (isPoweredOn)
			System.out.print("ON");
			
		else
			System.out.print("OFF");
	
		System.out.print(" | Water: " + waterMililiters + " ml | Beans: " + beansGrams + " g");
		System.out.println("");
	}
}