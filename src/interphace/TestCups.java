package interphace;

public class TestCups implements Cups {
	
	public static void main(String[] args) {
		TestCups c1 = new TestCups();
		c1.nashvilleCup();
		
	}

	@Override
	public void nashvilleCup() {
		System.out.println("The Nashvile Cup");
		
		
	}

}
