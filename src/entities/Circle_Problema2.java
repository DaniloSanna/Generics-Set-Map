package entities;

public class Circle_Problema2 implements Shape_Problema2{
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public Circle_Problema2(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.pow(radius, 2)*Math.PI;
	}
	
}
