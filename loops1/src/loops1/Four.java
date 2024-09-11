package loops1;

public class Four {
	public static void main(String[] args) {
		int num=40585,temp=num, rem=0,sum=1,strong=0;
		while(num>0) {
			rem=num%10;//5,4
				for(int i=rem;i>0;i--) {
					sum*=i;
				}
			strong+=sum;
			sum=1;
			num/=10;
		}
		if(temp==strong) {
			System.out.println(temp+" Strong number");
		}
		else {
			System.out.println(temp+" Not Strong number");
		}
	}
}
