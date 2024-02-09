import java.util.*;
class Occ{
	public static int Occurences(String s1 , String s2){
		int count = 0;
		int lastIndex = 0;

		while(lastIndex != -1){
			lastIndex = s1.indexOf(s2,lastIndex);
			if(lastIndex != -1){
				count++;
				lastIndex = lastIndex + s2.length();
			}
		}
		return count;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int fre = Occurences(s1, s2);
		System.out.println("Number of occurences = " + fre);

	}
}

		
