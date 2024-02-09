import java.io.*;
class Per{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		for(int i =n1; i<= n2; i++){
			for(int j= 1; j*j<=i ; j++){
				if(j*j == i){
					System.out.println(i);
				}
			}
		}
	}
}



