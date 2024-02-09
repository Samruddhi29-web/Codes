import java.io.*;

class Comp{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int str = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		
		for(int i = str; i<=end; i++){
			int count = 0;
			for(int j = 1; j*j<=i ; j++){
				if(i%j == 0){
					count++;
				}
			}
			if(count >= 2){
				System.out.println(i);
			}
		}
	}
}

