/*
* create date Oct 26, 2021
* create time: 1:39:25 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.shape;

public class ShapeTestDrive {
	public static void main(String[] args) {
		Circle tron = new Circle("Circle.AIF");
		Square vuong = new Square("Square.AIF");
		Triangle tamGiac = new Triangle("Triangle.AIF");
		Amoeba amoeba = new Amoeba("Amoeba.HIF",5, 10);
		

		tron.rotate();
		tron.playSound();

		vuong.rotate();
		vuong.playSound();

		tamGiac.rotate();
		tamGiac.playSound();

		amoeba.rotate();
		amoeba.playSound();
	}	
}
