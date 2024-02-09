// Check whether the String is Palindrome or not 

import java.util.*;

class PalindromeString{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ");
		String s = sc.nextLine();
		int len = s.length();
		String rev = "";
		
		for(int i = len-1 ; i >= 0 ; i--){
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println(s + " is a palindrome string ");
		}else{
			System.out.println(s + " is not palindrome string ");
		}
	}
}


