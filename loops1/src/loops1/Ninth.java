package loops1;

public class Ninth {

	public static void main(String[] args) {
		int i=3;
		System.out.println("The prime numbers:");
		while(i<=20) {
			Boolean a=false;
			int b=2;
			while(b<i/2) {
				if(i%b==0) {
					a=true;
					break;}
				b++;
			}
			if(!a) {
				System.out.println(i);
			}
			
			i++;
		

		}
	}

}
