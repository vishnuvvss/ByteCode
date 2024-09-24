package loops1;
import java.util.Scanner;
public class Fibanocci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); // 1st tern in series
		int b=sc.nextInt(); // 2nd term in series
		int n=sc.nextInt(); // for series range upto 'n' th  term
		System.out.println(a);//0
		System.out.println(b);//1
		while(n--!=0) {
		    
			int c=a+b;//  1,2,3,5,8
			a=b;//
			b=c;//swapping and adding for n fibannoci series
			System.out.println(c);
		}
	}

}
