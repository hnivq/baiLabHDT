/*
* create date Oct 21, 2021
* create time: 10:13:57 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan7;

public class IntSquare {
	private int squareValue;

	public IntSquare(int value){
		squareValue = value;
	}

	public int getSquare(){
		return calculateSquare();
	}

	private int calculateSquare(){
		return (int) Math.pow(squareValue, 2);
	}
}
