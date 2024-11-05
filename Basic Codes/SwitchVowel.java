// If the character is A, E, I, O, or U, it is vowel otherwise consonant. It is not case-sensitive.

// The weekday number to calculate the weekday name

import java.util.Scanner;

class SwitchVowel{
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();

		switch(str){

			case "a":
				System.out.println("Vowel");
				break;

			case "e":
				System.out.println("Vowel");
				break;
			
			case "i":
				System.out.println("Vowel");
				break;

			case "o":
				System.out.println("Vowel");
				break;

			case "u":
				System.out.println("Vowel");
				break;

			case "A":
				System.out.println("Vowel");
				break;

			case "E":
				System.out.println("Vowel");
				break;

			case "I":
				System.out.println("Vowel");
				break;

			case "O":
				System.out.println("Vowel");
				break;

			case "U":
				System.out.println("Vowel");
				break;

			default:
				System.out.println("Consonant");
		}

	}
}