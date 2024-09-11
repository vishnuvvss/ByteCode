package conditionalAssignment;

public class Second {

	public static void main(String[] args) {
		int a=12,b=13,c=9;
		if(a>b && a>c) {
			System.out.println(a+" is a largest number");
			
		}
		else if(b>c) {
			System.out.println(b+" is a largest number");
		}
		else {
			System.out.println(c+" is a largest number");
		}

	}

}
