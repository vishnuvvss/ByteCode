package loops1;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=25;
		Boolean flag=false;
		int i=2;
		while(i<num)
		{
			if(num%i==0) {
				flag=true;
				break;
			}
			i++;
		}
		if(flag==true)
			System.out.println(num+" is a not prime number");
		else
			System.out.println(num+" is  prime number");
			

	}

}
