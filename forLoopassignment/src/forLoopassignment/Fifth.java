package forLoopassignment;

public class Fifth {
	public static void main(String[] args) {
		int n=30,even=0,odd=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
			else {
				odd+=i;
			}
		}
		System.out.println(odd+even);
	}

}
