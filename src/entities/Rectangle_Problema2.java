package entities;

public class Rectangle_Problema2 implements Shape_Problema2{
	
	private double width, height;
	
	public Rectangle_Problema2(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public double area() {
		return width*height;
	}
	

}
