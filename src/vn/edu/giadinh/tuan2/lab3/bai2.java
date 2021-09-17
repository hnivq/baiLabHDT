package vn.edu.giadinh.tuan2.lab3;


import java.util.Formatter;

public class bai2{
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++){
			System.out.println();
			for(int j = 1; j <= 10; j++){
		    		System.out.printf("%d * %2d = %2d\n", i, j, i * j);
			}
		}
	    }
}
