/*
* create date Oct 18, 2021
* create time: 9:42:43 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan6;

public class Screen {
	public static void main(String[] args) {
		Triangle tamGiac = new Triangle();
		Square vuong = new Square();
		Circle tron = new Circle();

		tamGiac.rotare();
		tamGiac.playSound();

		vuong.rotare();
		vuong.playSound();

		tron.rotare();
		tron.playSound();
	}
}
