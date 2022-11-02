package studio7;

public class Die {
	
	private int sides;
	
	public Die(int s) {
		sides = s;
	}
	
	public int roll() {
		int roll = (int)(Math.random() * (sides) + 1);
		
		return roll;
	}
	
	public String toString() {
		return "this die has " + sides + " sides";
	}

	public static void main(String[] args) {
		Die sixSided = new Die(6);
		Die nineSided = new Die(9);
		Die twelveSided = new Die(12);
		System.out.println(sixSided.roll());
		System.out.println(nineSided.roll());
		System.out.println(twelveSided.roll());

	}

}
