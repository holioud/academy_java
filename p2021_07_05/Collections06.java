package p2021_07_05;

import java.util.Vector;

class Car1 {
	String color;
	static int    speed;
	void   print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		System.out.println("-------------------");
	}
}

public class Collections06 { 
	public static void main (String[] args) {
		int a  = 10;
		int b  =  2;
		
		try {
			System.out.print(a/b + " ");
		} catch(ArithmeticException e1) {
			System.out.print("Divide By Zero ");
		} catch(Exception e2) {
			System.out.print(" Exception");
         	} finally {
			System.out.print(" done");
     	       }
	}
}
