import java.util.*;

class ArmStrongNo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int temp1 = num;
		int temp2 = num;
		int sum = 0;
		while(temp1 != 0){
			count++;
			temp1 = temp1/10;
		}
		while(temp2 != 0){
			int mul = 1;
			int rem = temp2 % 10;
			for(int i =1; i<=count; i++){
				mul = mul * rem;
			}
			sum = sum + mul;
			temp2 = temp2 / 10;
		}
		if(sum == num){
			System.out.println(num + " is a ArmStrong number ");
		}else{
			System.out.println(num + " is not a ArmStrong number ");
		}
	}
}


