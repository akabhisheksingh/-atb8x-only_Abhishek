package LearningJava;

public class task16thSeptJava {
	public static void main(String[] args) {
		/*
		 * 1. = it is an assignment operator and it is used to assign the value on the
		 * right variable to the variable on left. == It is an equal operator and which
		 * is used for compare the two value or operand. In this case it check the two
		 * values or operand are equal r not.
		 * 
		 * 2. byte b = 10; long l = 10l; → How much Byte will be used? byte b = 10; 1
		 * Byte, 8 bits of memory will be used long l = 10l; 8 Bytes, 64 bits of memory
		 * will be used
		 * 
		 */
		// *******************************Question 3*******************************
		byte b = 10;
		byte c = 10;
		System.out.println(b + c);// 20
		// System.out.println(b+c + " is of type " +
		// ((Object)(b+c)).getClass().getSimpleName());// Integer type data
		// *********************************Question 4*******************************
		short s = 10;

		char cd = 'A'; // 65

		int ss = s + cd;

		System.out.println(ss);// 75
	}

}
