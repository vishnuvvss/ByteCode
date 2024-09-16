package forLoopassignment;
import java.util.Scanner;
public class Multiplication{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=sc.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++) {
			prod=number*i;   // the multiplication of number
		
		System.out.println(number+" X "+ n+" = "+prod);
		}
	}
}

