package task25thSept;

import java.util.Scanner;

public class CountTheVowelAndConstant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message in string form");
		String st = sc.next(); 
		char st1[] = st.toLowerCase().toCharArray(); 
		int countVowel=0;
		int countConstant=0; 
		for(int i=0; i<st1.length; i++) {
			if(st1[i]=='a'||st1[i]=='e'||st1[i]=='i'||st1[i]=='o'||st1[i]=='u') {
				countVowel++;
			} else {
				countConstant++;
			}
		}
		System.out.println("v= "+countVowel+" "+"c= "+countConstant);
	}

}
