package ex01;

public class Main {

	public static void main(String[] args) {
		Shape s = new Circle(10, 20);
		s.draw();
		s = new Rectangle(30, 40);
		s.draw();
		s  = new Shape(0,0);
		s.draw();
	}
}

class Shape {
	private int x;
	private int y;
	
	public Shape() {}
	public Shape(int x, int y) {
		this.x= x;
		this.y = y;
	}
	
	public int getX() {	return x; }
	
	public int getY() { return y; }
	
	public void draw() {
		System.out.printf("도형을 (%d,%d)에 그립니다.\n", x, y);
	};
}

class Circle extends Shape{

	public Circle(int x, int y) {
		super(x,y);
	}
	@Override
	public void draw() {
		System.out.printf("원을 (%d,%d)에 그립니다.\n", getX(), getY());
	}	
}

class Rectangle extends Shape{
	public Rectangle(int x, int y) {
		super(x,y);
	}
	@Override
	public void draw() {
		System.out.printf("사각형을 (%d,%d)에 그립니다.\n", getX(), getY());
	}
}








