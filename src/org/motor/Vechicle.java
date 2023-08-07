package org.motor;

public class Vechicle {//1

	public final void bike() {
		System.out.println("pulsar");

	}

	public void yamaha() {
		System.out.println("R15");

	}

	public static void main(String[] args) {

	}

}


 class  Wheeler extends Vechicle{//2

	public void car() {
		System.out.println("Audi");
	}

	public static void main(String[] args) {
		Wheeler a =new Wheeler();
		a.bike();
		a.yamaha();
a.car();
	}

}
 
// class Electric extends Wheeler{//3
//	 
//	 public void prana() {
//		System.out.println("Electric");
//		
//}
//	 
//public static void main(String[] args) {
//	Electric z =new Electric();
//	
//	z.bike();
//	z.car();
//	z.prana();
//			}	
//
// }
// 
// //Child 1
// 
// class Race extends Electric{
//	 
//	 public void dubai() {
//		 
//		 System.out.println("F1");
//	 }
// }
// //child 2
// 
// class Summa extends Electric{
//	 public void coal() {
//		 System.out.println("4644");
//	 }
// }