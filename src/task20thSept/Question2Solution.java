package task20thSept;

public class Question2Solution {
	public static void main(String[] args) {
		/* Ternary Operators to handle multiple conditions.
         Input → int score = 85
         String grade → 
         score >= 90 → A 
         score >= 80 → B
         score >= 70 → C 
		 */
		
		byte score = 89;
		String message = "Invalid score value";
		String grade = (score >= 90) ? "A" : (score >= 80 && score < 90) ? "B" : (score < 80 && score >= 70) ? "C" : message;
		System.out.println(grade);
	}

}
