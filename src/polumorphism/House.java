package polumorphism;

public class House extends exampleHouse {
	
	String House;
	public void sayName() {
		System.out.println("My name!");
	}
	
	public void sayName (String House) {
		System.out.println("Who lives in the" + House );
		
	}
	public static void main(String[] args) {
		 House whiteHouse = new House();
		 whiteHouse.presidentialHouse();
	}
	
}