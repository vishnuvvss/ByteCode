package loops1;
import java.util.Scanner;
public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int i=sc.nextInt();// i value as 2 i.e prime number starts from 2
		while(i<num)
		{
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if(count==1)
			System.out.println(num+" is a not prime number");
		else
			System.out.println(num+" is a prime number");
			
	}
}

}
