/*
* create date Oct 26, 2021
* create time: 1:26:11 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.shape;

public class Shape {
	private String sound;
	protected boolean state = false;

	public Shape(){};

	public Shape(String s){
		sound = s;
	}
	
	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	protected void rotate(){
		System.out.println("Da xoay 360, backlip cac thu"); 
		state = true;	
	}

	protected void playSound(){
		if(state == true)
		{
			System.out.println("Am thanh dang duoc phat: " + sound);
			System.out.println("	***Ket thuc***");
		}
		else
			System.out.println("Co loi!!!");
	}
}

