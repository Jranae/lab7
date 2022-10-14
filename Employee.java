import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int employee = scan.nextInt(); 
		switch(employee)
		{
	case 100: 
		System.out.println("General Manager");
		break;
	case 200: 
		System.out.println("Supervisor");
		break;
	case 300: 
		System.out.println("Staff");
		break;
	case 400: 
		System.out.println("Contractor");
		break;
	default:
		System.out.println("Invalid");
		}
	}
	
}
