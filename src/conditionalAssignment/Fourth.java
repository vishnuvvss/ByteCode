package conditionalAssignment;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=87;
		if(marks>=85) {
			System.out.println("A+ Grade");
			
		}
		else if(marks>=75 && marks<=84) {
			System.out.println("A Grade");
	}
	    else if(marks>=65 && marks<=74) {
		System.out.println("B+ Grade");
	}
	else if(marks>=55 && marks<=64) {
		System.out.println("B Grade");
	}
	else if(marks>=45 && marks<=54) {
		System.out.println("C Grade");
	}
	else {
		System.out.println("Fail");
		}
	}

}
