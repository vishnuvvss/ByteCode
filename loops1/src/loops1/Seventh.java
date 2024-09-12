package loops1;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=31;
		int count=0;
		int i=2;
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
