package loops1;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100,count=0,rem=0,sum=0,temp=n;
		
		for(int i=1;i<=n;i++) {
			temp=i;
		while(i>0){
			count++;
			i/=10;
		}
	
		while(temp>0) {
			rem=n%10;
			sum=(int)(sum+Math.pow(rem, count));
			n/=10;
		}
		
		if( temp== sum) {
			System.out.println(temp+"is a armstrong number");
		}

		}
	}
	

}
