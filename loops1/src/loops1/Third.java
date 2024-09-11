package loops1;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,n=10;
		System.out.println(a);//0
		System.out.println(b);//1
		while(n--!=0) {
		    
			int	c=a+b;//1,2,3,5,8
			a=b;//
			b=c;//swapping and adding for n fibannoci series
			System.out.println(c);
		}
	}

}
