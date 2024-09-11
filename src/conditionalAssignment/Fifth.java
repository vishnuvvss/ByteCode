package conditionalAssignment;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2018;
		String month="February";
		switch(month) {
			case "January" :
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
				System.out.println("31 Days");
				break;
			case "April":
			case "June":
			case "September":
			case "November":
				System.out.println("30 Days");
				break;
		
			case "February":
				
				if(year%4==0 && year%100!=0 || year%400==0)
					System.out.println("29 Days");
				else
					System.out.println("28 Days");
				
				break;
		}
	}
}

