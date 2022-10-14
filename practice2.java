
import java.util.*;
public class practice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of gas");
		double level = scan.nextDouble();
		System.out.println("Enter the capacity of your tank");
		double c = scan.nextDouble();
		double 1 = level/c;
		
		if (1<.25)
			System.out.println("The level is "+1+" less than a quater of a tank");
		
		else if (1<.50 && 1>.25)
			System.out.println("less than a half of a tank");
		
		else if (1<.75 && 1>.50)
			System.out.println("less than three quarters of a tank");
		
		else 
			System.out.println("Almost full");
	
		
	}

}
