package studio7;

public class Fraction {
	
	private int numerator;
	private int denomenator;
	
	public static int count = 0;
	
	public Fraction(int num, int den) {
		numerator = num;
		denomenator = den;
		count++;
		System.out.println("This is fraction number " + count);
	}
	
	public Fraction addition(Fraction add) {
		
		int newNum = this.numerator * add.denomenator + add.numerator * this.denomenator;
		int newDen = this.denomenator * add.denomenator;
		
		return new Fraction(newNum, newDen);
	}
	
	public Fraction multiplication(Fraction multiply) {
		int newNum = this.numerator * multiply.numerator;
		int newDen = this.denomenator * multiply.denomenator;
		return new Fraction(newNum, newDen);
	
	}
	
	public Fraction recip() {
		return new Fraction(-1 * denomenator, numerator);
	}
	
	public String toString() {
		return numerator + " / " + denomenator;
	}
	
	
	public static void main(String[] args) {
		Fraction first = new Fraction(7, 2);
		Fraction second = new Fraction(4, 8);
		System.out.println(first.addition(second).toString());
		System.out.println(first.multiplication(second).toString());
		System.out.println(first.recip().toString());
		
	}

}
