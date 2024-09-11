package loops1;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5454,temp=num,rem=0,sum=0;
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
