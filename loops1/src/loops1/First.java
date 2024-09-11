package loops1;

public class First {
	public static void main(String args[]) {
	int num=101,count=0;
	while(num>0)// 101>0,10>0,1>0
	{
		int rem= num%10; // 10.1,1.0,0.1
		count++;
		num/=10; // 10,1,o
	}
	System.out.println(count);
	}
}
