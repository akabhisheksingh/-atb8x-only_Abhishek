package LearningJava;

public class task18thSeptJava {
	public static void main(String[] args) {
		// *******************Implicit Widening**********************
		byte b = 124;
		System.out.println(b);
		int i = b;
		System.out.println(i);
		float f = i;
		System.out.println(f);

		// ***Explicit Widening**************************************************
		int i1 = (int) b;
		double d = (double) i1;
		System.out.println(d);

		// **************************Narrowing***********************
		// loss of data -- data loss
		int t = 987;
		byte b2 = (byte) t;
		System.out.println(b2);

		float fy = 678.90f;
		int it = (int) fy;
		System.out.println(it);

		int k = 6;
		// byte bk =k; // implicit narrowng is not allowed (Type mismatch: cannot
		// convert from int to byte)
		byte bt = (byte) k;
		System.out.println(bt);
		// byte b6 = t; //Narrowing is not possible in this case
		// *************************Question 2*************************
		int a = 10;
		System.out.println(--a + a-- + a--);
		/*
									 * a =10; pre decrement -- value of a becomes to 9+9 post decrement 9+9+8= 26
									 */
		System.out.println(a);// 7

		// ***********************************Question 3*****************
		int a1 = 10;
		System.out.println(--a1 + a1++ + a1--);// 28
		/*
		 * --a =9 a++= 9 a1--=10
		 */
		System.out.println(a1);// 9

		// ****************************Question 4*************************

		int c = 10;
		System.out.println(c-- + c-- + c--);// 27
		System.out.println(c);// 7

	}

}
