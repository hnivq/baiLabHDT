/*
* create date Oct 21, 2021
* create time: 9:08:43 PM
* author: hinvq
*/
package vn.edu.giadinh.tuan9;

public class Dog extends Canine{
	/**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Dog(String picture, String food, int hunger) {
		super(picture,food,hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Chó con cute đang kêu !!!");
	}

	@Override
	protected void eat() {
		System.out.println("Chó con cute đang ăn ngon lành");
	}

	void chaseCat(){
		System.out.println("Hoàng thượng đang bị cún con đuổi");
	}
}
