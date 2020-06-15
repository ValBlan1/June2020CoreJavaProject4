package inheritanceAndEncapsulation;

public class CoffeeCups extends TestCoffeeCups {
	
	private String color;
	public char[] setColor;
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String getColor() {
		return color;
		
	}
	public void theNashvilleCup() {
		System.out.println("The Nashville cup is" + color);
	}


}
