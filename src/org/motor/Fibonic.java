package org.motor;

public class Fibonic {

	public static void main(String[] args) {

	//	0 1 1 2 4 8 
		int a =0, b=1, temp=0;
		System.out.println(a+" "+b);
		
		for (int i = 0; i < 10; i++) {
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
		}
	}

}
