package forLoopassignment;
import java.util.Scanner;
public class Ninth {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		square=1; //  to square n numbers
		for(int i=1;i<=n;i++) {
			square=i*i;
			System.out.println("The square of "+i+":"+square);
			
		}
	}

}
