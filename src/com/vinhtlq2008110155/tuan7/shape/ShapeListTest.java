/*
* create date Oct 28, 2021
* create time: 11:17:23 AM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeListTest {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();

		Circle circle = new Circle("Circle.AIF");
		Square square = new Square("Square.AIF");
		Triangle triangle = new Triangle("Triangle.AIF");
		Amoeba amoeba = new Amoeba("Amoeba.HIF", 5, 10);

		list.add(circle);
		list.add(square);
		list.add(triangle);
		list.add(amoeba);

		for (Shape shape : list) {
			shape.rotate();
			shape.playSound();
		}

		// for(int i = 0; i < list.size(); i++)
		// {
		// 	Shape shape = list.get(i);
		// 	shape.rotate();
		// 	shape.playSound();
		// }
	}	
}
