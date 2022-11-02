package studio7;

public class Complex {
	
	private double real;
	private double fake;
	
	public Complex(double r, double f) {
		real = r;
		fake = f;
	}
	
	public String toString() {
		return real +  " + " + fake + "i ";
	}
	
	public Complex add(Complex add) {
		return new Complex(this.real + add.real, this.fake + add.fake);
	}
	
	public Complex multiply(Complex mult) {
		return new Complex(this.real * mult.real - this.fake * mult.fake, this.real * mult.fake + mult.real * this.fake);
	}

	public static void main(String[] args) {
		Complex first = new Complex(7.0, 3.0);
		Complex second = new Complex(3.0, 6.0);
		System.out.println(first.add(second).toString());
		System.out.println(first.multiply(second).toString());
		
	}

}
