/*
* create date Oct 28, 2021
* create time: 8:41:03 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan8;

public class Emloyee extends Person{
	protected int salary;
	public String toString(){
		String s;
		s = name + "," + birtday;
		s += "," + salary;
		return s;
	}
}
