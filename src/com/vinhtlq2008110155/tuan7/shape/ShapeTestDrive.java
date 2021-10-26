/*
* create date Oct 26, 2021
* create time: 1:39:25 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.shape;

public class ShapeTestDrive {
	public static void main(String[] args) {
		Circle tron = new Circle("Circle sound");
		Square vuong = new Square("Square sound");
		Triangle tamGiac = new Triangle("Triangle sound");
		Amoeba amoeba = new Amoeba("Amoeba Sound", 5, 10);

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
