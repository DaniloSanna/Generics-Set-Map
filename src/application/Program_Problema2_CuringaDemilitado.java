package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle_Problema2;
import entities.Rectangle_Problema2;
import entities.Shape_Problema2;

public class Program_Problema2_CuringaDemilitado {
	public static void main(String[] args) {
		
		List<Shape_Problema2> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle_Problema2(3.0, 2.0));
		myShapes.add(new Circle_Problema2(2.0));
		
		
		List<Circle_Problema2> myCircles = new ArrayList<>();
		myCircles.add(new Circle_Problema2(3.0));
		myCircles.add(new Circle_Problema2(2.0));
		
		
		System.out.println("Total Area: " + totalArea(myShapes));
		System.out.println();
		System.out.println("Total Area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape_Problema2> list) {
		double sum = 0.0;
		for (Shape_Problema2 s : list) {
			sum+= s.area();
		}
		return sum;
	}

}
