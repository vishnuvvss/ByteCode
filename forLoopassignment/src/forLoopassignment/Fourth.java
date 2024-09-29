package forLoopassignment;
import java.util.Scanner;
public class Fourth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=0;	// starting number
		int n=sc.nextInt(); //ended number
		for(m=sc.nextInt();m<=n;m++) {
			if(m%2==0)
			 System.out.println(m); // printing m to n with divisble by 2 or even number between m and n
		}
	}
}
