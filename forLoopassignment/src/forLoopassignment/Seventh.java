package forLoopassignment;
import java.util.Scanner;
public class Seventh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int div=sc.nextInt();
		
		for(int i=5;i<=100;i++)
		{
		   if(i%div==0) {
		        System.out.println(i+" is divisible to 5");
		  }
	       }
	}
}
