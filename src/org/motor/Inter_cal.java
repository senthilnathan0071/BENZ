package org.motor;

public class Inter_cal implements Summa,dummy{

	public static void view() {
		System.out.println("fhsjjfhskj");
	}

	@Override
	public  void bike() {
		System.out.println("fazer");
		
	}

	@Override
	public void car() {
		System.out.println("BMW");
		
	}
	

	
	
	public static void main(String[] args) {
		Inter_cal b =new Inter_cal();
		b.bike();
		b.car();
		view();
		b.auto();
		
		

	

}

	@Override
	public void auto() {
		System.out.println("vijay");

	}
}
