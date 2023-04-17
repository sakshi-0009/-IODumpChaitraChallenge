package ChaitraChallenge;
import java.io.*;
public class Day23 {

	public static void main(String[] args)throws IOException{  
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Num1 : ");
	int Num1 = Integer.parseInt(br.readLine());
	System.out.println("Enter Num2 : ");
	int Num2 = Integer.parseInt(br.readLine());
	int Temp, GCD=0;  
	while(Num2 != 0){  
	Temp = Num2;  
	Num2 = Num1 % Num2;  
	Num1 = Temp;  
	}  
	GCD = Num1;  
	System.out.println("GCD of entered numbes is : "+ GCD);  
	}
}
