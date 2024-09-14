package loops1;
import java.util.Scanner;
public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num,rem=0,sum=0;
		while(num>0) {
			rem=num%10; 
			sum=sum*10+rem;//  
			num/=10;//  
			
		}
		if(temp==sum) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not Palindrome number");
		}

	}

}
