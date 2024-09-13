package loops1;
import java.util.Scanner;
public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,i=1;
	
		while(i<=num/2) {	
			
			if(num%i==0) {
				sum+=i; 
				}
		i++;
	  }
		if(sum==num) {
			System.out.print(num+" is a perfect number");
		}
		else {
			System.out.println(num+" is Not a perfect number");
		}

	}

}
