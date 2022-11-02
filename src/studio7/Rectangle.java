package studio7;

public class Rectangle {

	private double length ;
	private double width ; 
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() { 
		return width;
	}
	
	public double area() {
		
		double area = length * width ; 
		return area; 
	}
	
	public double perimeter() { 
		
		double perimeter = 2 * length + 2 * width;
		return perimeter;
	}
	
	public boolean isSquare() { 
		boolean square = false;
		
		if(length == width) {
			square = true;
		}
		
		return square;
		
	}
	
	public boolean isSmaller(Rectangle compare) {
		boolean isSmaller = false;
		if(this.area() < compare.area()) {
			isSmaller = true;
		}
		
		return isSmaller;
	}
	
	public String toString() {
		return "length is " + length + " and width is " + width;
	}
	
	
		
	public static void main(String[] args) {
		Rectangle r = new Rectangle(7.0, 4.0);
		Rectangle b = new Rectangle(4.0, 4.0);
		System.out.println(r.area());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.perimeter());
		System.out.println(b.isSquare());
		System.out.println(r.isSmaller(b));
		
		
	}

}


