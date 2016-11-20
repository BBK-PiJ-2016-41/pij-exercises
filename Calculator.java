public class Calculator {
	public void add (int x, int y) {
		System.out.println(x + y);
	}
	
	public void subtract (int x, int y) {
		System.out.println(x - y);
	}
	
	public void multiply (int x, int y) {
		System.out.println(x * y);
	}

	public void divide (int x, int y) {
		double a = (double) x;
		double b = (double) y;
		System.out.println(a/b);
	}
	
	public void modulus (int x, int y) {
		System.out.println(x % y);
	}
}