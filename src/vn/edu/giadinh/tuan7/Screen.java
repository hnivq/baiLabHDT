/*
* create date Oct 18, 2021
* create time: 9:42:43 PM
* author: hinvq
*/
package vn.edu.giadinh.tuan7;

public class Screen {
	public static void main(String[] args) {
		Triangle tamGiac = new Triangle();
		Square vuong = new Square();
		Circle tron = new Circle();
		Amoeba amoeba = new Amoeba("", 5, 10);

		tamGiac.rotate();
		tamGiac.playSound();

		vuong.rotate();
		vuong.playSound();

		tron.rotate();
		tron.playSound();

		amoeba.rotate();
	}
}
